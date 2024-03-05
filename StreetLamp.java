/**
	This class creates a Street Lamp object.
    It is responsible for the position and color of the Street Lamp object.
	
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

public class StreetLamp implements DrawingObject{
    
    private double x;
    private double y;
    private Color lampColor;

    private Circle light;
    private Rectangle2D.Double lightBase, upper, mid;
    private Path2D.Double lightBaseCurve, lampPost, low;

    /**
     * Constructor of the Fire class.
     * @param x x-coordinate
     * @param y y-coordinate
     */

    public StreetLamp(double x, double y, Color lampColor){
        this.x = x;
        this.y = y;
        this.lampColor = lampColor;
    }

    /**
     * Instantiates the parts of the Street Lamp
     */
    public void generateStreetLampParts(){
        light = new Circle(x, y, 50, lampColor, new Color(0, 0, 0, 0));
        lightBase = new Rectangle2D.Double((4*x+25)/4, y+(0.85*50), (1.25*x+25)/4, 10);
        
        lightBaseCurve = new Path2D.Double();
        lightBaseCurve.moveTo((4*x+25)/4, y+(0.85*50));
        lightBaseCurve.curveTo((2*x+50)/2,y+80, (2*x+50)/2,y+80, (5.25*x+50)/4, y+(0.85*50) );
        lightBaseCurve.closePath();

        lampPost = new Path2D.Double();
        lampPost.moveTo(((4*x+25)/4)+5, y+400);
        lampPost.lineTo(((2*x+50)/2)-3,y+50);
        lampPost.lineTo(((2*x+50)/2)+3.5,y+50);
        lampPost.lineTo(((4*x+25)/4)+35,y+400);
        lampPost.closePath();

        upper = new Rectangle2D.Double(((4*x+25)/4)+11.5, y+80, 15, 5);
        mid = new Rectangle2D.Double(x, y+250, 50, 10);
       
        low = new Path2D.Double();
        low.moveTo(((4*x+25)/4)+5, y+400);
        low.lineTo(((4*x+25)/4)-5, y+410);
        low.lineTo(((4*x+25)/4)-5, y+420);
        low.lineTo(((4*x+25)/4)+45, y+420);
        low.lineTo(((4*x+25)/4)+45, y+410);
        low.lineTo(((4*x+25)/4)+35, y+400);
        low.closePath();
    }

    /**
     * Overridden method of the DrawingObjects interface
     * Renders the Street Lamp object
     * @param g2d
     */
    @Override
    public void draw(Graphics2D g2d){
        generateStreetLampParts();
        light.draw(g2d);
        g2d.setColor(Color.BLACK);
        g2d.fill(lightBase);
        g2d.fill(upper);
        g2d.fill(mid);

        g2d.setColor(Color.BLACK);
        g2d.fill(lightBaseCurve);
        g2d.fill(lampPost);

        g2d.fill(low);

    }
}
