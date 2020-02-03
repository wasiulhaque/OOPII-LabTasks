import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTest {
    @Test
    public void areaTest()
    {
        Square s = new Square();
        s.setLength(4);
        double expected = 16;
        double actual = s.calculateArea();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void perimeterTest()
    {
        Square s = new Square();
        s.setLength(4);
        double expected = 16;
        double actual = s.calculatePerimeter();
        Assertions.assertEquals(expected, actual);
    }
}
