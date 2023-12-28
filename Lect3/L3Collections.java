package Lect3;


import java.util.*;

public class L3Collections {
    public static void main(String[] args) {
        // ArrayList list = new ArrayList();
        // ArrayList<Integer> list1 = new ArrayList<Integer>();
        // ArrayList<Integer> list2 = new ArrayList<>();
        // ArrayList<Integer> list3 = new ArrayList<>(10); // 10 is the size of the ArrayList
        // ArrayList<Integer> list4 = new ArrayList<>(list3);

        // List list = new ArrayList();
        // list.add(2809);
        // list.add("string line");
        // for (Object o : list) {
        //     System.out.println(o);
        //     // Проблема извлечения данных пример с сырыми типами тип будет object
        // }

        // List<Integer> list = new ArrayList<Integer>();
        // list.add(1);
        // list.add(123);
        // // list.add("string line");
        // for (Object o : list) {
        //     System.out.println(o);
        //     // Проблема извлечения данных решенаться 
        // }
        

        // int day = 29;
        // int month = 9;
        // int year = 1990;
        // Integer[] date = { day, month, year };
        // List<Integer> d = Arrays.asList(date);
        // System.out.println(d); // [29, 9, 1990]

        // StringBuilder day = new StringBuilder("28");
        // StringBuilder month = new StringBuilder("9");
        // StringBuilder year = new StringBuilder("1990");
        // StringBuilder[] date = { day, month, year };
        // List<StringBuilder> d = Arrays.asList(date);
        // System.out.println(d); // [29, 9, 1990]

        // StringBuilder day = new StringBuilder("28");
        // StringBuilder month = new StringBuilder("9");
        // StringBuilder year = new StringBuilder("1990");
        // StringBuilder[] date = { day, month, year };
        // List<StringBuilder> d = Arrays.asList(date);
        // System.out.println(d); // [29, 9, 1990]
        // month = new StringBuilder("09");
        // System.out.println(d); // [28, 9, 1990]

        // StringBuilder day = new StringBuilder("28");
        // StringBuilder month = new StringBuilder("9");
        // StringBuilder year = new StringBuilder("1990");
        // StringBuilder[] date = { day, month, year };
        // List<StringBuilder> d = Arrays.asList(date);
        // System.out.println(d); // [29, 9, 1990]
        // date[1] = new StringBuilder("09");
        // System.out.println(d); // [29, 09, 1990]

        // Character value = null;
        // List<Character> list1 =
        // List.of('S', 'e', 'r', 'g', 'e', 'y');
        // System.out.println(list1);
        // // list1.remove(1); // java.lang.UnsupportedOperationException // удалить созданное через List.of() невозможно
        // List<Character> list2 = List.copyOf(list1);
        // // not null, immutable 

        // ИТЕРАТОР 

        // List<Integer> list = List.of(1, 12, 123, 1234, 12345);
        // for (int item : list) { System.out.println(item); }
        //     Iterator<Integer> col = list.iterator();
        // while (col.hasNext()) {
        //     System.out.println(col.next());

        // }

        List<Integer> list = List.of(1, 12, 123, 1234, 12345);
        for (int item : list) { System.out.println(item); }
            Iterator<Integer> col = list.iterator();
        while (col.hasNext()) {
            //System.out.println(col.next());
            col.next();
            col.remove();
        }








        
    }
}

// add(args) – добавляет элемент в список ( в т.ч. на нужную позицию)
// get(pos) – возвращает элемент из списка по указанной позиции
// indexOf(item) – первое вхождение или -1
// lastIndexOf(item) – последнее вхождение или -1
// remove(pos) – удаление элемента на указанной позиции и его возвращение
// set(int pos, T item) – gjvtoftn значение item элементу, который находится
// на позиции pos
// void sort(Comparator) – сортирует набор данных по правилу
// subList(int start, int end) – получение набора данных от позиции start до end

// clear() – очистка списка
// toString() – «конвертация» списка в строку
// Arrays.asList – преобразует массив в список
// containsAll(col) – проверяет включение всех элементов из col
// removeAll(col) – удаляет элементы, имеющиеся в col
// retainAll(col) – оставляет элементы, имеющиеся в col
// toArray() – конвертация списка в массив Object’ов
// toArray(type array) – конвертация списка в массив type
// List.copyOf(col) – возвращает копию списка на основе имеющегося
// List.of(item1, item2,...) – возвращает неизменяемый список

