import java.util.ArrayList;

/**
 * Action class that represent the response to an object being clicked or
 * dragged onto another.
 *
 */
public class Action {
  private String message; // message printed by this action (or null to do nothing)
  private InteractiveObjects object;

  /**
   * create and initialize this new action
   */
  public Action(String message) {
    this.message = message;
  }

  public Action(InteractiveObjects object) {
    this.object = object;
  }

  public Action(String message, InteractiveObjects object) {
    this.message = message;
    this.object = object;
  }

  /**
   * when message is not null, message is printed to System.out
   * 
   * if object is not nukk, it is activated and added to the arraylist
   * @param ArrayList of InteractiveObjects
   */
  public void act(ArrayList<InteractiveObjects> objects) {
    if (message != null) {
      System.out.println(message);
    }
    if (this.object != null) {
      this.object.activate();
      objects.add(object);
      this.object = null;
    }
  }
}
