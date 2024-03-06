/**
	This class creates a Cloud object.
    It is responsible for the position, size, and color of the Cloud object.
	
	@author Zandalee Beck Q. Labrador (233393); Shamika Anne E. Sawalha (235724) 
	@version 1 March 2024
	
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

public class Cloud implements DrawingObject {

    private double x;
    private double y;
    private double size;
    private Color color;

    private Ellipse2D.Double e1;
    private Ellipse2D.Double e2;
    private Ellipse2D.Double e3;
    private Ellipse2D.Double e4;
    private Ellipse2D.Double e5;
    
    /**
     * Contructor of the Cloud class.
     * @param x
     * @param y
     * @param size
     * @param color
     */
    public Cloud(double x, double y, double size, Color color){
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
    }

    /**
     * Instantiates the parts of the Cloud.
     */
    public void generateCloud(){
        e1 = new Ellipse2D.Double(x, y, size, size);
        e2 = new Ellipse2D.Double(x+size*.25, y-size*.2, size*1.75, size*1.4);
        e3 = new Ellipse2D.Double(x+size*1.5, y+size*.15, size*.9, size*.9);
        e4 = new Ellipse2D.Double(x+size*1.7, y+size*.05, size*.3, size*.3);
        e5 = new Ellipse2D.Double(x+size*.02, y+size*.6, size*.3, size*.3);
    }

    /**
     * Overridden draw method of the DrawingObject interface.
     * Renders the Cloud object.
     */
    public void draw(Graphics2D g2d){
        AffineTransform reset = g2d.getTransform();
        generateCloud();
        g2d.translate(0, 5);
        g2d.setColor(new Color(199, 238, 254, 150));
        g2d.fill(e1);
        g2d.fill(e2);
        g2d.fill(e3);
        g2d.fill(e4);
        g2d.fill(e5);
        g2d.setTransform(reset);

        g2d.setColor(color);
        g2d.fill(e1);
        g2d.fill(e2);
        g2d.fill(e3);
        g2d.fill(e4);
        g2d.fill(e5);
    }

    /**
     * Changes the position of the Cloud object incrementally through its x-coordinate.
     * Resets the position of the Cloud objects.
     */
    public void moveCloud(){
        if (x < 800){
            x += 1;
        }
        else{
            x = -200;
        }
    }
    
}
