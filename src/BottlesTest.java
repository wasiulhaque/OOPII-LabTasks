
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BottlesTest {
    @Test
    public void verse_99()
    {
        String expected = "99 bottles of milk on the wall, 99 bottles of milk.\n"
                + "Take one down and pass it around, 98 bottles of milk on the wall.";
        String actual = new Bottles().verse(99);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void verse_97()
    {
        String expected = "97 bottles of milk on the wall, 97 bottles of milk.\n"
                + "Take one down and pass it around, 96 bottles of milk on the wall.";
        String actual = new Bottles().verse(97);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void verse_2()
    {
        String expected = "98 bottles of milk on the wall, 98 bottles of milk.\n"
                + "Take one down and pass it around, 97 bottles of milk on the wall.";
        String actual = new Bottles().verse(98);

        Assertions.assertEquals(expected, actual);
        // TODO: implement this
    }

    @Test
    public void verse_1()
    {
        String expected = "1 bottle of milk on the wall, 1 bottle of milk.\n"
                + "Take it down and pass it around, no more bottles of milk on the wall.";
        String actual = new Bottles().verse(1);

        Assertions.assertEquals(expected, actual); // TODO: implement this
    }

    @Test
    public void verse_0()
    {
        String expected = "No more bottles of milk on the wall, no more bottles of milk.\n"
                + "Go to the store and buy some more, 99 bottles of milk on the wall.";
        String actual = new Bottles().verse(0);

        Assertions.assertEquals(expected, actual);
        // TODO: implement this
    }
}
