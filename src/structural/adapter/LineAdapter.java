package structural.adapter;

public class LineAdapter implements Shape {
    private Line LineAdapter;

 public LineAdapter(Line LineAdapter){
     this.LineAdapter= LineAdapter;
    }
    @Override
    public void draw(int x1, int y1, int x2,int y2){
     LineAdapter.draw(x1, y1, x2, y2);
    }
}
