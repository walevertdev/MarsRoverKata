/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marsroverkata.Direction.GridPoint;

/**
 *
 * @author walevert
 */
public class GridPoint {
    int x, y;
    // Getter methods
    public int getXPoint(){
        return x;
    }
    public int getYPoint(){
        return y;
    }
    // Setter methods
    public void setXPoint(int x){
        this.x = x;
    }
    public void setYPoint(int y){
        this.y = y;
    }
    // function defines the Rover initial position the Rover started from
    public boolean InitialGridPoint(int x, int y){
        setXPoint(x);
        setYPoint(y);
        
        return true;// returns false if initial grid point is not set
    }

    
}
