package Lect2;

import java.io.File;

public class L2 {
    public static void main(String[] args) {
        // String str = "";
        // for (int i = 0; i < 1_000_000; i++) {
        //     str += "+";
        // ≈41000 ms время выполнения
        // }

        // StringBuilder sb = new StringBuilder();
        // for (int i = 0; i < 1_000_000; i++) {
        //     sb.append("+");
        // ≈9 ms время выполнения
        // }

        // System.out.println(str); работает
        // System.out.println(sb); работает
        
        var s = System.currentTimeMillis();
        //String str = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
            //str += "+";
            sb.append("+");
        }      
        System.out.println(System.currentTimeMillis() - s);
        // System.out.println(str);
        // System.out.println(sb);
    
        // Что такое API для нас: строки
        // concat(): объединение строк
        // valueOf(): преобразует Object в строковое представление (завязан на toString())
        // join(): объединяет набор строк в одну с учетом разделителя
        // charAt(): получение символа по индексу
        // indexOf(): первый индекс вхождения подстроки
        // lastIndexOf(): последний индекс вхождения подстроки
        // startsWith()/endsWith(): определяет, начинается/заканчивается ли строка с подстроки
        // replace(): замена одной подстроки на другую

        // trim(): удаляет начальные и конечные пробелы
        // substring(): возвращает подстроку, см.аргументы
        // toLowerCase()/toUpperCase(): возвращает новую строку в нижнем/верхнем регистре
        // сompareTo(): сравнивает две строки
        // equals(): сравнивает строки с учетом регистра
        // equalsIgnoreCase(): сравнивает строки без учета регистра
        // regionMatches(): сравнивает подстроки в строках

        // Строки

        String[] name = { "C", "е", "р", "г", "е", "й" };
        String sk = "СЕРГЕЙ КА.";
        System.out.println(sk.toLowerCase()); // сергей ка.
        System.out.println(String.join("", name)); // Cергей
        System.out.println(String.join("", "C", "е", "р", "г", "е", "й"));
        // C,е,р,г,е,й
        System.out.println(String.join(",", "C", "е", "р", "г", "е", "й"));

        // Работа с файлами
        
        File f1 = new File("file.txt");
        File f2 = new File("/Users/sk/vscode/java_projects/file.txt");

        




    }
}

