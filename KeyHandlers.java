/**
	This KeyHandlers class implements KeyListener for when a user presses certain letters.
    It is necessaary for switching between day and night mode.
    It also allows the initial message to disappear.
    It allows for the barking effect to take plaace.
	
	@authors Zandalee Beck Q. Labrador (233393); Shamika Anne E. Sawalha (235724) 
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

public class KeyHandlers implements KeyListener{

    public boolean barked, day, night, disappearMessage;
    SoundFx barking = new SoundFx(); //initiated the sound so it can be called when a key is pressed
    
    @Override
    public void keyTyped(KeyEvent e){ //empty since this is not used
    }

    @Override
    public void keyPressed(KeyEvent e){
        int pressed = e.getKeyCode();

        // for the barking effect
        if(pressed == KeyEvent.VK_B){
            //made a thread so the barked will change its state automatically
            new Thread(new Runnable()
            {
                @Override
                public void run()
                {
                    barked = true;
                    barking.PlaySound("BarkSound.wav", false); //barking sound will play once only
                    
                    try {
                        Thread.sleep(1000); //after one second, barked will become false
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                
                    barked = false;
                }
            }).start();
        }

        //switches to day mode when D is pressed
        else if(pressed == KeyEvent.VK_D){
            day = true;
            night = false;
        }

        //switches to night mode when N is pressed
        else if(pressed == KeyEvent.VK_N){
            night = true;
            day = false;
        }

        //makes the welcome message disappear when pressing enter
        else if(pressed == KeyEvent.VK_ENTER){
            disappearMessage = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e){ //empty since this is not used
    }
}
