import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Lab7Regex {
	// Check user inputs based on prompts and using regex for validation.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// check name
		System.out.println("Please enter a valid name: ");
		String name = scan.nextLine();
		checkRegex("[A-Z]\\w{1,29}", name);

		// check email
		System.out.println("Please enter a valid email: ");
		String email = scan.nextLine();
		checkRegex("[A-z0-9]{5,30}[\\s.@][A-z0-9]{5,10}[\\s..][A-z0-9]{2,3}$", email);

		// check phone number
		System.out.println("Please enter a valid phone number: ");
		String number = scan.nextLine();
		checkRegex("^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", number);
		// check date
		System.out.println("Please enter a valid date: ");
		String date = scan.nextLine();
		checkRegex("^[0-3]?[0-9]/[0-3]?[0-9]/(?:[0-9]{2})?[0-9]{2}$", date);


	}

	// Method to check each input with regex expression and input variable
	public static void checkRegex(String regex, String var) {
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(var);
		// find() - attempts to locate the next subsequence of the input that
		// matches the pattern.
		if (m.matches()) {
			System.out.println("Valid entry");
		}
		else {
			System.out.println("Sorry, not valid");
		}
		
			}




		}

