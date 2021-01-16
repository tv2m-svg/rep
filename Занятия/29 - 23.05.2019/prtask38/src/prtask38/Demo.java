package prtask38;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Demo {

    static void helper(Deque<Character> stack, char open) throws MyException {
        Character elem = stack.peekFirst();
        if (elem == null) {
            throw new MyException("Stack empty!!! Number of Input symbol = ");
        } else if (!elem.equals(open)) {
            throw new MyException("Bad open bracket!!!");
        } else {
            stack.removeFirst();
        }
    }

    public static void main(String[] args) {
        // Ввести строки из файла, записать в список
        List<String> al = new ArrayList<>();
        try {
            Scanner scan = new Scanner(new File("input.txt"));
            while (scan.hasNextLine()) {
                al.add(scan.nextLine());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Demo.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Вывести строки в прямом порядке
        Iterator<String> iter = al.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        // Вывести строки обратном порядке
        for (int i = al.size() - 1; i >= 0; --i) {
            System.out.println(al.get(i));
        }

        ListIterator<String> listIter = al.listIterator(al.size());
        while (listIter.hasPrevious()) {
            System.out.println(listIter.previous());
        }

        // Провести сортировку по возрастанию длин строк
        //ArrayList?!
        al.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println("AFTER SORT");
        iter = al.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        // Stack
        Deque<Integer> stack1 = new LinkedList<>();
        int n = 123;
        while (n != 0) {
            stack1.addFirst(n % 10);   // push
            n /= 10;
        }

        Deque<Integer> stack2 = new LinkedList<>();
        while (!stack1.isEmpty()) {
            stack2.addFirst(stack1.peekFirst());  // peek
            stack1.removeFirst();    // pop
        }

        System.out.println("STACK");
        while (!stack2.isEmpty()) {
            System.out.println(stack2.peekFirst());  // peek
            stack2.removeFirst();    // pop
        }

        // swap для ссылочных типов
        List<String> list1 = new ArrayList<>();
        list1.add("Hello");
        list1.add("Good-bye");

        List<String> list2 = new ArrayList<>();
        list2.add("Apple");
        list2.add("Banan");

        System.out.println("LIST1: " + list1);
        System.out.println("LIST2: " + list2);

        List<String> tmp = list1;
        list1 = list2;
        list2 = tmp;

        System.out.println("LIST1: " + list1);
        System.out.println("LIST2: " + list2);

        Set<Integer> set1 = new TreeSet<>();
        set1.add(1);
        set1.add(3);
        set1.add(5);
        Set<Integer> set2 = new TreeSet<>();
        set2.add(3);
        set2.add(6);
        set2.add(9);
        System.out.println("SET1: " + set1);
        System.out.println("SET2: " + set2);

// intersection
        Set<Integer> intersection = new TreeSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("SET1: " + set1);
        System.out.println("SET2: " + set2);
        System.out.println("INTERSECTION: " + intersection);

        Set<Integer> union = new TreeSet<>(set1);
        union.addAll(set2);
        System.out.println("SET1: " + set1);
        System.out.println("SET2: " + set2);
        System.out.println("UNION: " + union);

        Polynomial p1 = new Polynomial();
        p1.put(3, 5.);
        p1.put(0, 2.);
        System.out.println("p1=" + p1);

        Polynomial p2 = new Polynomial();
        p2.put(4, 3.);
        p2.put(3, -7.);
        p2.put(1, 10.);
        System.out.println("p2=" + p2);

        Polynomial sum = p1.add(p2);
        System.out.println("sum = " + sum);

        List<Integer> ints = new ArrayList<Integer>();
        ints.add(-1);
        ints.add(3);
        ints.add(5);
        ints.add(-8);
        ints.add(17);
        System.out.println("ints=" + ints);
        int count = 0;
        int i = 0;
        while (count < ints.size()) {
            if (ints.get(i) < 0) {
                ints.add(ints.get(i));
                ints.remove(i);
            } else {
                ++i;
            }
            ++count;
            System.out.println("count=" + count + "ints=" + ints);
        }
        System.out.println("ints=" + ints);

        String brackets = "{()()}[)";
        Deque<Character> charStack = new LinkedList<>();
        try {
            for (int j = 0; j < brackets.length(); ++j) {
                char c = brackets.charAt(j);
                switch (c) {
                    case '(':
                    case '[':
                    case '{':
                        charStack.addFirst(c);
                        break;
                    case ')': 
                        helper(charStack, '(');
                        break;
                    case ']': 
                        helper(charStack, '[');
                        break;
                    case '}': 
                        helper(charStack, '{');
                        break;
                }
            }
        } catch (MyException exc) {
            System.out.println(exc);
        }
        System.out.println("charStack = " + charStack);

    }

}
