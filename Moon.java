import java.awt.*;

public class Moon implements DrawingObject {
    double x;
    double y;
    double size;

    public Moon(double x, double y, double size){
        this.x = x;
        this.y = y;
        this.size = size;
    }

    @Override
    public void draw(Graphics2D g2d){
        Color gray = new Color(217, 217, 217, 150);
        Circle body = new Circle(x, y, size, Color.WHITE, Color.WHITE);
        Circle glow = new Circle(x-15, y-15, size+30, gray, gray);
        Circle crater1 = new Circle(x+15, y+65, 10, Color.DARK_GRAY, Color. DARK_GRAY);
        Circle crater2 = new Circle(x+50, y+10, 35, Color.DARK_GRAY, Color.DARK_GRAY);
        Circle crater3 = new Circle(x+65, y+50, 23, Color.DARK_GRAY, Color.DARK_GRAY);
        
        glow.draw(g2d);
        body.draw(g2d);
        crater1.draw(g2d);
        crater2.draw(g2d);
        crater3.draw(g2d);


    }
    
}
