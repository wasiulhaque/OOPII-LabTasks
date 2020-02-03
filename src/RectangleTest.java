import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTest{
    @Test
    public void areaTest()
    {
        Rectangle r = new Rectangle();
        r.setWidth(3.5);
        r.setHeight(4);
        double expected = 14;
        double actual = r.calculateArea();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void perimeterTest()
    {
        Rectangle r = new Rectangle();
        r.setWidth(3.5);
        r.setHeight(4);
        double expected = 15;
        double actual = r.calculatePerimeter();
        Assertions.assertEquals(expected, actual);
    }



}
