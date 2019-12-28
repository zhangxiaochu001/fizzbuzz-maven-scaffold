import org.junit.Assert;
import org.junit.Test;

public class MarRoverTest {

    @Test
    public void test0 () {
        Area area = new Area(10, 10);
        Rover rover = new Rover();
        rover.land(area, 5, 5, "E");
        String position = rover.getPostion();
        Assert.assertEquals("55E", position);
    }

    @Test
    public void test1 () {
        Area area = new Area(10, 10);
        Rover rover = new Rover();
        rover.land(area, 5, 5, "E");
        rover.move();
        String position = rover.getPostion();
        Assert.assertEquals("65E", position);
    }

    @Test
    public void test2 () {
        //Area area = new Area(10, 10);
        Rover rover = new Rover();
        RoverController  roverController = new RoverController(rover);
        String mission = "10, 10, 5, 5, E, M, L, M ,R";
        String position = roverController.execute(mission);
        Assert.assertEquals("65N", position);
    }

}
