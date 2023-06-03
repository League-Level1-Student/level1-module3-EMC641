package _06_frogger;

import processing.core.PApplet;

//start on step number 6 and continue there
public class Frogger extends PApplet {
    static final int WIDTH = 844;
    static final int HEIGHT = 600;
    
    @Override
    public void settings() {
        size(844,600);        
    }

    @Override
    public void setup() {
    	
    }

    @Override
    public void draw() {
    	background(0, 150, 255);
    	fill(0, 255, 0);
    	ellipse(X, Y, 50, 50);
    	
    	 
    }
    
    
    public void keyPressed()
    {
        if(key == CODED){
            if(keyCode == UP)
            {
                //Frog Y position goes up
            }
            else if(keyCode == DOWN)
            {
                //Frog Y position goes down 
            }
            else if(keyCode == RIGHT)
            {
                //Frog X position goes right
            }
            else if(keyCode == LEFT)
            {
                //Frog X position goes left
            }
        }
    }
    
    
    
    
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
        
        
        
        
        
    }
}
