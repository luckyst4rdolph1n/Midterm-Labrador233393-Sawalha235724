/**
	This class groups the Plant objects.
    It is responsible for transformations applied to the Plant objects.
	
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

public class PlantGroup implements DrawingObject{
    
    private double x;
    private double y;
    private Color plantColor;

    private Plant plants;

    /**
     * Constructor of the Plant class.
     * @param x
     * @param y
     */
    public PlantGroup(double x, double y){
        this.x = x;
        this.y = y;
    }

    /**
     * Overridden method of the DrawingObject interface.
     * Renders the Plant objects.
     */
    @Override
    public void draw(Graphics2D g2d){
        plants = new Plant(x, y);

        AffineTransform reset = g2d.getTransform();

        g2d.scale(0.75, 0.75);
        g2d.translate(760, 110);
        plants.draw(g2d);
        g2d.setTransform(reset);

        plants.draw(g2d);
        g2d.translate(-200, -10);
        plants.draw(g2d);
        g2d.setTransform(reset);

        g2d.scale(0.7, 0.7);
        g2d.translate(400, 150);
        plants.draw(g2d);
        g2d.setTransform(reset);

        g2d.scale(0.7, 0.7);
        g2d.translate(5, 120);
        plants.draw(g2d);
        g2d.setTransform(reset);

        g2d.scale(0.8, 0.8);
        g2d.translate(460, 110);
        plants.draw(g2d);
        g2d.setTransform(reset);

        g2d.scale(1.5, 1.5);
        g2d.translate(-300, -50);
        plants.draw(g2d);
        g2d.translate(500, 0);
        plants.draw(g2d);
        g2d.setTransform(reset);

    }

}
