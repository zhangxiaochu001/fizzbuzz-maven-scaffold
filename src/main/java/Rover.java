public class Rover {

    public int X;
    public int Y;
    public String direction;

    public void land (Area area, int a, int b, String d) {
        //Area ar = area;
        X = a;
        Y = b;
        direction = d;
    }

    public String getPostion () {
        return  X + "" + Y + direction;
    }

    public void move () {
        X ++;
    }

    public void turnLeft(String goDirection) {
        if ( direction.equals("E") ) {
            direction = "N";
            return;
        }
        if ( direction.equals("S") ) {
            direction = "E";
            return;
        }
        if ( direction.equals("W") ) {
            direction = "S";
            return;
        }
        if ( direction.equals("N") ) {
            direction = "W";
        }
    }

    public void turnRight(String goDirection) {
        if ( direction.equals("E") ) {
            direction = "S";
            return;
        }
        if ( direction.equals("S") ) {
            direction = "W";
            return;
        }
        if ( direction.equals("W") ) {
            direction = "N";
            return;
        }
        if ( direction.equals("N") ) {
            direction = "E";
        }
    }

}
