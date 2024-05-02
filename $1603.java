import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/* 
Design Parking System

Design a parking system for a parking lot. The parking lot has three kinds of parking spaces: 
big, medium, and small, with a fixed number of slots for each size.

Implement the ParkingSystem class:

ParkingSystem(int big, int medium, int small) Initializes object of the ParkingSystem class. 
The number of slots for each parking space are given as part of the constructor.
bool addCar(int carType) Checks whether there is a parking space of carType for the car that wants to get into the parking lot. 
CarType can be of three kinds: big, medium, or small, which are represented by 1, 2, and 3 respectively. 
A car can only park in a parking space of its carType. 
If there is no space available, return false, else park the car in that size space and return true.
*/

public class $1603 {
    class ParkingSystem {
        private
            int Big;
            int Small;
            int Medium;
        public ParkingSystem(int big, int medium, int small) {
            this.Big = big;
            this.Medium = medium;
            this.Small = small;
        }
        public boolean addCar(int carType) {
            if(carType == 1 && Big != 0){
                Big--;
                return true;
            }
            if(carType == 2 && Medium != 0){
                Medium--;
                return true;
            }
            if(carType == 3 && Small != 0){
                Small--;
                return true;
            }
            return false;
        }
    }
    @Test
    public void testParkingSystem(){
        ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);
        assertTrue(parkingSystem.addCar(1));
        assertTrue(parkingSystem.addCar(2));
        assertFalse(parkingSystem.addCar(3));
        assertFalse(parkingSystem.addCar(1));
    }

}