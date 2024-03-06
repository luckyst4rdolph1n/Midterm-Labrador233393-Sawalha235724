/**
	This class creates a Ground object.
    It is responsible for the position, size, and color of a Ground object.
	
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

public class Ground implements DrawingObject{
    
    double x;
    double y;
    double width;
    double height;
    Color color;

    /**
     * Constructor of the Ground class.
     * @param x
     * @param y
     * @param width
     * @param height
     * @param color
     */
    public Ground(double x, double y, double width, double height, Color color){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
        
    }

    /**
     * Overridden method of the DrawingObject interface.
     * Renders the Ground object.
     */
    @Override
    public void draw(Graphics2D g2d){
        Rectangle2D.Double ground = new Rectangle2D.Double(x, y, width, height);
        g2d.setColor(color);
        g2d.fill(ground);
    }

}
