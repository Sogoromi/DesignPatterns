package structural.decorator;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(structural.decorator.iShape iShape) {
        super(iShape);
    }
    @Override
    public void drawShape() {
        iShape.drawShape();
    }
    public void setRedBorder() {
        System.out.printf("Border Color: Eed");
    }
}
