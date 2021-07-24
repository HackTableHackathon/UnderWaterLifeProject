import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet {
  public static PImage backgroundImage;
  private ArrayList<InteractiveObjects> gameObjects = new ArrayList<InteractiveObjects>();
  /**
   * Main method
   * @param args
   */
  public static void main(String[] args) {

    PApplet.main("Main"); // do not add any other statement to your TreasureHunt.main() method

  }
  /**
   * sets display window
   */
  @Override
  public void settings() {
    size(800, 600);
  }
  
  @Override
  public void setup() {
    this.getSurface().setTitle("Life Under Water");
    backgroundImage = this.loadImage("images" + File.separator + "background-scene.png");
    InteractiveObjects.setProcessing(this);
  
  }
  @Override
  public void draw() {
    this.image(backgroundImage, 0, 0);
    
    
    Action action = new Action("");
    for (int i = 0; i < gameObjects.size(); i++) {
      // update the Interactive Object if it returns null
      action = gameObjects.get(i).update();
      if (action != null) {
        // call act() if gameObject return non-null reference
        action.act(gameObjects);
      }
      for (int k = gameObjects.size()-1; k >= 0; k--) {
        // if the object is deactivated, remove that object from the arraylist
        if (!gameObjects.get(k).isActive()) {
          gameObjects.remove(k);
        }
      }
    }
  }
}
