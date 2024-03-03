import java.awt.*;
import java.awt.geom.*;

public class Sun implements DrawingObject{
    
    double x;
    double y;
    double size;
    Color sunColor;

    /*double startX;
    double startY;
    double endX;
    double endY;*/
    //Color lineColor;
    
    private Circle sunBody;
    private Circle sunGlow;
    private Line sunLine;

    public Sun(double x, double y, double size, Color sunColor){
        this.x = x;
        this.y = y;
        this.size = size;
        this.sunColor = sunColor;
        /*this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;*/
        //this.lineColor = lineColor;
    }

    public void generateSun(){
        sunBody = new Circle(x, y, size, sunColor);
        sunGlow = new Circle(x-15, y-15, size+30, new Color(255, 233, 95, 100));
        sunLine = new Line(((x+size)+x)/2, y-5,((x+size)+x)/2, y-40, 1, sunColor);
    }

    @Override
    public void draw(Graphics2D g2d){
        generateSun();
        AffineTransform reset = g2d.getTransform();

        sunGlow.draw(g2d);
        sunBody.draw(g2d);
        sunLine.draw(g2d);

        int degs = 30;
        for(int i=0; i<11; i++){
            g2d.setTransform(reset);
            g2d.rotate(Math.toRadians(0+degs),((x+size)+x)/2,((y+size)+y)/2);
            sunLine.draw(g2d);
            degs+=30;
        }
        
        g2d.setTransform(reset);
    }

}