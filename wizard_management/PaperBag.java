package wizard_management;
import behaviours.Protector;
public class PaperBag implements Protector{
  String color;
  public PaperBag(String color){
    this.color = color;
  }
  public String protect(){
    return color + " paper bag offers little protection.";
  }
}