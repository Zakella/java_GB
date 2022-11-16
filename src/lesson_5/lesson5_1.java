package lesson_5;

import java.util.*;
import java.util.logging.Logger;

public class lesson5_1 {

    // Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
    // Пусть дан список сотрудников:Иван Иванов (и остальные, полный текст дз будет на платформе)
    // Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
    // Отсортировать по убыванию популярности.

    public static void main(final String[] args) {

        lesson5_1 task = new lesson5_1();
        task.phoneBook();
        task.repeatNames();

    }

    public void phoneBook(){

        Map <String, ArrayList> map = new HashMap<>();
        ArrayList <String> list = new ArrayList<>();
        list.add("+378787878");
        list.add("+778787878");
        map.put("Anderson", list);

        list.clear();

        list.add("+74145555");
        list.add("+145577888");
        map.put("Tomas", list);

        Logger log = Logger.getAnonymousLogger();
        log.info(map.toString());

    }

    public void repeatNames(){

        ArrayList <String> list = new ArrayList<>();
        Map <String, Integer> map = new HashMap<>();
        list.add("Светлана Петрова");
        list.add("Кристина Белова");
        list.add("Анна Мусина");
        list.add("Анна Крутова");
        list.add("Иван Юрин");
        list.add("Петр Лыков");
        list.add("Павел Чернов");
        list.add("Петр Чернышов");
        list.add("Мария Федорова");
        list.add("Марина Светлова");
        list.add("Мария Савина");
        list.add("Мария Рыкова");
        list.add("Марина Лугова");
        list.add("Анна Владимирова");
        list.add("Иван Мечников");
        list.add("Петр Петин");
        list.add("Иван Ежов");

        for (String item:list
             ) {
            String [] nameList = item.split(" ");
            var name = nameList[0].toString();
            if (map.containsKey(name)){
                map.put(name, map.get(name) + 1);
            }
            else {
                map.put(name, 1);
            }
        }

        Logger log = Logger.getAnonymousLogger();
        log.info("Unsorted : " + map.toString());

        Map<String, Integer> unSortedMap =map;
        LinkedHashMap<String, Integer> reverseSortedMap = new LinkedHashMap<>();
        unSortedMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));

        log.info("Sorted : " + reverseSortedMap.toString());

    }
}


