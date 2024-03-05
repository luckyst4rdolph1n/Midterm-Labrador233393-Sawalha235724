import java.awt.*;
import java.awt.geom.*;

public class Ground implements DrawingObject{
    
    double x;
    double y;
    double width;
    double height;
    Color color;

    public Ground(double x, double y, double width, double height, Color color){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
        
    }

    @Override
    public void draw(Graphics2D g2d){
        Rectangle2D.Double ground = new Rectangle2D.Double(x, y, width, height);
        g2d.setColor(color);
        g2d.fill(ground);
    }

}
