import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
  JFrame frame = new JFrame();
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
      // use switch case to determine which counter the trash is currently being removed
      switch (COUNTER % 8) {
        case 0: {
          JDialog dialog = new JDialog();
          dialog.setUndecorated(true);

          JLabel label = new JLabel(new ImageIcon("images" + File.separator + "factCards.jpg"));
          dialog.setLocation(36, 235);
          dialog.add(label);
          dialog.pack();
          dialog.setVisible(true);


          String answer = JOptionPane.showInputDialog(
              "Around how many species since 2009 have been reported to have ingested or become trapped in plastic? (enter an integer) \n40    50    60    70");
          while (answer != null && !answer.toLowerCase().equals("40")) {
            answer = JOptionPane.showInputDialog("Wrong, Please Try Again");
          }
          dialog.setVisible(false);
          break;

        }
        case 1: {

          JDialog dialog = new JDialog();
          dialog.setUndecorated(true);

          JLabel label = new JLabel(new ImageIcon("images" + File.separator + "factCard2.jpg"));
          dialog.setLocation(36, 235);
          dialog.add(label);
          dialog.pack();
          dialog.setVisible(true);



          String answer = JOptionPane.showInputDialog(
              "What do marine wildlife mistake plastic waste for? (one word, lowercase) \nplastic    prey    mate    predator");
          while (answer != null && !answer.toLowerCase().equals("prey")) {
            answer = JOptionPane.showInputDialog("Wrong, Please Try Again");
          }
          dialog.setVisible(false);
          break;
        }
        case 2: {

          JDialog dialog = new JDialog();
          dialog.setUndecorated(true);

          JLabel label = new JLabel(new ImageIcon("images" + File.separator + "factCard3.jpg"));
          dialog.setLocation(36, 235);
          dialog.add(label);
          dialog.pack();
          dialog.setVisible(true);


          String answer = JOptionPane.showInputDialog(
              "How many times larger is the surface area of the Great Pacific Garbage Patch compared to Texas? (one word, lowercase) \ntenth    fifth    twice    thrice");
          while (answer != null && !answer.toLowerCase().equals("twice")) {
            answer = JOptionPane.showInputDialog("Wrong, Please Try Again");
          }
          dialog.setVisible(false);
          break;
        }


        case 3: {

          JDialog dialog = new JDialog();
          dialog.setUndecorated(true);

          JLabel label = new JLabel(new ImageIcon("images" + File.separator + "factCard4.jpg"));
          dialog.setLocation(36, 235);
          dialog.add(label);
          dialog.pack();
          dialog.setVisible(true);


          String answer = JOptionPane.showInputDialog(
              "How many rivers does 90% of the worldwide ocean debris come from? (integer) \n20    5    10    15");
          while (answer != null && !answer.toLowerCase().equals("10")) {
            answer = JOptionPane.showInputDialog("Wrong, Please Try Again");
          }
          dialog.setVisible(false);
          break;
        }


        case 4: {

          JDialog dialog = new JDialog();
          dialog.setUndecorated(true);

          JLabel label = new JLabel(new ImageIcon("images" + File.separator + "factCard5.jpg"));
          dialog.setLocation(36, 235);
          dialog.add(label);
          dialog.pack();
          dialog.setVisible(true);

          String answer = JOptionPane.showInputDialog(
              "How many million of marine animals die each year from plastic waste? (integer) \n50    100    150    200");
          while (answer != null && !answer.toLowerCase().equals("100")) {
            answer = JOptionPane.showInputDialog("Wrong, Please Try Again");
          }
          dialog.setVisible(false);
          break;
        }
        case 5: {


          JDialog dialog = new JDialog();
          dialog.setUndecorated(true);

          JLabel label = new JLabel(new ImageIcon("images" + File.separator + "factCard6.jpg"));
          dialog.setLocation(36, 235);
          dialog.add(label);
          dialog.pack();
          dialog.setVisible(true);

          String answer = JOptionPane.showInputDialog(
              "When was this study release? (enter a date, exactly as formatted in the fact) \nNovember 12, 2020    November 13, 2020    November 14, 2020    November 15, 2020");
          while (answer != null && !answer.toLowerCase().equals("November 13, 2020")) {
            answer = JOptionPane.showInputDialog("Wrong, Please Try Again");
          }
          dialog.setVisible(false);
          break;
        }
        case 6: {

          JDialog dialog = new JDialog();
          dialog.setUndecorated(true);

          JLabel label = new JLabel(new ImageIcon("images" + File.separator + "factCard7.jpg"));
          dialog.setLocation(36, 235);
          dialog.add(label);
          dialog.pack();
          dialog.setVisible(true);

          String answer = JOptionPane.showInputDialog(
              "How many fish at markets in California contained plastic in their guts? \nquarter    eighth    half    third");
          while (answer != null && !answer.toLowerCase().equals("quarter")) {
            answer = JOptionPane.showInputDialog("Wrong, Please Try Again");
          }
          dialog.setVisible(false);
          break;
        }
        case 7: {

          JDialog dialog = new JDialog();
          dialog.setUndecorated(true);

          JLabel label = new JLabel(new ImageIcon("images" + File.separator + "factCard8.jpg"));
          dialog.setLocation(36, 235);
          dialog.add(label);
          dialog.pack();
          dialog.setVisible(true);

          String answer = JOptionPane.showInputDialog(
              "What percentage of seabird species will have eaten pieces of plastic by 2050? (integer) \n50    25    99    75");
          while (answer != null && !answer.toLowerCase().equals("99")) {
            answer = JOptionPane.showInputDialog("Wrong, Please Try Again");
          }
          dialog.setVisible(false);
          break;
        }
      }
      COUNTER++;
      return action;

    }

    return null;
  }

}
