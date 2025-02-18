import java.util.Random;
public abstract class People {
    Random rand = new Random();
    private int id;
    private String name;

    public People(String name) {
        this.id = rand.nextInt(1000);
        this.name = name;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
