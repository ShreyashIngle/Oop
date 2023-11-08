import java.util.Scanner;

interface Vehicle {
    void gearChange(int x);

    void speedUp(int x);

    void applyBrakes(int x);

    static boolean checkSpeed(int x) {
        System.out.println("Enter the speed you want to increase: ");
        try (Scanner sc = new Scanner(System.in)) {
            int incrSpeed = sc.nextInt();
            incrSpeed = incrSpeed + x;
            if (incrSpeed < 100) {
                System.out.println("The Speed is  : " + incrSpeed + "kmph");
            } else if (incrSpeed < 0) {
                System.out.println("The Vehicle is stopped!!!");
            } else {
                System.out.println("The Speed is 100kmp+ You cant Speed UP!!!!");
            }
        }
        return false;
    }

    static void checkGear(int x) {
        System.out.println("Enter the Gear you want to Change: ");
        try (Scanner sc = new Scanner(System.in)) {
            int incrGear = sc.nextInt();
            incrGear = incrGear + x;
            if (incrGear < 5) {
                System.out.println("The Gear is changed  : " + incrGear);
            } else {
                System.out.println("You cannot change the gear Sorry!!!!");
            }
        }
        
    }
}

class Bicycle implements Vehicle {
    @Override
    public void gearChange(int x) {
        if (x <= 6) {
            System.out.println("The Gear is changed to: " + x);
        } else {
            System.out.println("You cannot change the gear Sorry!!!!");
            ;
        }
    }

    public void speedUp(int x) {
        Vehicle.checkSpeed(x);
    }

    public void applyBrakes(int x) {
        speedUp(x);
    }

}

class Car implements Vehicle {
    @Override
    public void gearChange(int x) {
        Vehicle.checkGear(x);
    }

    public void speedUp(int x) {
        Vehicle.checkSpeed(x);
    }

    public void applyBrakes(int x) {
        System.out.println("The Brake is pressed : " + x);
    }

}

class Bike implements Vehicle {
    @Override
    public void gearChange(int x) {
        Vehicle.checkGear(x);
    }

    public void speedUp(int x) {
        Vehicle.checkSpeed(x);
    }

    public void applyBrakes(int x) {
        System.out.println("The Brake is pressed : " + x--);
    }

}

public class OOP5 {
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
                            System.out.println("\nPress The Brake!!!!: ");
                            int brake = sc.nextInt();
                            bicycle.applyBrakes(brake);
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
                            System.out.println("\nPress The Brake!!!!: ");
                            int brake = sc.nextInt();
                            car.applyBrakes(brake);
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
                            System.out.println("\nPress The Brake!!!!: ");
                            int brake = sc.nextInt();
                            bike.applyBrakes(brake);
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
