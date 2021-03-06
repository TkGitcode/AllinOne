package Practice;

import java.util.*;
import java.util.Scanner;
/**
 * @Author -- TkGitcode
 */
public class StackDemo {
	static Scanner sc = new Scanner(System.in);

	static String printAll(Enum<?> value) {
		Set<?> allValues = EnumSet.allOf(value.getDeclaringClass());
		return allValues.toString();
	}

	public static void main(String[] args) {

		int yourchoice = 0;
		Enum<?> aEnum = Activities1.TAMIL;
		System.out.println(printAll(aEnum));
		Stack<Integer> nextprevious = new Stack<>();
		do {
			System.out.println("Enter Your Choice");
			yourchoice = StackDemo.sc.nextInt();
			if (yourchoice == 9 && !nextprevious.isEmpty())
				yourchoice = nextprevious.pop();
			else if (yourchoice < 9)
				nextprevious.push(yourchoice);
			else if (nextprevious.isEmpty())
				System.exit(yourchoice);

			switch (yourchoice) {
			case 1:
				Enum<?> bEnum = Activities2.கஸ்டமர்கேர்உடன்இணைக்கவும்;
				System.out.println(printAll(bEnum));
				System.out.println(" முந்தைய மெண்ணுவிற்கு 9 ஐ அழுத்தவும் ");
				break;
			case 2:
				Enum<?> cEnum = Activities3.CONNECTWITHCUSTIMERCARE;
				System.out.println(printAll(cEnum));
				System.out.println("Press 9 for the previous menu");
				break;
			case 3:
				Enum<?> dEnum = Activities4.कस्टमरकेयरसेजुड़ें;
				System.out.println(printAll(dEnum));
				System.out.println("पिछले मेनू के लिए 9 दबाएं");
				break;
			}

		} while (yourchoice <= 9);
	}
	static void TamilMenu()
	{
		Enum<?> aEnum = Activities6.உங்கள்கோரிக்கைவெற்றிகரமாகமுழுமையாகசமர்ப்பிக்கப்பட்டது;
		System.out.println(printAll(aEnum));
	}

}
