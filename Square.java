import java.awt.*;
import java.awt.geom.*;

public class Square implements DrawingObject{

    double x;
    double y;
    double size;
    Color color; 

    public Square(double x, double y, double size, Color color){
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
    }

    @Override
    public void draw(Graphics2D g2d){
        Rectangle2D.Double square = new Rectangle2D.Double(x, y, size, size);
        g2d.setColor(color);
        g2d.fill(square);

    }

    
}
