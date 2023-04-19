//https://refactoring.guru/design-patterns/facade
import ShapeService.*;

public class FacadeDraw {
    private Circle c;
    private Rectangular r;
    private Square s;


    //SINGLETON - To only create one object 
    //SINGLETON STEP 2: object as attribute
    private static FacadeDraw fds = new FacadeDraw();

    //constructor - to link facade to main components
    //SINGLETON STEP 1: private constuctor
    private FacadeDraw(){
        c = new Circle();
        r = new Rectangular();
        s = new Square();
    }

    //SINGLETON STEP 3: Create entry point to access object
    public static FacadeDraw getInstance(){
        return fds;
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
