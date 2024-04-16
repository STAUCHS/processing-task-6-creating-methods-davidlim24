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
 




/**
 * Called once at the beginning of execution. Add initial set up
 * values here i.e background, stroke, fill etc.
 */
public void setup() {
  background(125, 85, 225);
  int garageSize = 150;
  int heartSize = 20;
  for (int x = 0; x <= width; x += 200) {
    for (int y = 0; y <= height; y += 200) {
      int[] garageColor = {255, 0, 0};
      drawHouse(x, y, garageColor, garageSize);
      if (x < width - 200) {
        drawHeart(x + garageSize / 2 + 100, y + garageSize - 70, heartSize);
      }
      if (y < height - 200) {
        drawHeart(x + garageSize / 2, y + garageSize + 100, heartSize);
      }
    }
  }
}


/**
 * create garage.
 * @param intgarageX - The x-coordinate of the garage.
 * @param intgarageY - The y-coordinate of the garage.
 * @param garageColor - The color of the garage.
 * @param size - The size of the garage.
 * @author D.l


 */
public void drawHouse(int intgarageX, int intgarageY, int[] garageColor, int size) {
  stroke(0);
  fill(garageColor[0], garageColor[1], garageColor[2]);
  rect(intgarageX, intgarageY, size, size - 50);


  // create the roof of garage
  fill(15, 248, 185);
  triangle(intgarageX, intgarageY, intgarageX + size/2, intgarageY - size/2, intgarageX + size, intgarageY);


  // create garage door
  fill(123, 102, 102);
  rect(intgarageX + size/4, intgarageY + size/3, size/2, size - 100);
  fill(0);
}


/**
 * Draw a heart shape at the specified coordinates with the given size.
 * @param x - The x-coordinate of the heart.
 * @param y - The y-coordinate of the heart.
 * @param size - The size of the heart.
 * @author D.l
 */
public void drawHeart(float x, float y, float size) {
  float halfSize = size / 2;
  ellipse(x - halfSize / 2, y, halfSize, halfSize);
  ellipse(x + halfSize / 2, y, halfSize, halfSize);
  triangle(x - halfSize, y, x + halfSize, y, x, y + size / 2);
  triangle(x - halfSize, y, x + halfSize, y, x, y + size / 2);
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


 
 


