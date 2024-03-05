import java.awt.*;
import java.awt.geom.*;


public class Cloud implements DrawingObject {

    private double x;
    private double y;
    private double size;
    private Color color;

    private Ellipse2D.Double e1;
    private Ellipse2D.Double e2;
    private Ellipse2D.Double e3;
    private Ellipse2D.Double e4;
    private Ellipse2D.Double e5;

    public Cloud(double x, double y, double size, Color color){
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
    }

    public void generateCloud(){
        e1 = new Ellipse2D.Double(x, y, size, size);
        e2 = new Ellipse2D.Double(x+size*.25, y-size*.2, size*1.75, size*1.4);
        e3 = new Ellipse2D.Double(x+size*1.5, y+size*.15, size*.9, size*.9);
        e4 = new Ellipse2D.Double(x+size*1.7, y+size*.05, size*.3, size*.3);
        e5 = new Ellipse2D.Double(x+size*.02, y+size*.6, size*.3, size*.3);
    }

    public void draw(Graphics2D g2d){
        AffineTransform reset = g2d.getTransform();
        generateCloud();
        g2d.translate(0, 5);
        g2d.setColor(new Color(199, 238, 254, 150));
        g2d.fill(e1);
        g2d.fill(e2);
        g2d.fill(e3);
        g2d.fill(e4);
        g2d.fill(e5);
        g2d.setTransform(reset);

        g2d.setColor(color);
        g2d.fill(e1);
        g2d.fill(e2);
        g2d.fill(e3);
        g2d.fill(e4);
        g2d.fill(e5);
    }

    public void moveCloud(){
        if (x < 800){
            x += 1;
        }
        else{
            x = -200;
        }
    }
    
}
