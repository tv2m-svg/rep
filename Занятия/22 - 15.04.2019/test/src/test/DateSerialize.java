
package test;


import java.io.*;
import java.util.Date;

public class DateSerialize {

    public static void main(String args[]) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(
		new FileOutputStream("objects.dat"));
        Date now = new Date(System.currentTimeMillis());
        out.writeObject(now);
        out.close();
    }
}

