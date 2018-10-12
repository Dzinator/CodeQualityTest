
public class Main {

	public static boolean isPalindrome(String inputString) {
		if(inputString.length() == 0) {
			return true;
		} else {
			char firstChar = inputString.charAt(0);
			char lastChar = inputString.charAt(inputString.length() - 1);
			String mid = inputString.substring(1, inputString.length() - 1);
			return (firstChar == lastChar) && isPalindrome(mid);		
		}
	}
	
	public static void main(String[] args) {
		if(isPalindrome("Laval")) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

	}

}
