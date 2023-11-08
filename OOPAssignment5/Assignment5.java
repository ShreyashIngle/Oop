package OOPAssignment5;

import java.util.Scanner;

interface Vehicle {
    void gearChange(int incrGear);

    void speedUp(int x);

    void applyBrakes();

    static boolean checkGear(int currGear, int maxGear) {
        if (currGear > maxGear) {
            System.out.println("You cannot change the gear Sorry!!!!");
        } else if (currGear == 0) {
            System.out.println("Please change the Gear!!!");
        } else {
            return true;
        }
        return false;
    }

    static boolean checkSpeed(int currSpeed, int maxSpeed) {
        if (currSpeed > maxSpeed) {
            return false;
        } else if (currSpeed == 0) {
            System.out.println("The Vehicle is stopped!!!");
        } else {
            return true;
        }
        return false;
    }

}

class Bicycle implements Vehicle {

    int gear;
    int speed;

    Bicycle() {
        gear = 1;
        speed = 0;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void gearChange(int incrGear) {
        int maxGear = 7;
        int gear = getGear() + incrGear;
        if (Vehicle.checkGear(gear, maxGear) == true) {
            System.out.println("Gear Of the Bicycle Increases to " + incrGear + " Current gear is: " + gear);
        }

        else {
            System.out.println("Gear Limit Reached you cant change the gear!!");
        }
    }

    public void speedUp(int incrSpeed) {
        int maxSpeed = 50;
        int speed = getSpeed() + incrSpeed;
        if (Vehicle.checkSpeed(speed, maxSpeed) == true) {
            setGear(incrSpeed + getGear());
            System.out
                    .println("The Speed of the bicycle increases to: " + incrSpeed + " Current speed is: " + getGear());
        } else {
            System.out.println("Speed Limit Reached you cant SpeedUp!!");
        }
    }

    public void applyBrakes() {
        int decreSpeed = 10;
        int decreGear = 1;

        setGear(getGear() - decreGear);
        setSpeed(getSpeed() - decreSpeed);
        System.out.println("Gear of the car Decreases by 1 and speed decreases by 10 Km/h....");
        System.out.println("Therefore current Speed of the car is " + getSpeed() + " and gear is " + getGear());
    }

}

class Car implements Vehicle {
    int gear;
    int speed;

    Car() {
        gear = 1;
        speed = 0;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void gearChange(int incrGear) {
        int maxGear = 4;
        int gear = getGear() + incrGear;
        if (Vehicle.checkGear(gear, maxGear) == true) {
            System.out.println("Gear Of the Car Increases to " + incrGear + " Current gear is: " + gear);
        } else {
            System.out.println("Gear Limit Reached you cant change the gear!!");
        }
    }

    public void speedUp(int incrSpeed) {
        int maxSpeed = 220;
        int speed = getSpeed() + incrSpeed;
        if (Vehicle.checkSpeed(speed, maxSpeed) == true) {
            setGear(incrSpeed + getGear());
            System.out.println("The Speed of the Car increases to: " + incrSpeed + " Current speed is: " + getGear());
        } else {
            System.out.println("Speed Limit Reached you cant SpeedUp!!");
        }
    }

    public void applyBrakes() {
        int decreSpeed = 15;
        int decreGear = 1;

        setGear(getGear() - decreGear);
        setSpeed(getSpeed() - decreSpeed);
        System.out.println("Gear of the car Decreases by 1 and speed decreases by 15 Km/h....");
        System.out.println("Therefore current Speed of the car is " + getSpeed() + " and gear is " + getGear());
        
    }

}

class Bike implements Vehicle {
    int gear;
    int speed;

    Bike() {
        gear = 1;
        speed = 0;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void gearChange(int incrGear) {
        int maxGear = 5;
        int gear = getGear() + incrGear;
        if (Vehicle.checkGear(gear, maxGear) == true) {
            System.out.println("Gear Of the Bike Increases to " + incrGear + " Current gear is: " + gear);
        }

        else {
            System.out.println("Gear Limit Reached you cant change the gear!!");
        }
    }

    public void speedUp(int incrSpeed) {
        int maxSpeed = 1400;
        int speed = getSpeed() + incrSpeed;
        if (Vehicle.checkSpeed(speed, maxSpeed) == true) {
            setGear(incrSpeed + getGear());
            System.out.println("The Speed of the Bike increases to: " + incrSpeed + " Current speed is: " + getGear());
        } else {
            System.out.println("Speed Limit Reached you cant SpeedUp!!");
        }
    }

    public void applyBrakes() {
        int decreSpeed = 20;
        int decreGear = 1;

        setGear(getGear() - decreGear);
        setSpeed(getSpeed() - decreSpeed);
        System.out.println("Gear of the Bike Decreases by 1 and speed decreases by 20 Km/h....");
        System.out.println("Therefore current Speed of the Bike is " + getSpeed() + " and gear is " + getGear());

    }

}

public class Assignment5 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println("\n-----MENU-----\n1.Bicycle\n2.Car\n3.Bike\n\nEnter the Choice: ");
                int choice = sc.nextInt();

                System.out.println("\n1.GearChange\n2.SpeedUp\n3.ApplyBrakes\nEnter the choice: ");
                int a = sc.nextInt();

                switch (choice) {
                    case 1:
                        Vehicle bicycle = new Bicycle();

                        if (a == 1) {
                            System.out.println("\nEnter the Gear: ");
                            int gear = sc.nextInt();
                            bicycle.gearChange(gear);
                        } else if (a == 2) {
                            System.out.println("\nEnter Your initial Speed: ");
                            int speed = sc.nextInt();
                            bicycle.speedUp(speed);
                        } else {
                            System.out.println("\n Brake is Pressed!!!!: \n");
                            bicycle.applyBrakes();
                        }
                        break;

                    case 2:
                        Vehicle car = new Car();

                        if (a == 1) {
                            System.out.println("\nEnter the Gear: ");
                            int gear = sc.nextInt();
                            car.gearChange(gear);
                        } else if (a == 2) {
                            System.out.println("\nEnter the initial Speed: ");
                            int speed = sc.nextInt();
                            car.speedUp(speed);
                        } else {
                            System.out.println("\n Brake is Pressed!!!!: \n");
                            car.applyBrakes();
                            car.applyBrakes();
                        }
                        break;

                    case 3:
                        Vehicle bike = new Bike();

                        if (a == 1) {
                            System.out.println("\nEnter the Gear: ");
                            int gear = sc.nextInt();
                            bike.gearChange(gear);
                        } else if (a == 2) {
                            System.out.println("\nEnter the initial Speed: ");
                            int speed = sc.nextInt();
                            bike.speedUp(speed);
                        } else {
                            System.out.println("\n Brake is Pressed!!!!: \n");
                            bike.applyBrakes();
                            bike.applyBrakes();
                        }
                        break;

                    default:
                        System.out.println("Invalid Input!!!!");
                        break;
                }
            }
        }

    }
}
