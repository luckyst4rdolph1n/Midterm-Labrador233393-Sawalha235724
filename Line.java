/**
	This Line class is for making a line.
    It minimizes the number of lines when making a line.
	
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

public class Line implements DrawingObject{
    
    double startX;
    double startY;
    double endX;
    double endY;
    float thickness;
    Color color;
    
    //draws the line and sets the thickness and color
    public Line(double startX, double startY, double endX,  double endY, float thickness, Color color){
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.thickness = thickness;
        this.color = color;
    }

    //overrides the draw method
    @Override
    public void draw(Graphics2D g2d){
        Line2D.Double line = new Line2D.Double(startX, startY, endX, endY); //draws the line
        g2d.setStroke(new BasicStroke(thickness)); //adjust thickness
        g2d.setColor(color); //change the color
        g2d.draw(line);
    }
}
