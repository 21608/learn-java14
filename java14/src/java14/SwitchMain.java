package java14;

public class SwitchMain {

	public static void main(String[] args) {
		String one = "one";
		String two = "two";

		System.out.println(
			switch(one) {
				case "one" -> one;
				default    -> "default";
			}
		);

		String switchStr = switch(two) {
			case "one" -> one;
			case "two" -> two;
			default -> throw new IllegalArgumentException("Unexpected value");
		};

		System.out.println(switchStr);
	}
}