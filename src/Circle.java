public class Circle implements Shape {
    private String name ;

    public Circle() {
    name = "circle";
    }

    public String getName() {
        return name;
    }

    @Override
    public void figureName() {
        System.out.println("I'm a " + name);
    }
}
