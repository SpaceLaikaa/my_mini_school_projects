package lab_projects.lab8.L8Assignment1;

import org.w3c.dom.ls.LSOutput;

import java.sql.Struct;

//Part E
public class TaskBatch {

    private Task[] tasks;
    private int taskCount;


    public TaskBatch(Task[] tasks, int taskCount){
        this.tasks = new Task[5];
        this.taskCount = 0;
    }

    public void addTask(Task t){
        if(taskCount<5){
            tasks[taskCount] = t;
            taskCount++;
            System.out.println("Task added: " + t.getTaskName());
        }
        else System.out.println("ERROR, cannot add more than 5 tasks.");
    }

    public int getTotalEnergyCost(){
        if(taskCount ==0){
            System.out.println("ERROR, no task detected!");
            return 0;
        }
        int totalEnergyCost =0;
        for(int i =0; i<taskCount;i++){
            totalEnergyCost+= tasks[i].getEnergyCost();
        }
        return totalEnergyCost;
    }

    public String getTasks() {
        String allTasks = "";
        if(taskCount ==0){
            System.out.println("ERROR, no task detected!");
        }
        else {
            for (int i = 0; i<taskCount;i++){
                allTasks += tasks[i].getTaskName() + "(Energy: "
                         + tasks[i].getEnergyCost() + ")\n"; // I indeed got help in this part
            }
        }
        return allTasks;
    }

    public void printBatchInfo(){
        if(taskCount==0){
            System.out.println("ERROR, no task detected!");
        }

        for (int i =0;i<taskCount;i++){
            System.out.println("Task name & energy cost: " + getTasks());
        }
    }
}
