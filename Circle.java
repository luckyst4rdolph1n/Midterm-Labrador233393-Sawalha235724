import java.awt.*;
import java.awt.geom.*;

public class Circle implements DrawingObject{
    
    double x;
    double y;
    double size;
    Color color;

    public Circle(double x, double y, double size, Color color){
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
    }

    @Override
    public void draw(Graphics2D g2d){
        Ellipse2D.Double circle = new Ellipse2D.Double(x, y, size, size);
        g2d.setColor(color);
        g2d.fill(circle);
    }

}
