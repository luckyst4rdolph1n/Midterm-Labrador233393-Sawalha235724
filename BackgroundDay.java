import java.awt.*;
import java.awt.geom.*;

public class BackgroundDay implements DrawingObject{
    
    int x;
    int y;
    int width;
    int height;
    KeyHandlers forDay;
    
    public BackgroundDay(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        forDay = new KeyHandlers();
    }

    public void draw(Graphics2D g2d){
        Point2D.Double pt1 = new Point2D.Double(0, 0);
        Point2D.Double pt2 = new Point2D.Double(0, height);
        Color dayColor1 = new Color(167, 195, 245);
        Color dayColor2 = new Color(250, 224, 207);

        Rectangle2D.Double background = new Rectangle2D.Double(0, 0, width, height);
        GradientPaint day = new GradientPaint(pt1, dayColor1, pt2, dayColor2, true);
        g2d.setPaint(day);
        g2d.fill(background);

    }

}
