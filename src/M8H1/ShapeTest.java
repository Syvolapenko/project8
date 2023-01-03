package M8H1;

public class ShapeTest {
    public static void main(String[] args) {
//        M8H1.Circle circle = new M8H1.Circle();
//        circle.figureName();
//        M8H1.Quad quad = new M8H1.Quad();
//        quad.figureName();
//        M8H1.Triangle triangle = new M8H1.Triangle();
//        triangle.figureName();
//        M8H1.Rectangle rectangle = new M8H1.Rectangle();
//        rectangle.figureName();
//        M8H1.Pentagon pentagon = new M8H1.Pentagon();
//        pentagon.figureName();
        Shape [] shapes = new Shape[] {new Circle(), new Quad(), new Triangle(),
                new Rectangle(), new Pentagon()};
        for(Shape shape: shapes) {
            shape.figureName();
        }
    }
}
