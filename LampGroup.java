import java.awt.*;
import java.awt.geom.*;

public class LampGroup implements DrawingObject{
    
    private double x;
    private double y;

    private StreetLamp streetLamps;

    public LampGroup(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics2D g2d){
        AffineTransform reset = g2d.getTransform();

        streetLamps = new StreetLamp(x, y);

        streetLamps.draw(g2d);
        g2d.translate(400, 0);
        streetLamps.draw(g2d);
        g2d.setTransform(reset);
    }
}
