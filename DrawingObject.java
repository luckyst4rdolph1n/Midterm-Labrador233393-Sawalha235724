/**
	This DrawingObject interface contains the abstract method draw.
    It will allow the other classes to have a draw function and conveniently use it to draw the image.
	
	@author Zandalee Beck Q. Labrador (233393); Shamika Anne E. Sawalha (235724) 
	@version 25 February 2024
	
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

public interface DrawingObject {
    //the abstract method that allows classes to make their image
    public void draw(Graphics2D g2d);

}
