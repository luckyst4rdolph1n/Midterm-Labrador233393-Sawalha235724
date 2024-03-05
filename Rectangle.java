/**
	This Rectangle class is for drawing  a rectangle shape.
    It is a convenient way to create rectangle and minimize code lines.
	
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

public class Rectangle implements DrawingObject{
    
    double x;
    double y;
    double width;
    double height;
    Color color;

    //sets the rectangle's position, size, and color
    public Rectangle(double x, double y, double width, double height, Color color){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
        
    }

    //overrides the draw method
    @Override
    public void draw(Graphics2D g2d){
        Rectangle2D.Double rectangle = new Rectangle2D.Double(x, y, width, height);
        g2d.setColor(color);
        g2d.fill(rectangle);
    }

}
