package prTask36;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializator {

    public void simpleSerialization(ExamList exams, String fileName) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream(fileName));
        out.writeObject(exams);
        out.close();
    }

    public ExamList simpleDeserialization(String fileName) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));
        ExamList result = (ExamList) in.readObject();
        return result;
    }

  }
