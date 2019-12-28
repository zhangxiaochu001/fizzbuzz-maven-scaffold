import org.junit.Assert;
import static org.junit.Assert.*;

public class FizzBuzzTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void test0() {
        Assert.assertEquals("FizzBuzzWhizz", FizzBuzz.isFizzBuzz(15, 3, 5,7));
    }

    @org.junit.Test
    public void test1() {
        Assert.assertEquals("FizzBuzz", FizzBuzz.isFizzBuzz(3, 3, 5, 7));
    }

    @org.junit.Test
    public void test2() {
        Assert.assertEquals("FizzWhizz", FizzBuzz.isFizzBuzz(5, 3, 5, 7));
    }

    @org.junit.Test
    public void test3() {
        Assert.assertEquals("BuzzWhizz", FizzBuzz.isFizzBuzz(1, 3, 5,7));
    }

    @org.junit.Test
    public void test4() {
        Assert.assertEquals("Fizz", FizzBuzz.isFizzBuzz(0, 3, 5,7));
    }

    @org.junit.Test
    public void test5() {
        Assert.assertEquals("Buzz", FizzBuzz.isFizzBuzz(11, 3, 5,7));
    }

    @org.junit.Test
    public void test6() {
        Assert.assertEquals("Whizz", FizzBuzz.isFizzBuzz(11, 3, 5,7));
    }

    @org.junit.Test
    public void test7() {
        Assert.assertEquals("invalid input", FizzBuzz.isFizzBuzz(0, 3, 5,7));
    }
}