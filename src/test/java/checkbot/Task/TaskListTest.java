package checkbot.Task;

import checkbot.Exception.EmptyInputException;
import checkbot.Exception.EmptyTimeException;
import checkbot.Utils.Messages;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskListTest {
    Task testEvent = new Event("Event description",
            "22102024 1000",
            "22102024 2200");

    Task testDeadline = new Deadline("Deadline description",
            "22102025 1500");

    @Test
    public void testAddEvent() {
        try {
            TaskList.addTask("Event Event description /from 22102024 1000 /to 22102024 2200");
        } catch (EmptyInputException e) {
            System.out.println(Messages.emptyDescription);
        } catch (EmptyTimeException e) {
            System.out.println(Messages.emptyTime);
        }
        assertEquals(testEvent,TaskList.tasks.get(0));
    }

    @Test
    public void testAddDeadline() {
        try {
            TaskList.addTask("Deadline Deadline description /by 22102025 1500");
        } catch (EmptyInputException e) {
            System.out.println(Messages.emptyDescription);
        } catch (EmptyTimeException e) {
            System.out.println(Messages.emptyTime);
        }
        assertEquals(testDeadline,TaskList.tasks.get(1));
    }
}
