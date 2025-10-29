package afterapllicationofSOLID.interfacesegrationprinciple;

import beforeapplicationofSOLID.interfacesegrationprinciple.HumanWorker;

public class Main {
    public static void main(String[] args) {
    HumanWorker human = new HumanWorker();
    human.work();
    human.eat();
    RobotWorker robot = new RobotWorker();
    robot.work();
    }
}
