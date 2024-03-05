/**
	This Sun class is for drawing the sun.
    	The sun only appears in day moded.
     	This class also contains the foundation of animating the sun's glow.
	
	@author Zandalee Beck Q. Labrador (233393); Shamika Anne E. Sawalha (235724) 
	@version 2 March 2024
	
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

public class Sun implements DrawingObject{
    
    private double x;
    private double y;
    private double size;
    private Color sunColor;

    private Circle sunBody;
    private Circle sunGlow;
    private Line sunLine;

    private Boolean state = true;

    public Sun(double x, double y, double size, Color sunColor){
        this.x = x;
        this.y = y;
        this.size = size;
        this.sunColor = sunColor;
    }

    public void generateSun(){ //dtaws the body of the sun and a ray
        sunBody = new Circle(x, y, size, sunColor, new Color(0, 0, 0 ,0));
        sunLine = new Line(((x+size)+x)/2, y-5,((x+size)+x)/2, y-40, 1, sunColor);
    }

    //overrides the draw method
    @Override
    public void draw(Graphics2D g2d){
        generateSun();
        AffineTransform reset = g2d.getTransform();

        //the movement of the sun's glow as it is animated
        if(state){
            sunGlow = new Circle(x-15, y-15, size+30, new Color(255, 233, 95, 100), new Color(0, 0, 0 ,0));
            sunGlow.draw(g2d);
        }else{
            sunGlow = new Circle(x-20, y-20, size+40, new Color(255, 233, 95, 100), new Color(0, 0, 0 ,0));
            sunGlow.draw(g2d);
        }
        
        sunBody.draw(g2d);
        sunLine.draw(g2d);

        //the following loop is for creating multiple rays around the sun
        int degs = 30;
        for(int i=0; i<11; i++){
            g2d.setTransform(reset);
            g2d.rotate(Math.toRadians(0+degs),((x+size)+x)/2,((y+size)+y)/2);
            sunLine.draw(g2d);
            degs+=30;
        }
        
        g2d.setTransform(reset);
    }

    //animating the glow by alternating the states
    public void glow(){
        if (state){
            state = false;
        }else{
            state = true;
        }
    }

}
