/**
	This BackgroundNight class is for the background when in night mode.
    It serves as the first layer of the drawing.
    This will be shown when N is pressed.
	
	@authors Zandalee Beck Q. Labrador (233393); Shamika Anne E. Sawalha (235724) 
	@version 26 February 2024
	
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
import java.awt.geom.*;

public class BackgroundNight implements DrawingObject{
    int x;
    int y;
    int width;
    int height;
    KeyHandlers forNight;

    //sets the position and size of the background
    public BackgroundNight(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        forNight = new KeyHandlers(); //KeyHandler is instantiated here so it can be accessed easily later
    }

    public void draw(Graphics2D g2d){
        Point2D.Double pt1 = new Point2D.Double(0, 0);
        Point2D.Double pt2 = new Point2D.Double(0, height);
        Color nightColor1 = new Color(21, 24, 41);
        Color nightColor2 = new Color(99, 101, 114);

        Rectangle2D.Double background = new Rectangle2D.Double(0, 0, width, height);
        GradientPaint night = new GradientPaint(pt1, nightColor1, pt2, nightColor2, true); //color is gradient depicting the night sky
        g2d.setPaint(night);
        g2d.fill(background);

    }
}
