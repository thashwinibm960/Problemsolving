public class Number{
	public static void main(String[] args) {
		int[] number = {2,5,34,9,87,45,3};
		int n=number.length;
		int sum =0;

		countOfOddAndEven(number);
		int  cha=firstOccurance("thashwini" ,'i');
		System.out.println(cha);

		for (int i=0 ;i<n ;i++ ) {
			sum = sum +number[i];
			
		}
		System.out.println("sum of number:"+ sum);
	}

	public static void countOfOddAndEven(int[] number) {
		int evenCount = 0; 
        int oddCount = 0;
        int n=number.length;
		for (int i=0;i<n ;i++ ) {
			if(number[i]% 2 == 0){
				evenCount ++;
			}
			else{
				oddCount ++;
			}
			
		}
		System.out.println("count of even number is:" + evenCount);
		System.out.println("count of odd number is:" + oddCount);
		
	}
	public static int firstOccurance(String value ,char ch) {
		char[] charArray = value.toCharArray();
		int n = charArray.length;
		for(int i=0;i<n;i++){
			if(charArray[i] == ch){
				return i;
			}
		}
		return -1;
	}
}
   

        
    
     
        
    

   
