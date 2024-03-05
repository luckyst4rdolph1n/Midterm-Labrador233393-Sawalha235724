/**
	This triangle class is for drawing the triangle shape.
    It is a basic shape drawn using paths.
    It will be used in making stars.
	
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

public class Triangle implements DrawingObject{
    
    double x;
    double y;
    double rise;
    double base;
    Color color;

    //constructor for setting the triangle's position, size, and color
    public Triangle(double x, double y, double rise, double base, Color color){
        this.x = x;
        this.y = y;
        this.rise = rise; //how tall is the triangle
        this.base = base; //how wide is the triangle
        this.color = color;
    }

    //overrides the draw method of DrawingObject
    @Override
    public void draw(Graphics2D g2d){
        Path2D.Double trianglePath = new Path2D.Double();
        //plots and connects the path in order to form a triangle
        trianglePath.moveTo(x,y);
        trianglePath.lineTo(x+base, y);
        trianglePath.lineTo((2*x+base)/2, y-rise);
        trianglePath.closePath();
        g2d.setColor(color);
        g2d.fill(trianglePath);

    }

}
