import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTaskTest {
    @Test
    void test3(){
        FirstTask ft =  new FirstTask() ;
        String out = ft.print(3);
        Assertions.assertEquals("fizz", out);
    }

    @Test
    void test5(){
        FirstTask ft =  new FirstTask() ;
        String out = ft.print(5);
        Assertions.assertEquals("buzz", out);
    }

    @Test
    void test15(){
        FirstTask ft =  new FirstTask() ;
        String out = ft.print(15);
        Assertions.assertEquals("fizzbuzz", out);
    }

    @Test
    void test7(){
        FirstTask ft =  new FirstTask() ;
        String out = ft.print(7);
        Assertions.assertEquals("boom", out);
    }
}
