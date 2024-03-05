import java.awt.*;
import java.awt.geom.*;

public class Circle implements DrawingObject{
    
    private double x;
    private double y;
    private double size;
    private Color colorFill;
    private Color colorOutline;

    public Circle(double x, double y, double size, Color colorFill, Color colorOutline){
        this.x = x;
        this.y = y;
        this.size = size;
        this.colorFill = colorFill;
        this.colorOutline = colorOutline;
    }

    @Override
    public void draw(Graphics2D g2d){
        Ellipse2D.Double circle = new Ellipse2D.Double(x, y, size, size);
        g2d.setColor(colorFill);
        g2d.fill(circle);
        g2d.setStroke(new BasicStroke(2));
        g2d.setColor(colorOutline);
        g2d.draw(circle);
    }

}