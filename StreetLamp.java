import java.awt.*;
import java.awt.geom.*;

public class StreetLamp implements DrawingObject{
    
    private double x;
    private double y;
    private Color lampColor;

    private Circle light;
    private Rectangle lightBase;
    private Path2D.Double lightBaseCurve;
    private Path2D.Double lampPost;
    private Rectangle upper;
    private Rectangle mid;
    private Path2D.Double low;

    public StreetLamp(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void generateStreetLampParts(){
        light = new Circle(x, y, 50, new Color(216, 255, 255), new Color(0, 0, 0, 0));
        lightBase = new Rectangle((4*x+25)/4, y+(0.85*50), (1.25*x+25)/4, 10, Color.BLACK);
        
        lightBaseCurve = new Path2D.Double();
        lightBaseCurve.moveTo((4*x+25)/4, y+(0.85*50));
        lightBaseCurve.curveTo((2*x+50)/2,y+80, (2*x+50)/2,y+80, (5.25*x+50)/4, y+(0.85*50) );
        lightBaseCurve.closePath();

        lampPost = new Path2D.Double();
        lampPost.moveTo(((4*x+25)/4)+5, y+400);
        lampPost.lineTo(((2*x+50)/2)-3,y+50);
        lampPost.lineTo(((2*x+50)/2)+3.5,y+50);
        lampPost.lineTo(((4*x+25)/4)+35,y+400);
        lampPost.closePath();

        upper = new Rectangle(((4*x+25)/4)+11.5, y+80, 15, 5, Color.BLACK);
        mid = new Rectangle(x, y+250, 50, 10, Color.BLACK);
       
        low = new Path2D.Double();
        low.moveTo(((4*x+25)/4)+5, y+400);
        low.lineTo(((4*x+25)/4)-5, y+410);
        low.lineTo(((4*x+25)/4)-5, y+420);
        low.lineTo(((4*x+25)/4)+45, y+420);
        low.lineTo(((4*x+25)/4)+45, y+410);
        low.lineTo(((4*x+25)/4)+35, y+400);
        low.closePath();
    }

    @Override
    public void draw(Graphics2D g2d){
        generateStreetLampParts();
        light.draw(g2d);
        lightBase.draw(g2d);

        g2d.setColor(Color.BLACK);
        g2d.fill(lightBaseCurve);
        g2d.fill(lampPost);

        upper.draw(g2d);
        mid.draw(g2d);
        g2d.fill(low);

    }
}
