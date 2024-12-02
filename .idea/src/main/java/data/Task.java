import java.time.LocalDateTime;

public class Task{
    public static void main(String[] args){
        Task task1 = new Task("Clean room", "I need to clean my room so that the boiler man can do his job.", LocalDateTime.now());
        task1.toggleCompleted();
        System.out.println(task1);
    }
    // VARIABLES //
    private String name;
    private String description;
    private LocalDateTime deadline;
    private boolean completed;

    // CONSTRUCTORS //
    public Task(String name){
        this.name = name;
        this.description = "";
        this.deadline = null;
        this.completed = false;
    }

    public Task(String name, String description){
        this.name = name;
        this.description = description;
        this.deadline = null;
        this.completed = false;
    }

    public Task(String name, LocalDateTime deadline){
        this.name = name;
        this.description = "";
        this.deadline = deadline;
        this.completed = false;
    }

    public Task(String name, String description, LocalDateTime deadline){
        this.name = name;
        this.description = description;
        this.deadline = deadline;
        this.completed = false;
    }

    // SETs AND GETs //
        // Name
    public void setName(String newName) {this.name = newName;}
    public String getName() {return this.name;}

        // Description
    public void setDesc(String newDesc) {this.description = newDesc;}
    public String getDesc() {return this.description;}

        // Deadline
    public void setDeadline(LocalDateTime newDeadline) {this.deadline = newDeadline;}
    public LocalDateTime getDeadline() {return this.deadline;}

        // Completion
    public void toggleCompleted() {this.completed = !this.completed;}
    public boolean getCompleted() {return this.completed;}

    // METHODS //


    @Override
    public String toString() {
        String output = this.name + ":\n";
        output += "Deadline: " + this.deadline + "\n";
        output += "Description: " + this.description + "\n";
        output += this.completed ? "DONE" : "NOT DONE";
        return output;
    }
}