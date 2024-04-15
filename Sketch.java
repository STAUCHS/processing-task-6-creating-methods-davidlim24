import processing.core.PApplet;

public class Sketch extends PApplet {
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
    size(1200, 1200);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(65, 105, 225);
    for (int x = 0; x <= width; x += 200) {
        for (int y = 0; y <= height; y += 200) {
            drawHouse(x, y, 255, 0, 0, 150); 
        }
    }
}

public void drawHouse(int intHouseX, int intHouseY, int intRed, int intGreen, int intBlue, int size) {
    // Drawing code for the house
    stroke(0);
    fill(intRed, intGreen, intBlue);
    rect(intHouseX, intHouseY, size, size - 50);

    // Drawing code for the roof
    fill(255, 218, 185); 
    triangle(intHouseX, intHouseY, intHouseX + size/2, intHouseY - size/2, intHouseX + size, intHouseY);

    // Drawing code for the door and handle
    fill(255, 102, 102); // Change door color
    rect(intHouseX + size/4, intHouseY + size/3, size/2, size - 100); 
    fill(0);
    ellipse(intHouseX + size/2, intHouseY + size - 50, 10, 10); 
}
}
  

  
  
  
  
 
  /**
   * Description
   * 
   * @param 
   * @param 
   * @return
   * @author 
   */

  
  
