/**
	This SceneStarter class is for running the program.
    It contains the main method.
	
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
public class SceneStarter {
    //main method for setting up the GUI and running the program
    public static void main(String[] args) {
        SceneFrame sf = new SceneFrame(800, 600);
        sf.setUpGUI();
    }
    
}
