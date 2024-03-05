import java.awt.*;
import java.awt.geom.*;

public class Trees implements DrawingObject{
    
    private double x;
    private double y;

    private Triangle trunk;
    private Path2D.Double topCrown;
    private Path2D.Double sideCrown;

    private Path2D.Double branches;
    private Path2D.Double shadow;


    public Trees(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void generateTreeParts(){
        trunk = new Triangle(x, y, 200, 50,  new Color(108, 60, 31));
        
        topCrown = new Path2D.Double();
        topCrown.moveTo(x-50, y-150);
        topCrown.curveTo(x-50, y-270, x+95, y-270, x+100, y-150);
        topCrown.closePath();

        sideCrown = new Path2D.Double();
        sideCrown.moveTo(x-30, y-150);
        sideCrown.curveTo(x-30, y-220, x+75, y-220, x+80, y-150);
        sideCrown.closePath();

        branches = new Path2D.Double();
        branches.moveTo(x+70, y-150);
        branches.curveTo(x+60, y-110, x+50, y-110, x+30, y-110);
        branches.moveTo(x+70, y-150);
        branches.curveTo(x+60, y-113, x+50, y-113, x+30, y-115);

        branches.moveTo(x-50, y-140);
        branches.curveTo(x-40, y-90, x, y-90, x+20, y-90);
        branches.moveTo(x-50, y-140);
        branches.curveTo(x-40, y-95, x, y-95, x+20, y-95);

        shadow = new Path2D.Double();
        shadow.moveTo(x-25, y-220);
        shadow.curveTo(x, y-245, x+50, y-245, x+70, y-220);
        shadow.curveTo(x+95, y-190, x-50, y-190, x-25, y-220);
        shadow.closePath();

    }

    @Override
    public void draw(Graphics2D g2d){
        generateTreeParts();
        AffineTransform reset = g2d.getTransform();
        trunk.draw(g2d);
        g2d.setColor(new Color(108, 60, 31));
        g2d.setStroke(new BasicStroke(10));
        g2d.draw(branches);
        
        g2d.setColor(new Color(0, 139, 50));
        g2d.fill(topCrown);

        g2d.setColor(new Color(0, 162, 50));
        g2d.fill(shadow);

        g2d.translate(45, 0);
        g2d.setColor(new Color(1, 104, 32));
        g2d.fill(sideCrown);

        g2d.scale(0.8, 0.8);
        g2d.translate(30, 97);
        g2d.setColor(new Color(0, 124, 36));
        g2d.fill(shadow);
        g2d.setTransform(reset);
        

        g2d.scale(0.8, 0.8);
        g2d.translate(-60, 90);
        g2d.setColor(new Color(0, 105, 37));
        g2d.fill(sideCrown);
        g2d.setTransform(reset);

        g2d.scale(0.6, 0.6);
        g2d.translate(-40, 239);
        g2d.setColor(new Color(0, 124, 36));
        g2d.fill(shadow);
        g2d.setTransform(reset);

        

        

        
    }

}
