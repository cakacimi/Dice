import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class dice extends PApplet {

Die cam;
Die mac;
int score;

public void setup()
{
size(600,300);
}

public void draw()
{
  background(0,100,0); 
  cam = new Die(100,100);
  mac = new Die(400,100);
  cam.show();
  mac.show();
  fill(255,0,0);
  textSize(32);
  text ("Total: " + score, 220,150);
  
  noLoop();
}

public void mousePressed()
{
  redraw();
}

class Die 
{
  int myX, myY, numDots1;

  Die(int x, int y) 
  {
  myX = x;
  myY = y;
  numDots1= (int)(Math.random()*6)+1;
  

  
  }
  
  public void roll()
  {
  numDots1= (int)(Math.random()*6)+1;
  }
 public void show()

  { 
   
  
  if (numDots1 == 1)
  {//dice 1.1 outline//
  score = score +1;
  fill(0);
  rect(myX,myY,100,100);  
  fill(255);
  ellipse(myX + 50,myY + 50, 20, 20);
  }

  if (numDots1==2)
  {//dice 1.2 outline//
  score = score +2;
  fill(255);
  rect(myX,myY,100,100);
  fill(0);
  ellipse(myX+30, myY+30, 20, 20);
  ellipse(myX+70, myY+70, 20, 20);
  
  }
  
  if (numDots1==3)  
  {//dice 1.3 outline//
  score = score +3;
  fill(0);
  rect(myX,myY,100,100);  
  fill(255);
  ellipse(myX+20,myY+20, 20, 20);
  ellipse(myX+50,myY+50, 20, 20);
  ellipse(myX+80,myY+80, 20, 20);
  }

  if (numDots1==4)
  {//dice 1.4 outline//
  score = score +4;
  fill(255);
  rect(myX,myY,100,100);
  fill(0);
  ellipse(myX+30, myY+30, 20, 20);
  ellipse(myX+70, myY+30, 20, 20);
  ellipse(myX+30, myY+70, 20, 20);
  ellipse(myX+70, myY+70, 20, 20);
  }  

  if (numDots1==5)
  {//dice 1.5 outline//
  score = score +5;
  fill(0);
  rect(myX,myY,100,100);  
  fill(255);
  ellipse(myX+30, myY+30, 20, 20);
  ellipse(myX+70, myY+30, 20, 20);
  ellipse(myX+30, myY+70, 20, 20);
  ellipse(myX+70, myY+70, 20, 20);
  ellipse(myX+50, myY+50, 20, 20);
  }  
  
  if (numDots1==6)
  {//dice 1.6 outline//
  score = score +6;
  fill(255);
  rect(myX,myY,100,100);
  fill(0);
  ellipse(myX+32, myY+20, 20, 20);
  ellipse(myX+68, myY+20, 20, 20);
  ellipse(myX+68, myY+50, 20,20);
  ellipse(myX+32, myY+50, 20,20);
  ellipse(myX+32, myY+80, 20, 20);
  ellipse(myX+68, myY+80, 20, 20);
  }
 
  }
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "dice" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
