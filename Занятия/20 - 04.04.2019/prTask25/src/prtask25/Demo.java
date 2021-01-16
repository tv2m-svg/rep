
package prtask25;


public class Demo {

    
    public static void main(String[] args) {
        //В заданной строке заменить подряд идущие
        //пробелы на один пробел
        String in = "   asd   wert    ccc   ";
        String out = in.replaceAll("[ ]+", " ");
        System.out.println("out = (" + out + ')');
        
        // удалить лидирующие и завершающие пробелы
        out = in.replaceAll("(^ +)|( +$)", "");
        System.out.println("out = (" + out + ')');
        
        //Дана строка – группы символов, разделенных
        //пробелами (одним или несколькими). В тех словах, 
        //которые оканчиваются сочетанием букв ing, заменить 
        //это окончание на ed
        in = " ing running fings swimming";
        out = in.replaceAll("\\Bing\\b", "ed");
        System.out.println("out = (" + out + ')');
        
        // Удалить цифры из строки
        in = " 23ng 15 run9ning fings swimming7";
        out = in.replaceAll("\\d", "");
        System.out.println("out = (" + out + ')');
        
        // Удалить лидирующие нули в целых числах
        in = "012  0023  105 9007  0.5";
        out = in.replaceAll("\\b(0+)([1-9])", "$2");
        System.out.println("out = (" + out + ')');
        
        // Из заданной строки удалить из каждой 
        //группы идущих подряд цифр, в которой 
        //более двух цифр и которой предшествует точка, 
        //все цифры, начиная с третьей
        in = "0.12  0.023  10.5 .9007  0.5";
        out = in.replaceAll("([.])(\\d\\d)(\\d+)", "$1$2");
        System.out.println("out = (" + out + ')');
        
        // Каждое слово public заменить на слово private
        in = "public   /*apublica*/ //publicpublic";
        out = in.replaceAll("(/[*].*[*]/)|(//.*$)", "");
        System.out.println("out = (" + out + ')');
    }
    
}
