public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static int lettersToFive(String str, char chr){
		int c = 0;
		int i = 0;
		while(i < str.length()){
			if(str.charAt(i) == chr){
				c++;
			}
			i++;
			if(c==5){
				return i;
			}
		}
		return -1;
	}
	public static int countLetter(String str, char chr){
		int c = 0;
		int i = 0;
		while(i < str.length()){
			if(str.charAt(i) == chr){
				c++;
			}
			i++;
		}
		return c;
	}
	public static int oddSum(int num1, int num2){
		int sum = 0;
		for(int i = Math.min(num1,num2);i<=Math.max(num1,num2);i++){
			if(i%2==0) continue;
			sum +=i;
		}
		return sum;
	}

	


}
