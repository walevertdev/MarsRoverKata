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
public interface RoverDirections {
    char [] array =  {'N','S','E','W'}; 
    // Move Rover Left
    
    public boolean moveLeft();
    // Move Rover to the right
    public boolean moveRight();
    
    // Move Rover Foreward
    
    public boolean moveForeward();
    // Move Rover Bckwards
    public boolean moveBackward();
}
