public class Elements{
	public static void main(String[] args) {
		int[] elements={4,2,9,7,3,8,5};
		int n=elements.length;
		int remEle=3;

		
		 boolean findDuplicates = findDuplicate(elements,n);
        System.out.println("Array has no duplicates: " + findDuplicates);


        int[] remove = removeElement(elements , n, remEle);

        for (int i = 0; i < remove.length; i++) {
            System.out.print(remove[i]);
            
    }
 
        


		
		}

		public static boolean findDuplicate(int[] elements,int n) {
			
		
		for (int i= 0;i<n ;i++  ) {
			for (int j=i+1;j<n ;j++ ) {
				if(elements[i]==elements[j]){
					return false;
					
				}

				}
				
			}
			return true;
			
		}


		public static int[] removeElement(int[] elements ,int n,int remEle) {

			int count=0;
			for(int i=0; i<n;i++){
				if(elements[i]!=remEle){
				count++;
			}

			}
			 int[] newArray = new int[count];
             int index = 0;

        
        for (int i = 0; i < n; i++) {
            if (elements[i] !=remEle) {
                newArray[index++] = elements[i];
            }
        }

        return newArray; 
    }

			
		
	}
	

        

   


