package lesson_7;

public class HotDrink extends Product{
    private  Integer temperature;
    private Integer volume;
    public HotDrink(String name, Integer volume, Integer temperature, Double cost) {
        super(name, cost);
        this.temperature = temperature;
        this.volume = volume;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name=" + this.getName() +
                ", cost=" + this.getCost() +
                ", temperature=" + temperature +
                ", volume=" + volume +
                '}';
    }
}
