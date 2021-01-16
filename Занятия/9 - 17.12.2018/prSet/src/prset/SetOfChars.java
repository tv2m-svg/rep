package prset;

import java.util.ArrayList;

class Algorithm {

    public static <T> boolean isFind(ArrayList<T> array, T key) {
        for (T elem : array) {
            if (elem.equals(key)) {
                return true;
            }
        }
        return false;
    }
}

public class SetOfChars {

    private ArrayList<Character> arr;

    public SetOfChars() {
        arr = new ArrayList<Character>();
    }

    public SetOfChars(String str) {
        this();
        for (int i = 0; i < str.length(); ++i) {
            this.add(str.charAt(i));
        }
    }

    public int size() {
        return arr.size();
    }

    @Override
    public String toString() {
        arr.sort(null);
        return "SetOfChars{" + arr + '}';
    }

    public void add(char c) {
        if (!this.isFind(c)) {
            arr.add(c);
        }
    }

    public boolean isFind(char c) {
        return Algorithm.isFind(arr, c);
    }

    public SetOfChars intersection(SetOfChars set2) {
        SetOfChars res = new SetOfChars();
        for (char c : this.arr) {
            if (set2.isFind(c)) {
                res.add(c);
            }
        }
        return res;
    }

    public SetOfChars union(SetOfChars set2) {
        SetOfChars res = new SetOfChars();
        res.arr.addAll(this.arr);
        for (char elem : set2.arr) {
            res.add(elem);
        }

        return res;
    }

}
