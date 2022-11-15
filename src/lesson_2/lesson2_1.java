import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.Iterator;


public class lesson2_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("select * from students where ");

        JSONObject obj = new JSONObject();
        obj.put("name", "Ivanov");
        obj.put("country", "Russia");
        obj.put("city", "Moscow");
        obj.put("age", "null");
        obj.keySet().forEach(keyStr ->
        {
            Object keyvalue = obj.get(keyStr);

            if (keyvalue != "null") {
                sb.append(keyStr + "=" + keyvalue);
                sb.append(" and ");
            }

        });

        sb.replace(sb.length() - 4, sb.length() , "");
        System.out.println(sb.toString());

    }


}