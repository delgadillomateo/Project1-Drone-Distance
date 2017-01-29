import java.util.Scanner;
    
    public class drones {
        public static void main (String [] args) {
            Scanner input = new Scanner(System.in);
            
            //prompt for first drones coordinates
            System.out.println("Please enter the x coordinate of Drone 1:");
            double droneOneX = input.nextDouble();
            System.out.println("Please enter the Y coordinate of Drone 1:");
            double droneOneY = input.nextDouble();
            
            //prompt altitude of first drone
            System.out.println("Please enter the altitude of Drone 1:");
            double droneOneAlt = input.nextDouble();
            
            //prompt the second drones coordinates
            System.out.println("Please enter the x coordinate of Drone 2:");
            double droneTwoX = input.nextDouble();
            System.out.println("Please enter the y coordinate of Drone 2:");
            double droneTwoY = input.nextDouble();
            
            //prompt altitude of second drone
            System.out.println("Please enter the altitude of Drone 2:");
            double droneTwoAlt = input.nextDouble();
            
            //calculate distance in the (x,y) plane
            double secondDistance = Math.pow((Math.pow((droneTwoX-droneOneX),2)+Math.pow((droneTwoY-droneOneY),2)),0.5);
            
            //Tell user what distance is in (x,y) plane
            System.out.print("The two drones are " + secondDistance + " feet apart in (x,y) coordinates.");
            if(secondDistance < 1) {
                System.out.print(" They need to move farther apart.");
            } else if(secondDistance > 500) {
                System.out.print(" They need to move closer.");
                      } else {
                          System.out.println(" They do not need to move farther apart or closer together in (x,y).");
                        }
            
            //calculate the distance in (x,y,z) plane aka 3D
            double thirdDistance = Math.pow((Math.pow((droneTwoX-droneOneX),2)+Math.pow((droneTwoY-droneOneY),2)+Math.pow((droneTwoAlt-droneOneAlt),2)),0.5);
            
            //Tell user the distance in the (x,y,z) plane
            System.out.print("The two drones are " + thirdDistance + " feet apart in 3D space.");
            if(thirdDistance < 1) {
                System.out.print(" They need to move farther apart.");
            } else if(thirdDistance > 500) {
                System.out.print(" They need to move closer.");
                      } else {
                          System.out.print(" They do not need to move farther apart or closer together in (x,y).");
                        }
            //close input stream
            input.close();
        }
    }