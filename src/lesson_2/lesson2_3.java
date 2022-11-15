import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class lesson2_3 {

    private static void getAllFiles(String path) {
        File[] allFiles = new File(path).listFiles();
        if (allFiles != null) {
            for (File file : allFiles) {
                String fileName = file.toString();
                int index = fileName.lastIndexOf('.');
                if(index > 0) {
                    String extension = fileName.substring(index + 1);
                    System.out.println("Расширение файла:" + extension);
                }
            }
        }
    }

    public static void main(String[] args) {
        String path = "C:\\Users\\SLAVA\\Desktop\\My Projects\\Java\\lesson 2\\lesson 2_1\\lesson 2_1";
        getAllFiles(path);


    }
}