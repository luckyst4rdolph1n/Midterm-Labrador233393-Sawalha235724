import java.awt.*;
import java.awt.geom.*;

public class DayTrees implements DrawingObject{
    private double x;
    private double y;
    private Trees trees;

    public DayTrees(double x, double y){

        this.x = x;
        this.y = y;

    }

    public void draw(Graphics2D g2d){

        trees = new Trees(x, y);

        AffineTransform reset = g2d.getTransform();

        //1st tree
        g2d.scale(1.2, 1.2);
        g2d.translate(0, -90);
        trees.draw(g2d);
        g2d.setTransform(reset);
        //3rd tree
        g2d.scale(1.2, 1.2);
        g2d.translate(350, -90);
        trees.draw(g2d);
        g2d.setTransform(reset);
        //2nd tree
        g2d.scale(1.3, 1.3);
        g2d.translate(150, -95);
        trees.draw(g2d);
        g2d.setTransform(reset);
        //4th tree
        g2d.scale(1.4, 1.4);
        g2d.translate(400, -120);
        trees.draw(g2d);
        g2d.setTransform(reset);
        //5th tree
        g2d.scale(1.4, 1.4);
        g2d.translate(-100, -120);
        trees.draw(g2d);
        g2d.setTransform(reset);


    }
}
