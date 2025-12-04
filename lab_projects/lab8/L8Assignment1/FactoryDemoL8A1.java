package lab_projects.lab8.L8Assignment1;

public class FactoryDemoL8A1 {
    public void main(String[] args) {
        Robot Robo1 = new Robot("Nagasaki-15", 100,"Active");
        Robot Robo2 = new Robot("Osaka-38", 100,"Active");

        System.out.println("=====Robot 1=====");
        Robo1.displayRobotInfo();
        System.out.println("");
        System.out.println("=====Robot 2=====");
        Robo2.displayRobotInfo();
    }
}
