import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;

public class SceneCanvas extends JComponent{
    private int width;
    private int height;
    BackgroundDay daybg;
    BackgroundNight nightbg;
    private DayTrees trees;
    private Ground ground, grass, grass2;
    private Sun sun;
    private Cloud cloud1, cloud2, cloud3, cloud4;
    private LampGroup streetLamps;
    private PlantGroup plants;

    private Star s1, s2, s3, s4, s5, s6, s7, s8, s9;
    private Moon moon;

    DogBase dogBase;

    private ArrayList<DrawingObject> dayElements;
    private ArrayList<DrawingObject> nightElements;

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
        dayElements.add(trees);
        dayElements.add(plants);
        dayElements.add(streetLamps);
    }

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
        nightElements.add(grass);
        nightElements.add(ground);
        nightElements.add(grass2);
        nightElements.add(trees);
        nightElements.add(plants);
        nightElements.add(streetLamps);
    }

    public SceneCanvas(int w, int h){
        width = w;
        height = h;
        this.setPreferredSize(new Dimension(width, height));
        daybg = new BackgroundDay(0, 0, width, 400);
        nightbg = new BackgroundNight(0, 0, width, height);
        ground = new Ground(0, 470, 800, 150, new Color(96, 96, 96));
        grass = new Ground(0, 400, 800, 150, new Color(175, 204, 54));
        grass2 = new Ground(0, 550, 800, 150, new Color(175, 204, 54));
        sun = new Sun(300, 100, 150, new Color(255, 233, 95, 130));
        cloud1 = new Cloud(150, 40, 70, new Color(255, 255, 255));
        cloud2 = new Cloud(450, 20, 60, new Color(255, 255, 255));
        cloud3 = new Cloud(700, 30, 70, new Color(255, 255, 255));
        cloud4 = new Cloud(-100, 10, 70, new Color(255, 255, 255));
        trees = new DayTrees(100, 450);
        plants = new PlantGroup(300, 400);
        streetLamps = new LampGroup(100, 80);

        dogBase = new DogBase(300, 400);

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

        dayElements = new ArrayList<>();
        setUpDayElements();
        nightElements = new ArrayList<>();
        setUpNightElements();
    }
    
    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        
        RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);


        for (int i=0; i<dayElements.size(); i++){
            dayElements.get(i).draw(g2d);
        }

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

        if(dogBase.forBark.barked){
            dogBase.drawBark(g2d);
        }
        else dogBase.draw(g2d);

    }

    public Cloud getCloud1(){
        return cloud1;
    }

    public Cloud getCloud2(){
        return cloud2;
    }

    public Cloud getCloud3(){
        return cloud3;
    }

    public Cloud getCloud4(){
        return cloud4;
    }

    public Sun getSun(){
        return sun;
    }

    public Star getS1(){
        return s1;
    }

    public Star getS2(){
        return s2;
    }
    
    public Star getS3(){
        return s3;
    }

    public Star getS4(){
        return s4;
    }

    public Star getS5(){
        return s5;
    }

    public Star getS6(){
        return s6;
    }

    public Star getS7(){
        return s7;
    }

    public Star getS8(){
        return s8;
    }

    public Star getS9(){
        return s9;
    }

}
