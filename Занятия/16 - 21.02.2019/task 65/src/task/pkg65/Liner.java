package task.pkg65;

public class Liner extends Series {

    public Liner(int a, int b) {
        super(a, b);
    }

    @Override
    public int calcElem(int j) {
        return getA() + (j - 1) * getB();
    }

}
