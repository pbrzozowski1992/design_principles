package liskov_substitition.bad;

public class MathExam {

    public static void main(String[] args) {
        Rectangle rectangle = new Square();
        rectangle.setWidth(20);
        rectangle.setWidth(10);
        System.out.println(rectangle.getArea());
    }
}
