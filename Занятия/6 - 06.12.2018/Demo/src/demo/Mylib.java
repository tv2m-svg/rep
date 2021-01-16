package demo;

public class Mylib {

    //52
    public static void selectionSort(String[] strs) {
        for (int j = 0; j < strs.length; j++) {
            for (int i = j + 1; i < strs.length; i++) {
                if (strs[i].compareToIgnoreCase(strs[j]) < 0) {
                    String temp = strs[j];
                    strs[j] = strs[i];
                    strs[i] = temp;
                }
            }
        }
    }

    //53
    public static void replaceCharK(String[] strs, int k, char c) {
        for (int i = 0; i < strs.length; i++) {
            String tmp = strs[i];
            if (strs[i].length() > k + 1) {
                strs[i] = tmp.substring(0, k) + c + tmp.substring(k + 1);
            }
            if (strs[i].length() == k + 1) {
                strs[i] = tmp.substring(0, k) + c;
            }
        }
    }

    public static void replaceCharK1(String[] strs, int k, char c) {
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() > k) {
                StringBuffer sb = new StringBuffer(strs[i]);
                sb.setCharAt(k, c);
                strs[i] = sb.toString();
            }

        }
    }

    //54
    public static String insertAfterK(String str, int k, String substr) {
        String tmp = "";
        if (str.length() > k) {
            tmp = str.substring(0, k + 1) + substr + str.substring(k + 1);
        }
        return tmp;
    }

    public static String insertAfterK1(String str, int k, String substr) {
        StringBuffer sb = new StringBuffer(str);
        if (sb.length() > k) {
            sb.insert(k, substr);
        }
        return sb.toString();
    }

}
