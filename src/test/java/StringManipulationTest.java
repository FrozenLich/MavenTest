import static org.junit.Assert.*;
import org.junit.Test;

public class StringManipulationTest

{
    @Test

    public void testSumMethod(){


        int result0 = WordsCount.count("");
        int result1 = WordsCount.count("Thisisnotacorrectmessage");
        int result2 = WordsCount.count("get    off");
        int result3 = WordsCount.count("Hi I'm Siri.");



        assertEquals(0, result0);
        assertEquals(1, result1);
        //assertEquals(2, result2);
        assertEquals(3, result3);

        System.out.println("Test sum 1 + 1 passed!!");

    }
}