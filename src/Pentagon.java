public class Pentagon implements Shape{
    private String name ;

    public Pentagon() {
        name = "pentagon";
    }

    public String getName() {
        return name;
    }

    @Override
    public void figureName() {
        System.out.println("I'm a " + name);
    }
}
