/**
	This class contains the components of the JFrame.
    It creates an instance of the SceneCanvas class.
    Also contains and implements the ActionListeners 
    for the Cloud, Sun, Star, and Moon objects of the program.
	
	@author Zandalee Beck Q. Labrador (233393); Shamika Anne E. Sawalha (235724) 
	@version 5 March 2024
	
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

import java.awt.event.*;
import javax.swing.*;


public class SceneFrame{

    private JFrame frame;
    private int width;
    private int height;
    private SceneCanvas sc;
    public boolean barked, day, night;
    private SoundFx bgm;

    /**
     * Constructor for SceneFrame class.
     * @param w
     * @param h
     */
    public SceneFrame(int w, int h){
        frame = new JFrame();
        w = width;
        h = height;
        sc = new SceneCanvas(800, 600);
        bgm = new SoundFx();
    }

    /**
     * Configures the JFrame and adds the JComponents to display them.
     */
    public void setUpGUI(){
        frame.setTitle("Midterm Project - Labrador - Sawalha");
        frame.add(sc);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        cloudTimer.start();
        GlowTimer.start();
        starTwinkleTimer.start();

        frame.addKeyListener(sc.dogBase.forBark);
        frame.addKeyListener(sc.daybg.forDay);
        frame.addKeyListener(sc.nightbg.forNight);
        frame.addKeyListener(sc.welcome.disappear);

        bgm.PlaySound("bgm.wav", true);

    }

    /**
     * Anonymous class that creates the ActionListener for
     * the movement of Cloud Objects.
     * Repaints the canvas.
     */
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

    /**
     * Anonymous class that creates the ActionListener for
     * the changing states of the Sun and Moon objects.
     * Repaints the canvas.
     */
    ActionListener GlowActionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae){
            sc.getSun().glow();
            sc.getMoon().glow();
            sc.repaint();
        }
    };

    /**
     * Anonymous class that creates the ActionListener for
     * the changing states of the Star objects.
     * Repaints the canvas.
     */
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

    /**
     * Timers for the speed of movement and state switching.
     * Each assigned to their own ActionListener.
     */
    Timer cloudTimer = new Timer(0, cloudActionListener);
    Timer GlowTimer = new Timer(500, GlowActionListener);
    Timer starTwinkleTimer = new Timer(600, starTwinkleActionListener);
    
    }
