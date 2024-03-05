import java.awt.event.*;
import javax.swing.*;


public class SceneFrame{

    private JFrame frame;
    private int width;
    private int height;
    private SceneCanvas sc;
    public boolean barked, day, night;

    public SceneFrame(int w, int h){
        frame = new JFrame();
        w = width;
        h = height;
        sc = new SceneCanvas(800, 600);
    }

    public void setUpGUI(){
        frame.setTitle("Midterm Project - Labrador - Sawalha");
        frame.add(sc);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        cloudTimer.start();
        sunGlowTimer.start();
        starTwinkleTimer.start();

        frame.addKeyListener(sc.dogBase.forBark);
        frame.addKeyListener(sc.daybg.forDay);
        frame.addKeyListener(sc.nightbg.forNight);

    }

    ActionListener cloudActionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae){
            sc.getCloud1().moveCloud();
            sc.getCloud2().moveCloud();
            sc.getCloud3().moveCloud();
            sc.getCloud4().moveCloud();
            sc.repaint();
        }
    };

    ActionListener sunGlowActionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae){
            sc.getSun().glow();
            sc.repaint();
        }
    };

    ActionListener starTwinkleActionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae){
            sc.getS1().twinkle();
            sc.getS2().twinkle();
            sc.getS3().twinkle();
            sc.getS4().twinkle();
            sc.getS5().twinkle();
            sc.getS6().twinkle();
            sc.getS7().twinkle();
            sc.getS8().twinkle();
            sc.getS9().twinkle();
            sc.repaint();
        }
    };

    Timer cloudTimer = new Timer(0, cloudActionListener);
    Timer sunGlowTimer = new Timer(500, sunGlowActionListener);
    Timer starTwinkleTimer = new Timer(600, starTwinkleActionListener);
    
    }
