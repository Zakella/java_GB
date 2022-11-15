import java.io.IOException;
import java.util.logging.*;
import java.util.Arrays;
import java.util.Random;


public class lesson2_2 {
    public static void main(String[] args) {

        Logger logger = Logger.getLogger("BublleSort");
        FileHandler fh;

        try {
            fh = new FileHandler("BublleSort.log");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);


        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
             e.printStackTrace();
        }

        Random r = new Random();
        int[] mas = new int[3];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = r.nextInt();
        }
        logger.info("Was :" + Arrays.toString(mas));

        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;

                }
            }
        }
        logger.info("Now :" + Arrays.toString(mas));
        System.out.println(Arrays.toString(mas));
    }
}
