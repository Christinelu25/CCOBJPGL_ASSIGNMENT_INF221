import Explorers.*;
import Planets.*;

public class App {

    public static void main(String[] args) {

        Planet mars = new Mars();
        Planet saturn = new Saturn();
        Planet mercury = new Mercury();
        Planet venus = new Venus();
        Planet earth = new Earth();
        Planet jupiter = new Jupiter();
        Planet uranus = new Uranus();
        Planet nepture = new Nepture();

        


        Explorer astronaut = new HumanExplorer();
        Explorer rover = new RobotExplorer();
        
        

        mars.accept(astronaut);
        saturn.accept(astronaut);
        mercury.accept(astronaut);
        venus.accept(astronaut);
        earth.accept(astronaut);
        jupiter.accept(astronaut);
        uranus.accept(astronaut);
        nepture.accept(astronaut);


        


        mars.accept(rover);
        saturn.accept(rover);
        mercury.accept(rover);
        venus.accept(rover);
        earth.accept(rover);
        jupiter.accept(rover);
        uranus.accept(rover);
       
    }
}