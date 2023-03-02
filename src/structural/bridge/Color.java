package structural.bridge;
public class Color extends ShapeBridge {
    public Color(IShape_BP shapeBp) {
        super(shapeBp);
    }


    @Override
    void drawShape_ShapeBridge() {
        //DO-NOTHING
    }
    @Override
    void drawShape_ShapeBridge() {
        System.out.prinln("Inside the public class Color, which" +
                "extends ShapeBridge...");
        shapeBp.shapeColor_IShape();
    }


}