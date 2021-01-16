package eaxm;

import java.util.*;

public class main {

    public static void main(String[] args) {

        List<Point2> points = new ArrayList<>();

        Point2 t1 = new Point2(1, 1);
        Point2 t2 = new Point2(2, 1);
        Point2 t3 = new Point2(1, 2);
        Point2 t4 = new Point2(3, 4);
        Point2 t5 = new Point2(2, 100);

        points.add(t1);
        points.add(t2);
        points.add(t3);
        points.add(t4);
        points.add(t5);

        System.out.println("points = ");
        for (Point2 p : points) {
            System.out.println(p);
        }

        //Поиск точки с максимальным удалением от (0,0)
        Point2 max = new Point2(0,0);
        for (int i = 0; i < points.size() - 1; i++) {
            if(points.get(i).distance(new Point2(0,0)) < points.get(i+1).distance(new Point2(0,0)))
                max = points.get(i+1);
        }
        System.out.println("Самая удалённая точка= " + max);
    }

}
