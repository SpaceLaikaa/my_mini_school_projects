package lab_projects.lab8.L8Assignment1;

import java.util.Scanner;

public class FactoryDemoL8A1 {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Part A
        Robot Robo1 = new Robot("Nagasaki-15", 100,"Active");
        Robot Robo2 = new Robot("Osaka-38", 100,"Active");

        System.out.println("=====Robot 1=====");
        Robo1.displayRobotInfo();
        System.out.println("");
        System.out.println("=====Robot 2=====");
        Robo2.displayRobotInfo();

        //Part B
        System.out.println("\nHow much battery do you want to consume on Robot 1? ");
        int consumeBattery = sc.nextInt();
        int consumedBatteryR1 = Robo1.consumeBattery(consumeBattery);

        System.out.println("Robot 1's new battery is: " + consumedBatteryR1 + "%");
    }
}
