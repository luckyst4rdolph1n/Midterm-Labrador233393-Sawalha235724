/**
	This DogPaws class is for drawing the paws of the dog.
    It creates only one paw when instantiated.
	
	@author Zandalee Beck Q. Labrador (233393); Shamika Anne E. Sawalha (235724) 
	@version 27 February 2024
	
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
public class DogPaws implements DrawingObject{
    double x;
    double y;
    Color color;
    Color pawLineColor;

    //There are separate parameters for the fill of the paw and its outline.
    public DogPaws(double x, double y, Color color, Color pawLineColor){
        this.x = x;
        this.y = y;
        this.color = color;
        this.pawLineColor = pawLineColor;
    }

    //overriding the draw method of the DrawingObject interface
    @Override
    public void draw(Graphics2D g2d){
        //The general shape of the paw.
        Path2D.Double paws = new Path2D.Double();
        paws.moveTo(x,y);
        paws.lineTo(x, y+50);
        paws.curveTo(x, y+65, x+27, y+65, x+27, y+50);
        paws.lineTo(x+24, y);
        g2d.setColor(color);
        g2d.fill(paws);
        
        //nails of the paw
        g2d.setStroke(new BasicStroke(2));
        Line2D.Double pawLine = new Line2D.Double(x+9, y+60, x+9, y+48);
        Line2D.Double pawLine2 = new Line2D.Double(x+18, y+60, x+18, y+48);
        g2d.setColor(pawLineColor);
        g2d.draw(pawLine);
        g2d.draw(pawLine2);
        g2d.draw(paws);   
    }
}
