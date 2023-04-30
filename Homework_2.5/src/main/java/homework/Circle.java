package homework;

public class Circle implements Shape {
    public void computeArea(float r, float pi) {
        System.out.println("The area of circle is: " + r * r * pi);
    }
}
