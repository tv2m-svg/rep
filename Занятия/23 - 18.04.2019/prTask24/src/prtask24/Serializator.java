package prtask24;

import java.io.*;

public class Serializator {

    public void simpleSerialization(ExamList exams, String fileName)
            throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream(fileName));
        out.writeObject(exams);
        out.close();
    }

    public ExamList simpleDeserialization(String fileName)
            throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));
        ExamList result = (ExamList) in.readObject();
        in.close();
        return result;
    }

    public boolean serialization(ExamList exams, String fileName) {
        boolean flag = false;
        File f = new File(fileName);
        ObjectOutputStream ostream = null;
        try {
            FileOutputStream fos = new FileOutputStream(f);
            if (fos != null) {
                ostream = new ObjectOutputStream(fos);
                ostream.writeObject(exams); // сериализация
                flag = true;
            }
        } catch (FileNotFoundException e) {
            System.err.println("Файл не может быть создан: " + e);
        } catch (NotSerializableException e) {
            System.err.println("Класс не поддерживает сериализацию: " + e);
        } catch (IOException e) {
            System.err.println(e);
        } finally {
            try {
                if (ostream != null) {
                    ostream.close();
                }
            } catch (IOException e) {
                System.err.println("ошибка закрытия потока");
            }
        }
        return flag;
    }

}
