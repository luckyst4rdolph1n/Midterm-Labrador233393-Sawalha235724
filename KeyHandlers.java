import java.awt.event.*;

public class KeyHandlers implements KeyListener{

    public boolean barked, day, night;
    @Override
    public void keyTyped(KeyEvent e){
        
    }

    @Override
    public void keyPressed(KeyEvent e){
        int pressed = e.getKeyCode();
        if(pressed == KeyEvent.VK_B){
            barked = true;
        }

        else if(pressed == KeyEvent.VK_D){
            day = true;
            night = false;
        }

        else if(pressed == KeyEvent.VK_N){
            night = true;
            day = false;
        }
    }

    @Override
    public void keyReleased(KeyEvent e){

    }
}
