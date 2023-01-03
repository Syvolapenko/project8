package M8H1;

public class Rectangle implements Shape {
    private String name ;

    public Rectangle() {
        name = "rectangle";
    }

    public String getName() {
        return name;
    }

    @Override
    public void figureName() {
        System.out.println("I'm a " + name);
    }
}

