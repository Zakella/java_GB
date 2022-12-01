package data;

import java.util.List;

public interface Reader {

    void writeData(List<Task> tasks);

    void readData(List<Task> tasks);
}
