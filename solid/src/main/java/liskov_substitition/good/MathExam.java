package liskov_substitition.good;

public class MathExam {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(5);
        rectangle.setWidth(4);
        Square square = new Square();
        square.setSize(4);
        Shape[] shapes = {rectangle, square};
        for (Shape shape : shapes) {
            System.out.println(shape.getArea());
        }
    }
}
