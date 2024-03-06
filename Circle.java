/**
	This Circle class is for making circles.
    	The circle is a basic and mandatory shape.
   	It is used in drawing other figures.
	
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

public class Circle implements DrawingObject{
    
    private double x;
    private double y;
    private double size;
    private Color colorFill;
    private Color colorOutline;

    /* The constructor has 5 parameters.
    The fill of the circle may be different from the color of the outline.  */ 
    public Circle(double x, double y, double size, Color colorFill, Color colorOutline){
        this.x = x;
        this.y = y;
        this.size = size;
        this.colorFill = colorFill;
        this.colorOutline = colorOutline;
    }

    /**
     * Overridden draw method of the DrawingObject interface.
     * Renders the Cloud object.
     */
    @Override
    public void draw(Graphics2D g2d){
        Ellipse2D.Double circle = new Ellipse2D.Double(x, y, size, size);
        g2d.setColor(colorFill);
        g2d.fill(circle);
        g2d.setStroke(new BasicStroke(2));
        g2d.setColor(colorOutline);
        g2d.draw(circle);
    }

}
