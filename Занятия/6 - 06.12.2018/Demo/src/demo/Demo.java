
package demo;

import java.util.Arrays;


public class Demo {

   
    
    public static void main(String[] args) {
        String names = " Alena Alice alina albina Anastasya ALLA ArinA ";
        names = names.trim(); // удаление пробелов по краям строки
        // разбиение строки на подстроки, где "пробел" — разделитель
        String a[] = names.split("[ ]+"); // массив содержит элементы нулевой длины
        //Mylib.selectionSort(a);
        //Arrays.sort(a);
        Mylib.replaceCharK1(a, 5, '!');
        for (String arg : a) {
            if (!arg.isEmpty()) {
                System.out.println(arg + " ");

            }
        }
        String str1 = Mylib.insertAfterK("Helloworld!!!", 9, ",w");
        System.out.println("str1=" + str1);

    }
    
}
