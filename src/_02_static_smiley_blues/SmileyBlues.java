package _02_static_smiley_blues;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SmileyBlues {
	void start() {
		// 1. Make a new JFrame and set it to be visible
		JFrame jFrame = new JFrame();
		jFrame.setVisible(true);
		// 2. Set your frame's default close operation to JFrame.EXIT_ON_CLOSE
		jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
		// 3. Make a new JPanel
		JPanel jPanel = new JPanel();
		// 4. Add your panel to your frame
		jFrame.add(jPanel);
		// 8. DO THIS LAST: 
		// Set the Smiley class's color variable to Smiley.YELLOW (NOT a specific smiley object's!) DONE
		// Using a specific object for a static variable works, but is not usually recommended.
		// Run it again; are your Smileys all yellow now? Also try changing them to red or green! DONE
		
		// 5. Make three Smiley objects and add them to your panel
		Smiley blue = new Smiley();
		Smiley red = new Smiley();
		Smiley green = new Smiley();
		
		jPanel.add(blue);
		jPanel.add(green);
		jPanel.add(red);
		
		// 6. Pack your frame
		jFrame.pack();
		// 7. RUN THE PROGRAM and make sure you see three blue Smileys!  DONE
	}
}
