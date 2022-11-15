import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class lesson5_1 {

    // Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
    // Пусть дан список сотрудников:Иван Иванов (и остальные, полный текст дз будет на платформе)
    // Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
    // Отсортировать по убыванию популярности.


    public static void main(final String[] args) {

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


}
