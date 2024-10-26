package checkbot.Task;

public class Todo extends Task {

    public Todo(String description){
        super(description);
        taskType = TaskType.TODO;
    }

    // TODO: add priority in list view for storage
    public String getListView() {
        return "[" + this.getTaskIcon() + "][" + this.getStatusIcon() + "] " +
                description;
    }

    public String getFileView() {
        return this.getTaskIcon() + " | " +
                this.status.toString() + " | " +
                this.getDescription();
    }
}
