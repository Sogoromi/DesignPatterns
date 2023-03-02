package structural.bridge;

public class  Blue implements IShape_BP {
    @Override
    public void shapeType_IShape() {
        System.out.println("Inside the public class Blue Triangle, in the" +
                "method -> shapeColor_IShape()");
    }

    @Override
    public void shapeColor_IShape() {
        System.out.println("Inside the public class Blue Triangle, in the" +
                "method -> shapeColor_IShape()");
    }
}