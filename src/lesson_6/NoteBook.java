package lesson_6;

import java.util.HashMap;

public class NoteBook {
    private final String Model;
    private final String Ram;
    private final String HardVolume;
    private final String OS;
    private final String Color;

    public NoteBook(String Model, String Ram, String HardVolume, String OS, String Color) {

        this.Model = Model;
        this.Ram = Ram;
        this.HardVolume = HardVolume;
        this.OS = OS;
        this.Color = Color;

    }

    public HashMap<String, String> getDescription() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Model", this.Model);
        map.put("RAM", this.Ram);
        map.put("HDD", this.HardVolume);
        map.put("OS", this.OS);
        map.put("Color", this.Color);
        return map;
    }

    @Override
    public String toString() {
        var map = getDescription();
        return String.format("Model: %s, RAM: %s, HDD volume: %s, OS: %s, Color: %s ",
                map.get("Model"), map.get("RAM"), map.get("HDD"), map.get("OS"), map.get("Color"));
    }
}
