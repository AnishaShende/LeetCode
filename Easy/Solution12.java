//  1603. Design Parking System


class Solution12 {
    int big = 0, medium = 0, small = 0;
    public Solution12(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    
    public boolean addCar(int carType) {
        if(carType == 1){
            if(big > 0){
                big --;
                return true;
            }
            else 
                return false;
        }
        else if(carType == 2){
            if(medium > 0){
                medium --;
                return true;
            }
            else 
                return false;
        }
        else if(carType == 3){
            if(small > 0){
                small --;
                return true;
            }
            else 
                return false;
        }
        else return false;
    }
    public static void main(String[] args) {
        Solution12 obj = new Solution12(1, 1, 0);
        System.out.println(obj.addCar(1));
        System.out.println(obj.addCar(2));
        System.out.println(obj.addCar(3));
        System.out.println(obj.addCar(1));
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */


 /*
  *                                   Achivement <3
  * Runtime: 8 ms, faster than 86.41% of Java online submissions for Design Parking System.
  * Memory Usage: 42.4 MB, less than 99.83% of Java online submissions for Design Parking System.
  */