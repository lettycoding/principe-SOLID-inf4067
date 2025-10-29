package beforeapplicationofSOLID.interfacesegrationprinciple;

public class Main {
    public static void main(String[] args) {
        Worker human = new HumanWorker();
        Worker robot = new RobotWorker();

        System.out.println("Human:");
        human.work();
        human.eat();

        System.out.println("\nRobot:");
        robot.work();
        try {
            robot.eat();
        } catch (UnsupportedOperationException ex) {
            System.out.println("Caught exception: " + ex.getMessage());
        }
    }
}