package exam;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Garage extends ArrayList<Automobile> {

    List<Automobile> list = new ArrayList<>();

    public void addAuto(Automobile auto) throws Exception {
        for (Automobile car : list) {
            if (car.getTitle().equals(auto.getTitle())) {
                throw new Exception("Есть одинаковые машины");
            }
        }
        list.add(auto);
    }

    public void deleteAuto(String title) {
        Automobile auto = null;
        for (Automobile car : list) {
            if (car.getTitle().equals(title)) {
                auto = car;
            }
        }
        list.remove(auto);
    }
    
    public static String toPrint(List<Automobile> list) {
        StringBuffer sb = new StringBuffer("Garage {\n");
        for (Automobile auto : list) {
            sb.append('\t')
                    .append(auto)
                    .append('\n');
        }
        sb.append("}\n");
        return sb.toString();
    }

    @Override
    public String toString() {
        return Garage.toPrint(list);

    }

    public String titleSort() {
        List<Automobile> list1 = new ArrayList<>();
        list1 = list;
        Collections.sort(list1);
        return Garage.toPrint(list1);
    }

    public String byFuel(Fuel fuel) {
        List<Automobile> list2 = new ArrayList<>();
        for (Automobile auto : list) {
            if (auto.getFuel() == fuel) {
                list2.add(auto);
            }
        }
        return Garage.toPrint(list2);
    }

    public int countColor(String color) {
        int i = 0;
        for (Automobile auto : list) {
            if (auto.getColor().equals(color)) {
                i = i + 1;
            }
        }
        return i;
    }
    
    public void writeToTextFile(String fileName) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(fileName);
        for (Automobile auto : list) {
            pw.println(auto.writeToText());
        }
        pw.close();
    }
}
