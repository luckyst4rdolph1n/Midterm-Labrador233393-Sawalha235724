
import java.awt.*;
import java.awt.geom.*;
import java.util.ArrayList;

public class Bark implements DrawingObject{
    double x,y;
    double bx1, by1, bx2, by2;
    boolean barking;

    public Bark(double x, double y, double bx1, double by1, double bx2, double by2){
        this.x=x;
        this.y=y;
        this.bx1=bx1;
        this.by1=by1;
        this.bx2=bx2;
        this.by2=by2;
        
        barking = false;

    }

    public void draw(Graphics2D g2d){
        Color beige = new Color(255,195,105);
        g2d.setColor(beige);
        Path2D.Double mouth = new Path2D.Double();
        Path2D.Double mouth1 = new Path2D.Double();
        Path2D.Double mouth2 = new Path2D.Double();
        Path2D.Double mouth3 = new Path2D.Double();
        mouth.moveTo(x, y);
        mouth.curveTo(x+3.3, y+3, x+6.6, y+3, x+10, y);

        mouth1.moveTo(x, y);
        mouth1.curveTo(x+3.3, y+3.9, x+6.6, y+3.9, x+10, y);

        mouth2.moveTo(x, y);
        mouth2.curveTo(x+3.3, y+4.7, x+6.6, y+4.7, x+10, y);

        mouth3.moveTo(x, y);
        mouth3.curveTo(x+3.3, y+5.5, x+6.6, y+5.5, x+10, y);

        ArrayList<Path2D.Double> mouthFrames = new ArrayList<Path2D.Double>();
        mouthFrames.add(mouth);
        mouthFrames.add(mouth1);
        mouthFrames.add(mouth2);
        mouthFrames.add(mouth3);
        mouthFrames.add(null);
        



        
        g2d.draw(mouth1);
        g2d.draw(mouth1);
        g2d.draw(mouth2);
        g2d.draw(mouth3);
        
        g2d.setColor(beige);
        g2d.draw(mouth);

    }

    /*public void activate(){
        barking = true;
        while(barking){
            g2d.draw(mouth);

        }
    }*/


    
}
