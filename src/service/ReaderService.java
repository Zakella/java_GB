package service;

import data.CSVReader;
import data.JsonReader;
import data.Task;
import data.xmlReader;

import java.util.List;

public class ReaderService {

    public void writeData(List<Task> listTasks, String format){

        if (format.equals("json")) {
            new JsonReader().writeData(listTasks);

        }
        if (format.equals("csv")) {
            new CSVReader().writeData(listTasks);

        }


        if (format.equals("xml")) {
            new xmlReader().writeData(listTasks);

        }

        else {
          throw new IllegalStateException("Format not found!");
        };

    }

    public void readData(List<Task> listTasks, String format){

        if (format.equals("json")) {
            new JsonReader().readData(listTasks);

        }
        if (format.equals("csv")) {
            new CSVReader().readData(listTasks);

        }


        if (format.equals("xml")) {
            new xmlReader().readData(listTasks);

        }

        else {
            throw new IllegalStateException("Format not found!");
        };

    }
}
