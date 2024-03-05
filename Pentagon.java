import java.awt.*;
import java.awt.geom.*;

public class Pentagon implements DrawingObject{
    
    double x;
    double y;
    double size;
    Color color;

    public Pentagon(double x, double y, double size, Color color){
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
    }

    @Override
    public void draw(Graphics2D g2d){
        Path2D.Double p = new Path2D.Double();
        p.moveTo(x, y);
        p.lineTo(x+size, y);
        p.lineTo(x+1.31*size, y+0.95*size);
        p.lineTo((2*x+size)/2, y+1.54*size);
        p.lineTo(x-0.31*size, y+0.95*size);
        p.closePath();
        g2d.setColor(color);
        g2d.fill(p);
    }

}
