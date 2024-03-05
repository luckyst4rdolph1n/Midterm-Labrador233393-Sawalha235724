/**
	This class groups the Street Lamp objects.
    It is responsible for the transformations applied to the Street Lamp objects.
	
	@author Zandalee Beck Q. Labrador (233393); Shamika Anne E. Sawalha (235724) 
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

public class LampGroup implements DrawingObject{
    
    private double x;
    private double y;
    private Color lampColor;

    private StreetLamp streetLamps;

    /**
     * Constructor of the LampGroup class.
     * @param x
     * @param y
     * @param lampColor
     */
    public LampGroup(double x, double y, Color lampColor){
        this.x = x;
        this.y = y;
        this.lampColor = lampColor;
    }

    /**
     * Overridden method of the DrawingObject interface.
     * Renders the grouped Street Lamp objects.
     */
    @Override
    public void draw(Graphics2D g2d){
        AffineTransform reset = g2d.getTransform();

        streetLamps = new StreetLamp(x, y, lampColor);

        streetLamps.draw(g2d);
        g2d.translate(400, 0);
        streetLamps.draw(g2d);
        g2d.setTransform(reset);
    }
}
