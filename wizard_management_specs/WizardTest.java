import static org.junit.Assert.*;
import org.junit.*;
import wizard_management.*;

public class WizardTest {

  Wizard wizard;
  Broomstick broomstick;
  MagicCarpet magicCarpet;
  Dragon dragon;
  Ogre ogre;

  @Before
  public void before(){
    broomstick = new Broomstick("Nimbus", 10);
    wizard = new Wizard("Toby", broomstick);
  }

  @Test
  public void hasName(){
    assertEquals("Toby", wizard.getName());
  }

  @Test
  public void hasBroomstick(){
    Broomstick ride = (Broomstick)wizard.getRide();
    assertEquals("Nimbus", ride.getBrand());
  }

  @Test
  public void canFlyBroomStick(){
    assertEquals(wizard.fly(),"mounting broom, running, skipping, flying!");
  }
  @Test
  public void canFlyDragon(){
    Dragon dragon = new Dragon("Smaug");
    wizard  = new Wizard("Ridcully", dragon);
    assertEquals("Standing up tall, beating wings, lift off!",wizard.fly());
  }
  @Test 
  public void canFlyMagicCarpet(){
    MagicCarpet magicCarpet = new MagicCarpet("Green");
    wizard = new Wizard("CarpetRider", magicCarpet);
    assertEquals("Hovering up, straightening out, flying off!", wizard.fly());
  }
  @Test
  public void canSetRide(){
    Dragon dragon = new Dragon("Erik");
    wizard.setRide(dragon);
    assertEquals("Standing up tall, beating wings, lift off!",wizard.fly());

  }

  @Test
  public void canUseBeastToDefend(){
    magicCarpet = new MagicCarpet("Red");
    dragon = new Dragon("Red, the defender");
    wizard = new Wizard("Colin", magicCarpet, dragon);
    assertEquals("Red, the defender swooops in and breaths fire on all hostile targets", wizard.protect());
  }

    @Test
    public void canChangeProtector(){
      magicCarpet = new MagicCarpet("Blue");
      dragon = new Dragon("Cringer");
      ogre = new Ogre("Mr. Smelly ogre");
      wizard = new Wizard("Colin", magicCarpet, dragon);
      wizard.setProtector(ogre);
      assertEquals("Mr. Smelly ogre does what an ogre does to its enemies.", wizard.protect());

    }
  }