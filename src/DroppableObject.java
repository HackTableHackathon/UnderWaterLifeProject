import javax.swing.JOptionPane;

/**
 * Class that allows us to specify a target for this kind of interactive object to be dropped on
 * along with an action that is produced when this happens. It extends DraggableObject
 *
 * @author Steven Lai
 */
public class DroppableObject extends DraggableObject {
  private VisibleObject target; // object over which this object can be dropped
  private Action action; // action that results from dropping this object
  private static int COUNTER = 0;
  // over target
  // initialize new object

  public DroppableObject(String name, int x, int y, VisibleObject target, Action action) {
    super(name, x, y);
    this.target = target;
    this.action = action;
    COUNTER = 0;
  }

  /**
   * returns action and deactivates objects in response to successful drop When this object is over
   * its target and its target is active: deactivate both this object and the target object, and
   * return action, otherwise return null
   */
  @Override
  protected Action drop() {
    if (this.isOver(target) && target.isActive()) {
      this.deactivate();


      switch (COUNTER % 8) {
        case 0: {
          String answer = JOptionPane.showInputDialog("Do you understand1");
          while (answer != null && !answer.equals("A")) {
            answer = JOptionPane.showInputDialog("Do you understand1");
          }
          break;

        }
        case 1: {
          String answer = JOptionPane.showInputDialog("Do you understand2");
          while (answer != null && !answer.equals("A")) {
            answer = JOptionPane.showInputDialog("Do you understand2");
          }
          break;
        }
        case 2: {
          String answer = JOptionPane.showInputDialog("Do you understand3");
          while (answer != null && !answer.equals("A")) {
            answer = JOptionPane.showInputDialog("Do you understand3");
          }
          break;
        }
        case 3: {
          String answer = JOptionPane.showInputDialog("Do you understand4");
          while (answer != null && !answer.equals("A")) {
            answer = JOptionPane.showInputDialog("Do you understand4");
          }
          break;
        }
        case 4: {
          String answer = JOptionPane.showInputDialog("Do you understand5");
          while (answer != null && !answer.equals("A")) {
            answer = JOptionPane.showInputDialog("Do you understand5");
          }
          break;
        }
        case 5: {
          String answer = JOptionPane.showInputDialog("Do you understand6");
          while (answer != null && !answer.equals("A")) {
            answer = JOptionPane.showInputDialog("Do you understand6");
          }
          break;
        }
        case 6: {
          String answer = JOptionPane.showInputDialog("Do you understand7");
          while (answer != null && !answer.equals("A")) {
            answer = JOptionPane.showInputDialog("Do you understand7");
          }
          break;
        }
        case 7: {
          String answer = JOptionPane.showInputDialog("Do you understand8");
          while (answer != null && !answer.equals("A")) {
            answer = JOptionPane.showInputDialog("Do you understand8");
          }
          break;
        }
      }
      COUNTER++;
      return action;

    }

    return null;
  }

}
