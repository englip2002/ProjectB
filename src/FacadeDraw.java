import ShapeService.*;

public class FacadeDraw {
    private Circle c;
    private Rectangular r;
    private Square s;
    
    //constructor - to link facade to main components
    public FacadeDraw(){
        c = new Circle();
        r = new Rectangular();
        s = new Square();
    }
    
    public void drawCircle(){
        c.draw();
    }
    
    public void drawRectangular(){
        r.draw();
    }
    
    public void drawSquare(){
        s.draw();
    }
}
