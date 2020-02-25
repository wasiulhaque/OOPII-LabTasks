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
        int expected = 6;
        AStack test = new AStack(false);
        test.push(3);
        test.push(2);
        test.push(6);
        test.push(5);
        test.pop();
        int actual = test.minOrMax();

        Assertions.assertEquals(expected, actual);
    }
}
