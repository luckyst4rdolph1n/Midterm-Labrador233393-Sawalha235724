/**
	This BackgroundDay class is for the background when in day mode.
    	It serves as the first layer of the drawing.
    	This is also the initial background shown.
	
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

public class BackgroundDay implements DrawingObject{
    
    int x;
    int y;
    int width;
    int height;
    KeyHandlers forDay;

    //constructor for the BackgroundDay
    public BackgroundDay(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        forDay = new KeyHandlers(); //initiated the KeyHandler for shifting modes
    }

    //overrides the draw method of the DrawingObject interface
    @Override
    public void draw(Graphics2D g2d){
        Point2D.Double pt1 = new Point2D.Double(0, 0);
        Point2D.Double pt2 = new Point2D.Double(0, height);
        Color dayColor1 = new Color(167, 195, 245);
        Color dayColor2 = new Color(250, 224, 207);

        Rectangle2D.Double background = new Rectangle2D.Double(0, 0, width, height);
        GradientPaint day = new GradientPaint(pt1, dayColor1, pt2, dayColor2, true); //gradient color will be applied to the background
        g2d.setPaint(day);
        g2d.fill(background);

    }

}
