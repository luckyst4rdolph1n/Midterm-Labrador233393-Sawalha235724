import java.awt.*;
import java.awt.geom.*;

public class Plant implements DrawingObject{
    
    private double x;
    private double y;
    private Color plantColor;

    private Ellipse plantLeaf;

    public Plant(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Color setColor(Color color){
        plantColor = color;
        return plantColor;
    }

    @Override
    public void draw(Graphics2D g2d){

        AffineTransform reset = g2d.getTransform();

        setColor(new Color(50, 96, 4));
        plantLeaf = new Ellipse(x, y, 20, 60, plantColor);
        plantLeaf.draw(g2d);

        g2d.rotate(Math.toRadians(30), x+10, y+60);
        setColor(new Color(62, 132, 1));
        plantLeaf = new Ellipse(x, y, 20, 60, plantColor);
        plantLeaf.draw(g2d);
        g2d.setTransform(reset);

        g2d.rotate(Math.toRadians(-30), x+10, y+60);
        plantLeaf.draw(g2d);
        g2d.setTransform(reset);

        g2d.rotate(Math.toRadians(60), x+10, y+60);
        setColor(new Color(64, 155, 0));
        plantLeaf = new Ellipse(x, y, 20, 60, plantColor);
        plantLeaf.draw(g2d);
        g2d.setTransform(reset);

        g2d.rotate(Math.toRadians(-60), x+10, y+60);
        plantLeaf.draw(g2d);
        g2d.setTransform(reset);
    }

}

