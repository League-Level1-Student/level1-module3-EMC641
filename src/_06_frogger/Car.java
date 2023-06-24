package _06_frogger;

import processing.core.PApplet;


public class Car extends PApplet {

	int x;
	int y;
	int size;
	int speed;
	
	
	
	
	Car(int x,int y,int size, int speed) {
		this.x = x;
		this.y = y;
		this.size = size;
		this.speed = speed;
		
	
	}

	
 void display()
	  {
	    rect(844 , 600,  size, 50);
	    fill(0,255,0);
	    
	  }

void moveLeft() {
	x--;
	if(x==0) {
		x=600;
	}
}

void moveRight() {
	x++;
	
	if(x==600) {
		x=0;
	}
}
 
int getX() {
	return x;
}

int getY() {
	return y;
}

int getSize() {
	return size;
}

boolean intersects(Car car) {
	 if ((y> car.getY() && y < car.getY()+50) &&
	                (x > car.getX() && x < car.getX()+car.getSize())) {
	   return true;
	  }
	 else  {
	  return false;
	 }
}
}
  


