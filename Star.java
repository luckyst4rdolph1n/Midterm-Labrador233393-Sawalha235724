/**
	This Star class is for drawing a star shape.
    It utilizes the triangle and pentagon classes.
    Stars will only appear during the night mode.
	
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

public class Star implements DrawingObject{
    
    private double x;
    private double y;
    private double size;
    private Color color;

    private Boolean starState = true;

    //constructor is for the star's position, size, and color
    public Star(double x, double y, double size, Color color){
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
    }

    //overridinng the draw method
    @Override
    public void draw(Graphics2D g2d){
    AffineTransform reset = g2d.getTransform();

    //draws the star while animating it
    if(starState){
        Triangle t1 = new Triangle(x,y,5,size,color);
        t1.draw(g2d);

        Triangle t2 = new Triangle(x+size, y, 5, size, color);   
        g2d.rotate(Math.toRadians(72), x+size, y);
        t2.draw(g2d); 

        g2d.setTransform(reset);
        Triangle t3 = new Triangle(x+1.31*size ,y+0.95*size, 5, size, color);   
        g2d.rotate(Math.toRadians(144), x+1.31*size, y+0.95*size);
        t3.draw(g2d); 

        g2d.setTransform(reset);
        Triangle t4 = new Triangle((2*x+size)/2,y+1.54*size, 5, size, color); 
        g2d.rotate(Math.toRadians(216),(2*x+size)/2, y+1.54*size);
        t4.draw(g2d);   

        g2d.setTransform(reset);
        Triangle t5 = new Triangle(x-0.31*size, y+0.95*size, 5, size, color); 
        g2d.rotate(Math.toRadians(288), x-0.31*size, y+0.95*size);
        t5.draw(g2d);   

        g2d.setTransform(reset);
        Pentagon base = new Pentagon(x, y, size, color);
        base.draw(g2d);
    }

    //shifts the star's position and orientation
    else{
        int rs = 20;

        Triangle t1 = new Triangle(x,y,5,size-rs,color);
        t1.draw(g2d);

        Triangle t2 = new Triangle(x+(size-rs), y, 5, size-rs, color);   
        g2d.rotate(Math.toRadians(72), x+(size-rs), y);
        t2.draw(g2d); 

        g2d.setTransform(reset);
        Triangle t3 = new Triangle(x+1.31*(size-rs), y+0.95*(size-rs), 5, size-rs, color);   
        g2d.rotate(Math.toRadians(144), x+1.31*(size-rs), y+0.95*(size-rs));
        t3.draw(g2d); 

        g2d.setTransform(reset);
        Triangle t4 = new Triangle((2*x+(size-rs))/2,y+1.54*(size-rs), 5, size-rs, color); 
        g2d.rotate(Math.toRadians(216),(2*x+(size-rs))/2, y+1.54*(size-rs));
        t4.draw(g2d);   

        g2d.setTransform(reset);
        Triangle t5 = new Triangle(x-0.31*(size-rs), y+0.95*(size-rs), 5, size-rs, color); 
        g2d.rotate(Math.toRadians(288), x-0.31*(size-rs), y+0.95*(size-rs));
        t5.draw(g2d);   

        g2d.setTransform(reset);
        Pentagon base = new Pentagon(x, y, size-rs, color);
        base.draw(g2d);
    }

    }

    //alternates starState so star can be animated
    public void twinkle(){
        if(starState){
            starState = false;
        }else{
            starState = true;
        }
    }


}
