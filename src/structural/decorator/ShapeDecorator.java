package structural.decorator;

public class ShapeDecorator implements iShape {
    protected iShape iShape;

    public ShapeDecorator(structural.decorator.iShape iShape) {
        this.iShape = iShape;
    }
    @Override
    public void drawShape() {
        iShape.drawShape();
    }
}
