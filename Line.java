import java.awt.*;
import java.awt.geom.*;

public class Line implements DrawingObject{
    
    double startX;
    double startY;
    double endX;
    double endY;
    float thickness;
    Color color;

    public Line(double startX, double startY, double endX,  double endY, float thickness, Color color){
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.thickness = thickness;
        this.color = color;
    }

    public void draw(Graphics2D g2d){
        Line2D.Double line = new Line2D.Double(startX, startY, endX, endY);
        g2d.setStroke(new BasicStroke(thickness));
        g2d.setColor(color);
        g2d.draw(line);
    }
}
