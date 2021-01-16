package prtask36;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListCellRenderer;
import javax.swing.ListSelectionModel;

public class ExamPanel extends JPanel {

    private ExamList examList;
    private ExamListModel examListModel;
    private JList<Exam> list;

    public ExamPanel() {
        examList = new ExamList();
        examList.add(new Exam(111, "MA", 7));
        examList.add(new Exam(222, "MA", 9));
        examList.add(new Exam(111, "GA", 8));
        
        examListModel = new ExamListModel(examList);
        list = new JList(examListModel);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        //list.setBorder(BorderFactory.createLineBorder(Color.black));
        //list.setPreferredSize(new Dimension(200,100));

        JScrollPane sp = new JScrollPane(list);
        sp.setPreferredSize(new Dimension(200, 100));
        this.add(sp);

        JButton butAdd = new JButton("Add");
        butAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                examListModel.addElement(new Exam(13, "eng", 10));
            }
        });
        this.add(butAdd);
        
        JButton butShow = new JButton("Show");
        butAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(examList);
                System.out.println("SET=" + examList.calculateSubjects());
            }
        });
        this.add(butShow);

        list.setCellRenderer(new ListCellRenderer<Exam>() {
            @Override
            public Component getListCellRendererComponent(JList<? extends Exam> list, Exam value, int index, boolean isSelected, boolean cellHasFocus) {
                JLabel label = new JLabel(String.format("%5d %10s %3d", value.getNumber(),
                        value.getSubject(), value.getMark()));

                label.setHorizontalAlignment(JLabel.RIGHT);

                if (isSelected) {
                    label.setForeground(Color.red);
                }

                if (value.getMark() >= 9) {
                    label.setIcon(new Icon() {
                        private int width = 16, height = 16;

                        @Override
                        public void paintIcon(Component c, Graphics g, int x, int y) {
                            g.setColor(Color.green);
                            g.fillOval(x, y, width, height);
                        }

                        @Override
                        public int getIconWidth() {
                            return width;
                        }

                        @Override
                        public int getIconHeight() {
                            return height;
                        }
                    });
                }

                return label;
            }

        });
    }
}
