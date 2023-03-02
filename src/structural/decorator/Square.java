package structural.decorator;

public class Square implements iShape {
    @Override
    public void drawShape() {
        System.out.printf("iShape::Square");
    }
}
