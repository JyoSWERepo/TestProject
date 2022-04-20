import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class SolutionTest {
    @Test
    public void findSmallest() {
        int result = Solution.findSmallest(2,5);
        Assert.assertEquals(result, 2);
    }
}