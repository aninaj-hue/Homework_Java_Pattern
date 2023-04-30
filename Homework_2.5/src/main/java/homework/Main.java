package homework;

public class Main {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // get an object of Circle and call its computeArea method.
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        // call computeArea method of Circle
        shape1.computeArea(5, 3.14f);

        // get an object of Rectangle and call its computeArea method.
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        // call computeArea method of Rectangle
        shape2.computeArea(3, 6);

    }

}