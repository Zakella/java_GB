package lesson_7;

public class Snack extends Product{
    private String taste ;
    public Snack(String name, Double cost, String taste) {
        super(name, cost);
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
}
