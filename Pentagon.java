import java.awt.*;
import java.awt.geom.*;

public class Pentagon implements DrawingObject{
    
    double x;
    double y;
    double size;
    Color color;

    public Pentagon(double x, double y, Color color){
        this.x = x;
        this.y = y;
        this.color = color;
    }

    @Override
    public void draw(Graphics2D g2d){
        Path2D.Double p = new Path2D.Double();
        p.moveTo(x, y);
        p.lineTo(x+10, y);
        p.lineTo(x+13.1 ,y+9.5);
        p.lineTo((2*x+10)/2,y+15.4);
        p.lineTo(x-3.1,y+9.5);
        p.closePath();
        g2d.setColor(color);
        g2d.fill(p);
    }

}
