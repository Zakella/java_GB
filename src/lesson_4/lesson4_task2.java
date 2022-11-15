package lesson4;

import java.util.LinkedList;
import java.util.logging.Logger;

public class lesson4_task2 {
    public static void main(String[] args) {
        Logger log = Logger.getAnonymousLogger();
        LinkedList<Integer> ls = new LinkedList<Integer>();

        for (int i = 0; i < 10; i++) {
            ls.add(i);
        }

        enqueue(ls, 11);
        log.info(ls.toString());

        dequeue(ls, log);
        first(ls,log);


    }

    public static void enqueue(LinkedList list, int value ){
        list.addLast(value);

    }

    public static void dequeue(LinkedList list, Logger log){

        log.info("The first element is: "+ list.getFirst());
        list.removeFirst();
        log.info(list.toString());

    }

    public static void first(LinkedList list, Logger log){

        log.info("The first element is: "+ list.getFirst());


    }
}
