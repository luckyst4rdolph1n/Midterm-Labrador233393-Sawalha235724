/**
	This class creates a Tree object.
    It is responsible for the position and colors of a Tree object.
	
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

public class Trees implements DrawingObject{
    
    private double x;
    private double y;
    private Color trunkColor, crownColor1, crownColor2, crownColor3, shadowColor1, shadowColor2;

    private Triangle trunk;
    private Path2D.Double topCrown, sideCrown, branches, shadow;

    /**
     * Constructor for the Tree class.
     * @param x
     * @param y
     * @param trunkColor
     * @param crownColor1
     * @param crownColor2
     * @param crownColor3
     * @param shadowColor1
     * @param shadowColor2
     */
    public Trees(double x, double y, Color trunkColor, Color crownColor1, Color crownColor2, Color crownColor3, Color shadowColor1, Color shadowColor2 ){
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
     * Instantiates the parts of a Tree object.
     */
    public void generateTreeParts(){
        trunk = new Triangle(x, y, 200, 50, trunkColor);//new Color(108, 60, 31)
        
        topCrown = new Path2D.Double();
        topCrown.moveTo(x-50, y-150);
        topCrown.curveTo(x-50, y-270, x+95, y-270, x+100, y-150);
        topCrown.closePath();

        sideCrown = new Path2D.Double();
        sideCrown.moveTo(x-30, y-150);
        sideCrown.curveTo(x-30, y-220, x+75, y-220, x+80, y-150);
        sideCrown.closePath();

        branches = new Path2D.Double();
        branches.moveTo(x+70, y-150);
        branches.curveTo(x+60, y-110, x+50, y-110, x+30, y-110);
        branches.moveTo(x+70, y-150);
        branches.curveTo(x+60, y-113, x+50, y-113, x+30, y-115);

        branches.moveTo(x-50, y-140);
        branches.curveTo(x-40, y-90, x, y-90, x+20, y-90);
        branches.moveTo(x-50, y-140);
        branches.curveTo(x-40, y-95, x, y-95, x+20, y-95);

        shadow = new Path2D.Double();
        shadow.moveTo(x-25, y-220);
        shadow.curveTo(x, y-245, x+50, y-245, x+70, y-220);
        shadow.curveTo(x+95, y-190, x-50, y-190, x-25, y-220);
        shadow.closePath();

    }

    /**
     * Overridden method of the DrawingObject interface.
     * Renders a Tree object.
     */
    @Override
    public void draw(Graphics2D g2d){
        generateTreeParts();
        AffineTransform reset = g2d.getTransform();
        trunk.draw(g2d);
        g2d.setColor(trunkColor);//Color(108, 60, 31)
        g2d.setStroke(new BasicStroke(10));
        g2d.draw(branches);
        
        g2d.setColor(crownColor1);//new Color(0, 139, 50)
        g2d.fill(topCrown);

        g2d.setColor(shadowColor1); //new Color(0, 162, 50)
        g2d.fill(shadow);

        g2d.translate(45, 0);
        g2d.setColor(crownColor2);//new Color(1, 104, 32)
        g2d.fill(sideCrown);

        g2d.scale(0.8, 0.8);
        g2d.translate(30, 97);
        g2d.setColor(shadowColor2);//new Color(0, 124, 36)
        g2d.fill(shadow);
        g2d.setTransform(reset);

        g2d.scale(0.8, 0.8);
        g2d.translate(-60, 90);
        g2d.setColor(crownColor3);//new Color(0, 105, 37)
        g2d.fill(sideCrown);
        g2d.setTransform(reset);

        g2d.scale(0.6, 0.6);
        g2d.translate(-40, 239);
        g2d.setColor(shadowColor2);//new Color(0, 124, 36)
        g2d.fill(shadow);
        g2d.setTransform(reset);

        

        

        
    }

}
