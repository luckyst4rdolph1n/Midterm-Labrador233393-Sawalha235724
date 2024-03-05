import java.awt.*;
import java.awt.geom.*;

public class PlantGroup implements DrawingObject{
    
    private double x;
    private double y;
    private Color plantColor;

    private Plant plants;

    public PlantGroup(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Color setColor(Color color){
        plantColor = color;
        return plantColor;
    }

    @Override
    public void draw(Graphics2D g2d){
        plants = new Plant(x, y);

        AffineTransform reset = g2d.getTransform();

        g2d.scale(0.75, 0.75);
        g2d.translate(760, 110);
        plants.draw(g2d);
        g2d.setTransform(reset);

        plants.draw(g2d);
        g2d.translate(-200, -10);
        plants.draw(g2d);
        g2d.setTransform(reset);

        g2d.scale(0.7, 0.7);
        g2d.translate(400, 150);
        plants.draw(g2d);
        g2d.setTransform(reset);

        g2d.scale(0.7, 0.7);
        g2d.translate(5, 120);
        plants.draw(g2d);
        g2d.setTransform(reset);

        g2d.scale(0.8, 0.8);
        g2d.translate(460, 110);
        plants.draw(g2d);
        g2d.setTransform(reset);

        g2d.scale(1.5, 1.5);
        g2d.translate(-300, -50);
        plants.draw(g2d);
        g2d.translate(500, 0);
        plants.draw(g2d);
        g2d.setTransform(reset);

    }

}
