package liskov_substitition.good;

public class Square implements Shape {

    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getArea() {
        return size*size;
    }
}
