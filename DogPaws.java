import java.awt.*;
import java.awt.geom.*;
public class DogPaws implements DrawingObject{
    double x;
    double y;
    Color color;
    Color pawLineColor;

    public DogPaws(double x, double y, Color color, Color pawLineColor){
        this.x = x;
        this.y = y;
        this.color = color;
        this.pawLineColor = pawLineColor;
    }

    @Override
    public void draw(Graphics2D g2d){
  
    /*The general shape of the paw. */
    Path2D.Double paws = new Path2D.Double();
    paws.moveTo(x,y);
    paws.lineTo(x, y+50);
    paws.curveTo(x, y+65, x+27, y+65, x+27, y+50);
    paws.lineTo(x+24, y);
    g2d.setColor(color);
    g2d.fill(paws);
    

    g2d.setStroke(new BasicStroke(2));
    Line2D.Double pawLine = new Line2D.Double(x+9, y+60, x+9, y+48);
    Line2D.Double pawLine2 = new Line2D.Double(x+18, y+60, x+18, y+48);
    g2d.setColor(pawLineColor);
    g2d.draw(pawLine);
    g2d.draw(pawLine2);
    g2d.draw(paws);
    
    }

}