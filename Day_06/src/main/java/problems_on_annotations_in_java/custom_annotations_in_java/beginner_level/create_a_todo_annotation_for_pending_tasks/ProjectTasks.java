package problems_on_annotations_in_java.custom_annotations_in_java.beginner_level.create_a_todo_annotation_for_pending_tasks;


public class ProjectTasks {

    @Todo(task = "Implement login feature", assignedTo = "Arpita", priority = Priority.HIGH)
    public void loginFeature() {
        System.out.println("Login feature is under development...");
    }

    @Todo(task = "Optimize database queries", assignedTo = "Rajesh")
    public void optimizeQueries() {
        System.out.println("Database query optimization is pending...");
    }

    public void completedTask() {
        System.out.println("This method does not require TODO annotation.");
    }
}
