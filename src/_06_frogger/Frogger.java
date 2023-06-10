package _06_frogger;

import processing.core.PApplet;

//do step number 13 and continue from there
public class Frogger extends PApplet {
    static final int WIDTH = 844;
    static final int HEIGHT = 600;
    
    
    Car superCar = new Car(100,100, 20, 5);
    Car dirtyCar = new Car(100,125,20,4);
    
    
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
    	ellipse(X, Y, 80, 80);
    	
    	superCar.display();
    	dirtyCar.display();
    	
    	superCar.moveLeft();
    	dirtyCar.moveLeft();
    	
    	superCar.moveRight();
    	dirtyCar.moveLeft();
    	
    	
    	
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
