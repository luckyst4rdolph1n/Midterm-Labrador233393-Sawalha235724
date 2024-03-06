/**
	This class groups the Tree objects.
    It is responsible for the transformations applied to the Tree objects.
	
	@author Zandalee Beck Q. Labrador (233393); Shamika Anne E. Sawalha (235724) 
	@version 29 February 2024
	
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

public class GroupTrees implements DrawingObject{
    private double x;
    private double y;
    private Color trunkColor, crownColor1, crownColor2, crownColor3, shadowColor1, shadowColor2;

    private Trees trees;

    /**
     * Constructor of the GroupTrees class.
     * @param x
     * @param y
     * @param trunkColor
     * @param crownColor1
     * @param crownColor2
     * @param crownColor3
     * @param shadowColor1
     * @param shadowColor2
     */
    public GroupTrees(double x, double y, Color trunkColor, Color crownColor1, Color crownColor2, Color crownColor3, Color shadowColor1, Color shadowColor2 ){

        this.x = x;
        this.y = y;
        this.trunkColor = trunkColor;
        this.crownColor1 = crownColor1;
        this.crownColor2 = crownColor2;
        this.crownColor3 = crownColor3;
        this.shadowColor1 = shadowColor1;
        this.shadowColor2 = shadowColor2;

    }

    /**
     * Overridden method of the DrawingObject interface.
     * Renders the group of Tree objects.
     */
    public void draw(Graphics2D g2d){

        trees = new Trees(x, y, trunkColor, crownColor1, crownColor2, crownColor3, shadowColor1, shadowColor2);

        AffineTransform reset = g2d.getTransform();

        //1st tree
        g2d.scale(1.2, 1.2);
        g2d.translate(0, -90);
        trees.draw(g2d);
        g2d.setTransform(reset);
        //3rd tree
        g2d.scale(1.2, 1.2);
        g2d.translate(350, -90);
        trees.draw(g2d);
        g2d.setTransform(reset);
        //2nd tree
        g2d.scale(1.3, 1.3);
        g2d.translate(150, -95);
        trees.draw(g2d);
        g2d.setTransform(reset);
        //4th tree
        g2d.scale(1.4, 1.4);
        g2d.translate(400, -120);
        trees.draw(g2d);
        g2d.setTransform(reset);
        //5th tree
        g2d.scale(1.4, 1.4);
        g2d.translate(-100, -120);
        trees.draw(g2d);
        g2d.setTransform(reset);


    }
}
