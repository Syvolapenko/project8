package M8H1;

public class Quad implements Shape {
    private String name;

    public Quad() {
        name = "quad";
    }

    public String getName() {
        return name;
    }

    @Override
    public void figureName() {
        System.out.println("I'm a " + name);
    }
}
