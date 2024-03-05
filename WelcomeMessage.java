/**
	This WelcomeMessage class is for the initial message seen.
    It draws the message box when running the program.
	
	@author Zandalee Beck Q. Labrador (233393); Shamika Anne E. Sawalha (235724) 
	@version 6 March 2024
	
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

public class WelcomeMessage implements DrawingObject{
    int x, y, size;
    Color color;
    KeyHandlers disappear;

    //constructor with parameters of where to put the message and how big it should be
    public WelcomeMessage(int x, int y, int size){
        this.x = x;
        this.y = y;
        this.size = size;
        disappear = new KeyHandlers(); //initiated a KeyHandlers so it can be accessed later
    }

    public void draw(Graphics2D g2d){

        Color red = new Color(248, 74, 60, 190);

        Square base = new Square(x, y, size, red);
        base.draw(g2d);

        Font tnr = new Font("Times New Roman", Font.PLAIN, 16); //sets a new font
        g2d.setFont(tnr);
        g2d.setColor(Color.BLACK);

        //the text that can be seen in the message box
        g2d.drawString("> Press D to activate day mode.", x+40, y+150);
        g2d.drawString("> Press N to activate night mode.", x+40, y+180);
        g2d.drawString("> Press B to make Chobog bark. Please don't spam.", x+40, y+210);
        g2d.drawString("> Press Enter to make this message disappear.", x+40, y+240);


    }
}