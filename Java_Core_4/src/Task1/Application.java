package Task1;

public class Application {

	public static void main(String[] args) {

		Robot r = new Robot("я Robot Ц € просто працюю");
		System.out.println(r);

		CoffeRobot c = new CoffeRobot();
		System.out.println(c);

		RobotDancer d = new RobotDancer();
		System.out.println(d);

		RobotCooker k = new RobotCooker();
		System.out.println(k);

		Robot[] ArrayRobot = new Robot[4];

		ArrayRobot[0] = new Robot("я Robot Ц € просто працюю");
		ArrayRobot[1] = new CoffeRobot();
		ArrayRobot[2] = new RobotDancer();
		ArrayRobot[3] = new RobotCooker();

		for (int i = 0; i <= 3; i++) {
			ArrayRobot[i].work();
		}

	}

}
