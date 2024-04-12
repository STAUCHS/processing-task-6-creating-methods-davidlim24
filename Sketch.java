import processing.core.PApplet;

public class Sketch extends PApplet {
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
    size(800, 800);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255, 255, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void drawflower(float x, float y) {
    fill(objColor);
    translate(x, y);
    for (int intPetals = 0; intPetals <= 10; intPetals++) {
      rotate(PI/4);
      ellipse(0, 0, size * 0.3, size * 3);
    }
    ellipse(0, 0, size, size);
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

  
  
