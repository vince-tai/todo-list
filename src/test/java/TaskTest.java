import com.github.vince_tai.model.Task;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskTest {
    @Test
    void testTitle() {
        Task task = new Task("test");
        String result = task.getTitle();
        assertEquals("test", result);
    }

    @Test
    void testSetTitle() {
        Task task = new Task("test");
        task.setTitle("new title");
        String result = task.getTitle();
        assertEquals("new title", result);
    }
}
