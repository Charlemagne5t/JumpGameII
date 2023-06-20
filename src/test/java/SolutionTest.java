import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void jumpTest1() {
        int[] nums = {2, 3, 1, 1, 4};
        int expected = 2;
        int actual = new Solution().jump(nums);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void jumpTest2() {
        int[] nums = {2, 3, 0, 1, 4};
        int expected = 2;
        int actual = new Solution().jump(nums);
        Assert.assertEquals(expected, actual);
    }
}
