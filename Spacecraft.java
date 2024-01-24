package chandyan;

public class Spacecraft {
    private int x, y, z;
    private char direction; // 'N', 'S', 'E', 'W', 'U', 'D'

    public Spacecraft(int x, int y, int z, char direction) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.direction = direction;
    }

    public void moveForward() {
        switch (direction) {
            case 'N':
                y++;
                break;
            case 'S':
                y--;
                break;
            case 'E':
                x++;
                break;
            case 'W':
                x--;
                break;
            case 'U':
                z++;
                break;
            case 'D':
                z--;
                break;
        }
    }

    public void moveBackward() {
        switch (direction) {
            case 'N':
                y--;
                break;
            case 'S':
                y++;
                break;
            case 'E':
                x--;
                break;
            case 'W':
                x++;
                break;
            case 'U':
                z--;
                break;
            case 'D':
                z++;
                break;
        }
    }

    public void turnLeft() {
        switch (direction) {
            case 'N':
                direction = 'W';
                break;
            case 'S':
                direction = 'E';
                break;
            case 'E':
                direction = 'N';
                break;
            case 'W':
                direction = 'S';
                break;
        }
    }

    public void turnRight() {
        switch (direction) {
            case 'N':
                direction = 'E';
                break;
            case 'S':
                direction = 'W';
                break;
            case 'E':
                direction = 'S';
                break;
            case 'W':
                direction = 'N';
                break;
        }
    }

    public void turnUp() {
        if (direction != 'U' && direction != 'D') {
            direction = 'U';
        }
    }

    public void turnDown() {
        if (direction == 'U') {
            direction = 'D';
        }
    }

    public void printPositionAndDirection() {
        System.out.println("Final Position: (" + x + ", " + y + ", " + z + ")");
        System.out.println("Final Direction: " + direction);
    }

    public static void main(String[] args) {
        Spacecraft chandrayaan3 = new Spacecraft(0, 0, 0, 'N');
        char[] commands = {'f', 'r', 'u', 'b', 'l'};

        for (char command : commands) {
            switch (command) {
                case 'f':
                    chandrayaan3.moveForward();
                    break;
                case 'b':
                    chandrayaan3.moveBackward();
                    break;
                case 'l':
                    chandrayaan3.turnLeft();
                    break;
                case 'r':
                    chandrayaan3.turnRight();
                    break;
                case 'u':
                    chandrayaan3.turnUp();
                    break;
                case 'd':
                    chandrayaan3.turnDown();
                    break;
            }
        }

        chandrayaan3.printPositionAndDirection();
    }
}
