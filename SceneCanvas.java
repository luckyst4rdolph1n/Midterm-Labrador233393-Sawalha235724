/**
	This class extends JComponent and is the canvas of the program.
    It contains and creates instances of the objects displayed in the program.
    It also contains the paint component and Graphics2D object used to render elements.
	
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
import javax.swing.*;
import java.util.ArrayList;

public class SceneCanvas extends JComponent{
    private int width;
    private int height;
    BackgroundDay daybg;
    BackgroundNight nightbg;
    private GroupTrees dayTrees;
    private GroupTrees nightTrees;
    private Ground ground, grass, grass2, nightGround, nightGrass, nightGrass2;
    private Sun sun;
    private Cloud cloud1, cloud2, cloud3, cloud4;
    private LampGroup dayStreetLamps, nightStreetLamps;
    private PlantGroup dayPlants, nightPlants;

    private Star s1, s2, s3, s4, s5, s6, s7, s8, s9;
    private Moon moon;

    DogBase dogBase;

    private ArrayList<DrawingObject> dayElements;
    private ArrayList<DrawingObject> nightElements;

    /**
     * Populates the dayElements ArrayList.
     */
    private void setUpDayElements(){
        dayElements.add(daybg);
        dayElements.add(sun);
        dayElements.add(cloud1);
        dayElements.add(cloud2);
        dayElements.add(cloud3);
        dayElements.add(cloud4);
        dayElements.add(grass);
        dayElements.add(ground);
        dayElements.add(grass2);
        dayElements.add(dayTrees);
        dayElements.add(dayPlants);
        dayElements.add(dayStreetLamps);
    }

    /**
     * Populates the nightElements ArrayList.
     */
    private void setUpNightElements(){
        nightElements.add(nightbg);
        nightElements.add(moon);
        nightElements.add(s1);
        nightElements.add(s2);
        nightElements.add(s3);
        nightElements.add(s4);
        nightElements.add(s5);
        nightElements.add(s6);
        nightElements.add(s7);
        nightElements.add(s8);
        nightElements.add(s9);
        nightElements.add(nightGrass);
        nightElements.add(nightGround);
        nightElements.add(nightGrass2);
        nightElements.add(nightTrees);
        nightElements.add(nightPlants);
        nightElements.add(nightStreetLamps);
    }

    /**
     * Constructor of the SceneCanvas class
     * Instantiates the objects.
     * @param w width of canvas
     * @param h height of canvas
     */
    public SceneCanvas(int w, int h){
        width = w;
        height = h;
        this.setPreferredSize(new Dimension(width, height));

        //Instantiated day setting elements
        daybg = new BackgroundDay(0, 0, width, 400);
        ground = new Ground(0, 470, 800, 150, new Color(96, 96, 96));
        grass = new Ground(0, 400, 800, 150, new Color(175, 204, 54));
        grass2 = new Ground(0, 550, 800, 150, new Color(175, 204, 54));
        sun = new Sun(300, 100, 150, new Color(255, 233, 95, 130));
        cloud1 = new Cloud(150, 40, 70, new Color(255, 255, 255));
        cloud2 = new Cloud(450, 20, 60, new Color(255, 255, 255));
        cloud3 = new Cloud(700, 30, 70, new Color(255, 255, 255));
        cloud4 = new Cloud(-100, 10, 70, new Color(255, 255, 255));
        dayTrees = new GroupTrees(100, 450, new Color(108, 60, 31), new Color(0, 139, 50), new Color(1, 104, 32), new Color(0, 105, 37), new Color(0, 162, 50), new Color(0, 124, 36));
        dayStreetLamps = new LampGroup(100, 80, new Color(216, 255, 255));

        //Instantiated night setting elements
        nightbg = new BackgroundNight(0, 0, width, 400);
        nightGround = new Ground(0, 470, 800, 150, new Color(58, 57, 61));
        nightGrass = new Ground(0, 400, 800, 150, new Color(17, 28, 49));
        nightGrass2 = new Ground(0, 550, 800, 150, new Color(17, 28, 49));
        nightTrees = new GroupTrees(100, 450, new Color(20, 56, 82), new Color(3, 48, 69), new Color(6, 43, 61), new Color(5, 42, 60), new Color(4, 74, 100), new Color(7, 63, 88));
        dayPlants = new PlantGroup(300, 400, new Color(50, 96, 4), new Color(62, 132, 1), new Color(64, 155, 0));
        nightPlants = new PlantGroup(300, 400, new Color(11, 23, 35), new Color(10, 38, 50), new Color(14, 75, 94));
        nightStreetLamps = new LampGroup(100, 80, Color.YELLOW);
        moon = new Moon(300, 100, 150);
        s1 = new Star(30, 60, 10, Color.WHITE);
        s2 = new Star(125, 40, 8, Color.WHITE);
        s3 = new Star(220, 75, 9, Color.WHITE);
        s4 = new Star(315, 90, 6, Color.WHITE);
        s5 = new Star(425, 65, 11, Color.WHITE);
        s6 = new Star(500, 110, 7, Color.WHITE);
        s7 = new Star(610, 95, 9, Color.WHITE);
        s8 = new Star(690, 70, 12, Color.WHITE); 
        s9 = new Star(765, 60, 10, Color.WHITE);

        dogBase = new DogBase(300, 400);

        dayElements = new ArrayList<>();
        setUpDayElements();
        nightElements = new ArrayList<>();
        setUpNightElements();
    }
    
    /**
     * Overrides the abstract method paintComponent from JComponent.
     * Used to render the elements of the program.
     * @param g Graphics object used to draw elements,
     * casted into a Graphics2D object.
     */
    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        
        RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);

        /**
         * Draws the default setting: Day
         * by getting each item from the dayElements
         * ArrayList and calling their draw method.
         */
        for (int i=0; i<dayElements.size(); i++){
            dayElements.get(i).draw(g2d);
        }

        /**
         * Changes the setting of the program
         * based on the condition fulfilled through KeyListeners.
         */
        if(daybg.forDay.day){
            for (int i=0; i<dayElements.size(); i++){
                dayElements.get(i).draw(g2d);
            }
        }
        else if(nightbg.forNight.night){
            for (int i=0; i<nightElements.size(); i++){
                nightElements.get(i).draw(g2d);
            }
        }

        /**
         * Changes the appearance of the dogBase object
         * based on the condition fulfilled through KeyListeners.
         */
        if(dogBase.forBark.barked){
            dogBase.drawBark(g2d);
        }
        else dogBase.draw(g2d);

    }

    /**
     * Returns cloud1 object.
     * @return cloud1
     */
    public Cloud getCloud1(){
        return cloud1;
    }

    /**
     * Returns cloud2 object.
     * @return cloud2
     */
    public Cloud getCloud2(){
        return cloud2;
    }

    /**
     * Returns cloud3 object.
     * @return cloud3
     */
    public Cloud getCloud3(){
        return cloud3;
    }

    /**
     * Returns cloud4 object.
     * @return cloud4
     */
    public Cloud getCloud4(){
        return cloud4;
    }

    /**
     * Returns sun object.
     * @return sun
     */
    public Sun getSun(){
        return sun;
    }

    /**
     * Returns moon object.
     * @return moon
     */
    public Moon getMoon(){
        return moon;
    }

    /**
     * Returns (star) s1 object.
     * @return s1
     */
    public Star getS1(){
        return s1;
    }

    /**
     * Returns (star) s2 object.
     * @return s2
     */
    public Star getS2(){
        return s2;
    }
    
    /**
     * Returns (star) s3 object.
     * @return s3
     */
    public Star getS3(){
        return s3;
    }

    /**
     * Returns (star) s4 object.
     * @return s4
     */
    public Star getS4(){
        return s4;
    }

    /**
     * Returns (star) s5 object.
     * @return s5
     */
    public Star getS5(){
        return s5;
    }

    /**
     * Returns (star) s6 object.
     * @return s6
     */
    public Star getS6(){
        return s6;
    }

    /**
     * Returns (star) s7 object.
     * @return s7
     */
    public Star getS7(){
        return s7;
    }

    /**
     * Returns (star) s8 object.
     * @return s8
     */
    public Star getS8(){
        return s8;
    }

    /**
     * Returns (star) s9 object.
     * @return s9
     */
    public Star getS9(){
        return s9;
    }

}
