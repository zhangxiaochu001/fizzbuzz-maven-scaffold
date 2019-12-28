public class RoverController {

    public RoverController(Rover rover) {
        //Rover rover = rover;
    }

    public String execute(String mission) {
        String[] misses = mission.split(", ");
        int len = misses.length;
        Rover rover = new Rover();
        rover.land(new Area(Integer.parseInt(misses[0]), Integer.parseInt(misses[1])), Integer.parseInt(misses[2]), Integer.parseInt(misses[3]), misses[4]);
        for (int i=5; i < len; i++) {
            if ( "M".equals(misses[i]) ) {
                rover.move();
            }
            if ( "R".equals(misses[i]) ) {
                rover.turnRight(misses[i]);
            }
            if ( "L".equals(misses[i]) ) {
                rover.turnLeft(misses[i]);
            }
        }
        return rover.getPostion();
    }
}
