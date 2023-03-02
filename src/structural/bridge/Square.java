package structural.bridge;

public class Square implements IShape_BP{
    public Square() {
    }

    @Override
    public void shapeType_IShape() {
        System.out.println("Inside the public class Square");
    }

    @Override
    public void shapeColor_IShape() {
        System.out.println("Inside the public class Square, in the" +
                "method -> shapeColor_IShape()");


    }
}