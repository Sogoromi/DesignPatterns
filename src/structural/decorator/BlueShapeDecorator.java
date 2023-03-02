package structural.decorator;
public class BlueShapeDecorator extends ShapeDecorator {
    public BlueShapeDecorator(structural.decorator.iShape iShape) {
        super(iShape);
    }
    @Override
    public void drawShape() {
        iShape.drawShape();
    }
    public void setRedBorder() {
        System.out.printf("Border Color: Blue");
    }
}
