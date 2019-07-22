/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marsroverkata.Direction;

/**
 *
 * @author walevert
 */
public class RoverDirections {
    char d;
    char [] array =  {'N','S','E','W'};
    // Getter methods
    public char getRoverDirection(){
        return d;
    }
    
    // Setter methods
    public void setRoverDirection(char d){
        this.d = d;
    }
    
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
