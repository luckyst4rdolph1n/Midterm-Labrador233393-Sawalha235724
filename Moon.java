/**
	This Moon class is for drawing the moon.
    It can only be seen during the night mode.
	
	@author Zandalee Beck Q. Labrador (233393); Shamika Anne E. Sawalha (235724) 
	@version 2 March 2024
	
	I have not discussed the Java language code in my program 
	with anyone other than my instructor or the teaching assistants 
	assigned to this course.

	I have not used Java language code obtained from another student, 
	or any other unauthorized source, either modified or unmodified.

	If any Java language code or documentation used in my program 
	was obtained from another source, such as a textbook or website, 
	that has been clearly noted with a proper citation in the comments 
	of my program.
**/
import java.awt.*;

public class Moon implements DrawingObject {
    double x;
    double y;
    double size;

    //constructor for the moon's position and its size
    public Moon(double x, double y, double size){
        this.x = x;
        this.y = y;
        this.size = size;
    }

    //overrides the draw method
    @Override
    public void draw(Graphics2D g2d){
        Color gray = new Color(217, 217, 217, 150);
        Circle body = new Circle(x, y, size, Color.WHITE, Color.WHITE);
        Circle glow = new Circle(x-15, y-15, size+30, gray, gray); // halo effect
        //creates crater on top of the body of the moon
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
