/**
	This Pentagon class is for drawing a pentagon shape.
    It is a basic shape that will be used in creating a star.
	
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

public class Pentagon implements DrawingObject{
    
    double x;
    double y;
    double size;
    Color color;

    //constructor for the pentagon's position, size, and its color
    public Pentagon(double x, double y, double size, Color color){
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
    }

    //overriding the draw method
    @Override
    public void draw(Graphics2D g2d){
        Path2D.Double p = new Path2D.Double();
        //this plots and connects the path in order to form a closed-pentagon and depends on the size
        p.moveTo(x, y);
        p.lineTo(x+size, y);
        p.lineTo(x+1.31*size, y+0.95*size);
        p.lineTo((2*x+size)/2, y+1.54*size);
        p.lineTo(x-0.31*size, y+0.95*size);
        p.closePath();
        g2d.setColor(color);
        g2d.fill(p);
    }

}
