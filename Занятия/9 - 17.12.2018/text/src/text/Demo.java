
package text;


public class Demo {

    
    public static void main(String[] args) {
        Word w1 = new Word("apple",(byte)1);
        Word w2 = new Word("play",(byte)2);
        System.out.println("w1= " + w1);
        System.out.println("w2= " + w2);
        
        Sentence s1 = new Sentence();
        s1.add(new Word("tree",(byte)1));
        s1.add(new Word("grows",(byte)2));
        System.out.println("s1=" + s1);
    }
    
}
