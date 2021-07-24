import processing.core.PApplet;
public class InteractiveObjects {
  private final String NAME;
  private boolean isActive;
  private static PApplet processing = null;
  
  public InteractiveObjects (String name) {
    this.NAME = name;
    this.isActive = true;
  }
  
  public boolean hasName(String name) {
    return (name.equals(NAME));
  }
  public boolean isActive() {
    return isActive;
  }
  public void activate() {
    isActive = true;
  }
  public void deactivate() {
    isActive = false;
  }
  // will be override
  public  Action update() {
    return null;
  }
  public static void setProcessing(PApplet processing) {
    InteractiveObjects.processing = processing;
  }
  // retrieves static field for subclasses to use
  protected static PApplet getProcessing() {
    return processing;
  }
}
