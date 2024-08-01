package practice;

public class FindMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declare array
		int [] array = {1,2,3,5,6};
		//length of an array
		int n = array.length + 1;
		//1st n natural numbers sum
		int totalSum = n* (n+1)/2;
		int arraySum = 0;
		for(int num : array) {
			arraySum +=num;
		}
		int missingNumber = totalSum - arraySum;
		//print result
		System.out.println("This is missing number: " + missingNumber);

	}

}
