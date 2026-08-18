import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

public class Main {
  public static void main(String[] args) {  
    World world = new World(2000,2000);
    world.setVisible(true);

    Turtle yertle = new Turtle(900, 250, world);
    yertle.setName("Yertle");
    yertle.setBodyColor(Color.magenta);
    yertle.setShellColor(Color.black);
    yertle.setWidth(37);
    yertle.setHeight(20);
    yertle.setPenWidth(5);
    yertle.setPenColor(Color.darkGray);

    Turtle bertle = new Turtle(350, 450, world);
    bertle.setName("Bertle");
    bertle.setBodyColor(Color.orange);
    bertle.setShellColor(Color.cyan);
    bertle.setWidth(30);
    bertle.setHeight(30);
    bertle.setPenWidth(40);
    bertle.setPenColor(Color.green);

    Turtle marc = new Turtle(1200, 400, world);
    marc.setName("Marc");
    marc.setBodyColor(Color.blue);
    marc.setShellColor(Color.yellow);
    marc.setWidth(38);
    marc.setHeight(51);
    marc.setPenWidth(17);
    marc.setPenColor(Color.red);
    
    Turtle connor = new Turtle(700, 720, world);
    connor.setName("Connor");
    connor.setBodyColor(Color.black);
    connor.setShellColor(Color.orange);
    connor.setWidth(27);
    connor.setHeight(100);
    connor.setPenWidth(9);
    connor.setPenColor(Color.pink);

    yertle.house(100,50);
    connor.squareLine(9, 50);
    marc.star(12, 100);
    marc.penUp();
    marc.forward(100);
    bertle.plus(200,100);
    bertle.penUp();
    bertle.forward(210);
    bertle.turnRight();
    bertle.forward(35);

    System.out.println("My name is " + yertle.getName() + ".");
    System.out.println("My body is " + yertle.getBodyColor() + ".");
    System.out.println("My shell is " + yertle.getShellColor() + ".");
    System.out.println("My pen is " + yertle.getPenColor() + ".");
    System.out.println("I drew a house.");
    System.out.println("I am " + yertle.getDistance(0,0) + " units from (0,0).");
    System.out.println();

    System.out.println("My name is " + connor.getName() + ".");
    System.out.println("My body is " + connor.getBodyColor() + ".");
    System.out.println("My shell is " + connor.getShellColor() + ".");
    System.out.println("My pen is " + connor.getPenColor() + ".");
    System.out.println("I drew a line of squares.");
    System.out.println("I am " + connor.getDistance(0,0) + " units from (0,0).");
    System.out.println();

    System.out.println("My name is " + bertle.getName() + ".");
    System.out.println("My body is " + bertle.getBodyColor() + ".");
    System.out.println("My shell is " + bertle.getShellColor() + ".");
    System.out.println("My pen is " + bertle.getPenColor() + ".");
    System.out.println("I drew a plus sign.");
    System.out.println("I am " + bertle.getDistance(0,0) + " units from (0,0).");
    System.out.println();

    System.out.println("My name is " + marc.getName() + ".");
    System.out.println("My body is " + marc.getBodyColor() + ".");
    System.out.println("My shell is " + marc.getShellColor() + ".");
    System.out.println("My pen is " + marc.getPenColor() + ".");
    System.out.println("I drew a star.");
    System.out.println("I am " + marc.getDistance(0,0) + " units from (0,0).");
    System.out.println();

  }
}
