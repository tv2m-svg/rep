package task63;

public class Demo {

    public static void main(String[] args) {
        Subject s1 = new Subject("MA",120);
        Subject s2 = new Subject();
        Subject s3 = new Subject("MA",120);
        
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        
        System.out.println("s1==s3 " + s1.equals(s3));

    }

}
