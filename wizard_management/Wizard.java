package wizard_management;
import behaviours.Flyable;
import behaviours.Protector;

public class Wizard {

  private String name;
  private Flyable ride;
  private Protector protector;
  private static Protector defaultProtector = new PaperBag("Brown");

  public Wizard(String name, Flyable ride, Protector protector){
    this.name = name;
    this.ride = ride;
    this.protector = protector;
  }

  public Wizard(String name, Flyable ride){
    this(name,ride,defaultProtector);
  }

  public String getName(){
    return this.name;
  }

  public Flyable getRide(){
    return this.ride;
  }

  public String fly(){
    return this.ride.fly();
  }

  public void setRide(Flyable ride){
    this.ride = ride;
  }

  public String protect(){
    return this.protector.protect();
  }

  public void setProtector(Protector protector){
    this.protector = protector;
  }
}