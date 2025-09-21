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
}
