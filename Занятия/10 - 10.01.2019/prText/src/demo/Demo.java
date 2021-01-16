package demo;

public class Demo {

    public static void main(String[] args) {
        Word w1 = new Word("apple", (byte) 1);
        Word w2 = new Word("play", (byte) 2);
        System.out.println("w1=" + w1);
        System.out.println("w2=" + w2);

        Sentence s1 = new Sentence();
        System.out.println("s1=" + s1);
        s1.add(w1);
        s1.add(new Word("tree", (byte) 1));
        s1.add(new Word("grows", (byte) 2));
        s1.setTerminalChar('!');
        System.out.println("s1=" + s1);

        Text t1 = new Text("Unknown");
        t1.add(s1);
        t1.add(s1);
        t1.add(s1);
        System.out.println("t1=\n" + t1);

    }
}
