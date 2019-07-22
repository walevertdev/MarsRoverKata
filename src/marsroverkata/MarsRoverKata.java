/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marsroverkata;
import marsroverkata.Direction.GridPoint.GridPoint;
import marsroverkata.Direction.RoverDirections;

/**
 *
 * @author walevert
 */
public class MarsRoverKata implements RoverDirections {

    /**
     * @param args the command line arguments
     */
    char d;
    int initialXPoint;
    int initialYPoint;
    // Getter methods
    public char getRoverDirection(){
        return d;
    }
    
    // Setter methods
    public void setRoverDirection(char d){
        this.d = d;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        // Rover takes character aeguments of commands
        MarsRoverKata marsRover = new MarsRoverKata();
        GridPoint roverGridPoint = new GridPoint();
        
        for(String arg : args) {
            System.out.println(arg);
            roverGridPoint.setXPoint(0);
            roverGridPoint.setXPoint(1);
        }
        
        // set initial rover grid points
        roverGridPoint.InitialGridPoint(0, 0);
    }
    // Desfine all the abstract methods from the direction interface
    
    // Move Rover Left
    
    public boolean moveLeft(){
    
        return true;
    }
    // Move Rover to the right
    public boolean moveRight(){
    
        return true;
    }
    
    // Move Rover Foreward
    
    public boolean moveForeward(){
    
        return true;
    }
    // Move Rover Bckwards
    public boolean moveBackward(){
    
        return true;
    }
        
        
}
  
