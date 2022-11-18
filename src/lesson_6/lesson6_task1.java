package lesson_6;

//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//        Создать множество ноутбуков.
//        Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому критерию:
//        1 - ОЗУ
//
//        2 - Объем ЖД
//
//        3 - Операционная система
//
//        4 - Цвет …
//
//        3.1. Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
//        4. Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;



public class lesson6_task1 {
    public static void main(String[] args) {

        lesson6_task1 Task = new lesson6_task1();
        ArrayList<NoteBook> itemList = Task.getItems();
        List<String> searchList = Task.getKeyWords();
        Logger logger = Logger.getAnonymousLogger();
        Boolean itemNotFound = true;

        for (var item : itemList
        ) {
            var itemInfo = item.getDescription();
            String value = itemInfo.get(searchList.get(0));
            if (value != null) {
                if (value.contains(searchList.get(1))) {
                    logger.info(item.toString());
                    itemNotFound = false;
                }
            }

        }
        if (itemNotFound){
            throw new IllegalStateException("Item not found");
        }

    }

    public ArrayList<NoteBook> getItems() {

        ArrayList<NoteBook> list = new ArrayList<>();
        list.add(new NoteBook("Asus M10544", "16", "500GB", "Windows", "Black"));
        list.add(new NoteBook("Lenovo P787811", "8", "1TB", "Linux Ubuntu 20", "Red"));
        list.add(new NoteBook("Samsung B12", "8", "2TB", "Linux", "Green"));
        list.add(new NoteBook("Apple Macintosh 1", "24", "2TB", "Mac OS", "White"));
        return list;

    }

    public List<String> getKeyWords() {

        List<String> list = new ArrayList<>();
        Scanner scKey = new Scanner(System.in);
        System.out.print("Enter search field: ");
        list.add(scKey.next());

        Scanner scValue = new Scanner(System.in);
        System.out.print("Enter search value: ");
        list.add(scValue.nextLine());

        return list;

    }

}
