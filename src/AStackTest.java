import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AStackTest {
        @Test
        void test1()
        {
            int expected = 5;
            AStack test = new AStack(true);
            test.push(10);
            test.push(5);
            test.push(15);
            test.push(12);
            int actual = test.minOrMax();

            Assertions.assertEquals(expected, actual);
        }
        @Test
    void test2()
    {
        int expected = 15;
        AStack test = new AStack(false);
        test.push(10);
        test.push(5);
        test.push(15);
        test.push(12);
        int actual = test.minOrMax();

        Assertions.assertEquals(expected, actual);
    }
}
