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
        Assert.assertEquals("FizzBuzz", FizzBuzz.isFizzBuzz(15, 3, 5));
    }

    @org.junit.Test
    public void test1() {
        Assert.assertEquals("Fizz", FizzBuzz.isFizzBuzz(3, 3, 5));
    }

    @org.junit.Test
    public void test2() {
        Assert.assertEquals("Buzz", FizzBuzz.isFizzBuzz(5, 3, 5));
    }

    @org.junit.Test
    public void test3() {
        Assert.assertEquals("1", FizzBuzz.isFizzBuzz(1, 3, 5));
    }

    @org.junit.Test
    public void test4() {
        Assert.assertEquals("FizzBuzz", FizzBuzz.isFizzBuzz(0, 3, 5));
    }

    @org.junit.Test
    public void test5() {
        Assert.assertEquals("11", FizzBuzz.isFizzBuzz(11, 3, 5));
    }
}