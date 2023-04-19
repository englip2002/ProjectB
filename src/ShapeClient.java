
//import ShapeService.*;
public class ShapeClient {
    public static void main(String[] args){
        //Circle objC = new Circle();
        //objC.draw();
        //facade
        //FacadeDraw f = new FacadeDraw()
        //f.drawCircle();

        //SINGLETON - To only create one object 
        FacadeDraw fds = FacadeDraw.getInstance();
        fds.drawCircle();
        fds.drawRectangular();
        fds.drawSquare();
        
    }
}
