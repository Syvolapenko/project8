public class Triangle implements Shape{
    private String name ;

    public Triangle() {
        name = "triangle";
    }

    public String getName() {
        return name;
    }

    @Override
    public void figureName() {
        System.out.println("I'm a " + name);
    }
}