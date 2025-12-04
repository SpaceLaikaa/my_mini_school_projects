package lab_projects.lab8.L8Assignment1;

import java.util.Scanner;

public class FactoryDemoL8A1 {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Part C
        Task Task1 = new Task("Clean",25);
        Task Task2 = new Task("Wash", 35);

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

        //Part C
        System.out.println("Task 1: Clean (25% Consumation)\nTask 2: Wash (35% Consumation)");
        int whichTask = sc.nextInt();

        switch (whichTask){
            case 1:{
                if (Robo1.isBatteryEnough(Task1.getEnergyCost())){
                    consumedBatteryR1 -= Task1.getEnergyCost();
                    System.out.println("Cleaning process.... Done! New Battery: " + consumedBatteryR1);
                    break;
                }
                else System.out.println("Not Enough Battery..."); break;
            }
            case 2:
                if(Robo1.isBatteryEnough(Task2.getEnergyCost())){
                    consumedBatteryR1 -= Task2.getEnergyCost();
                    System.out.println("Washing process.... Done! New Battery: " + consumedBatteryR1);
                    break;
                }
                else System.out.println("Not Enough Battery..."); break;
        }
    }
}
