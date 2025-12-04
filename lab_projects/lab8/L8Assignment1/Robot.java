package lab_projects.lab8.L8Assignment1;

import java.util.concurrent.BlockingDeque;

public class Robot {
    private String modelName;
    private int batteryLevel;
    private String status;

    public Robot(String MN, int BL, String status){
        this.modelName = MN;
        this.batteryLevel = BL;
        this.status = status;
    }

    public void displayRobotInfo(){
        System.out.println("Model Name: " + modelName +"\nBattery Level: " + batteryLevel + "%\nStatus: " + status);
    }

    public String getModelName(){return modelName;}
    public int getBatteryLevel(){return batteryLevel;}
    public String getStatus(){return status;}

    public void setModelName(String modelName){this.modelName = modelName;}
    public void setBatteryLevel(int batteryLevel){this.batteryLevel = batteryLevel;}
    public void setStatus(String status){this.status = status;}

}
