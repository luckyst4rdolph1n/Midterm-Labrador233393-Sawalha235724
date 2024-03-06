/**
	This class creates a Plant object.
    It is responsible for the position and colors of the Plant object.
	
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

public class Plant implements DrawingObject{
    
    private double x;
    private double y;
    private Color color1, color2, color3;

    private Ellipse2D.Double plantLeaf;

    /**
     * Constructor of the Plant class.
     * @param x
     * @param y
     * @param color1
     * @param color2
     * @param color3
     */
    public Plant(double x, double y, Color color1, Color color2, Color color3){
        this.x = x;
        this.y = y;
        this.color1 = color1;
        this.color2 = color2;
        this.color3 = color3;
    }

    /**
     * Overridden method of the DrawingObject interface.
     * Renders the plant object.
     */
    @Override
    public void draw(Graphics2D g2d){

        AffineTransform reset = g2d.getTransform();

        plantLeaf = new Ellipse2D.Double(x, y, 20, 60);
        g2d.setColor(color1);
        g2d.fill(plantLeaf);

        g2d.setColor(color2);
        plantLeaf = new Ellipse2D.Double(x, y, 20, 60);
        g2d.rotate(Math.toRadians(30), x+10, y+60);
        g2d.fill(plantLeaf);
        g2d.setTransform(reset);

        g2d.rotate(Math.toRadians(-30), x+10, y+60);
        g2d.fill(plantLeaf);
        g2d.setTransform(reset);

        g2d.setColor(color3);
        plantLeaf = new Ellipse2D.Double(x, y, 20, 60);
        g2d.rotate(Math.toRadians(60), x+10, y+60);
        g2d.fill(plantLeaf);
        g2d.setTransform(reset);

        g2d.rotate(Math.toRadians(-60), x+10, y+60);
        g2d.fill(plantLeaf);
        g2d.setTransform(reset);
    }

}

