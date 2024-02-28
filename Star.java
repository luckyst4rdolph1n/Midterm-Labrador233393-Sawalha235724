import java.awt.*;
import java.awt.geom.*;

public class Star implements DrawingObject{
    
    double x;
    double y;
    Color color;

    public Star(double x, double y,  Color color){
        this.x = x;
        this.y = y;
        this.color = color;
        
    }

    @Override
    public void draw(Graphics2D g2d){
    AffineTransform reset = g2d.getTransform();
    Triangle t1 = new Triangle(x,y,5,10,Color.WHITE);
    t1.draw(g2d);

    Triangle t2 = new Triangle(x+10, y, 5, 10, Color.WHITE);   
    g2d.rotate(Math.toRadians(72),x+10,y);
    t2.draw(g2d); 

    g2d.setTransform(reset);
    Triangle t3 = new Triangle(x+13.1 ,y+9.5, 5, 10, Color.WHITE);   
    g2d.rotate(Math.toRadians(144),x+13.1 ,y+9.5);
    t3.draw(g2d); 

    g2d.setTransform(reset);
    Triangle t4 = new Triangle((2*x+10)/2,y+15.4, 5, 10, Color.WHITE); 
    g2d.rotate(Math.toRadians(216),(2*x+10)/2,y+15.4);
    t4.draw(g2d);   

    g2d.setTransform(reset);
    Triangle t5 = new Triangle(x-3.1,y+9.5, 5, 10, Color.WHITE); 
    g2d.rotate(Math.toRadians(288),x-3.1,y+9.5);
    t5.draw(g2d);   

    g2d.setTransform(reset);
    Pentagon base = new Pentagon(x, y, Color.WHITE);
    base.draw(g2d);

    }

}
