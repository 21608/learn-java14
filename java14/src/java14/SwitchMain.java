package java14;

public class SwitchMain {

	public static void main(String[] args) {
		String str = "one";

		System.out.println(
			switch(str) {
				case "one" -> "one";
				default    -> "default";
			}
		);
	}
}