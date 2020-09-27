// Java Code to insert 5 in a given no to make it bigger.
public class Test {

	private static int negative(int N) {
		String str = N + "";
		String result = "";
		char[] arr = str.toCharArray();
		for(int i =0; i< arr.length; i++) {
			if('5' < arr[i]) {
			   result = str.substring(0, i) + "5" + str.substring(i);
			   return Integer.parseInt(result);
			}
		}
		
		
		return Integer.parseInt(str+"5");
	}

	private static int positive(int N) {
		String str = N + "";
		String result = "";
		char[] arr = str.toCharArray();
		for(int i =0; i< arr.length; i++) {
			if('5' > arr[i]) {
			   result = str.substring(0, i) + "5" + str.substring(i);
			   return Integer.parseInt(result);
			}
		}
		
		
		return Integer.parseInt(str+"5");
	}

	private static int zero(int N) {
		String str = N + "";
		return Integer.parseInt("5"+str);
	}

	public static int solution(int N) {

		if (N < 0) {
			return negative(N);
			
		} else if (N > 0) {
			 return positive(N);
		} else {
			 return zero(N);
		}

		//return N;
	}

	public static void main(String[] args) {
		System.out.println(solution(268));

	}

}

// Output should be 5268

