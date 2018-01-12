
public class SearchAlgorithims {

	public static void main (String[]args)
	{
		int [] test1 = {1,2,3,4,5,6,7,8,9,10};
		int [] test2 = {0,4,5,6,12,15,17,23,29};
		
		System.out.println(binSearch(test1,3)); //2
		System.out.println(linSearch(test1,3)); //2
		
		System.out.println(binSearch(test2,23)); //7
		System.out.println(linSearch(test2,23)); //7
		
		System.out.println(binSearch(test2,25)); //-1
		System.out.println(linSearch(test2,25)); //-1	
				
		System.out.println(binSearch(test1,10)); //9
		System.out.println(linSearch(test1,1));	 //0			
				
		System.out.println(binSearch(test1,1)); //0
	}
	
   public static int linSearch(int[]nums, int query)
   {
	   int c = nums.length;
	   for(int i = 0; i<c ; i++)
	   {
		   if (nums[i] == query)
		   {
			   return (i);
		   }
	   }
	  
		 return -1;
	   
	}
   public static int binSearch(int[]nums, int query)
   {
	   int l = 0;
	   int r = nums.length;
	   while (l <= r)
	   {
		   int mid = l+(r-l)/2 ;
		   if (nums[mid] > query)
		   {
			   r = mid-1;
		   }
		   if (nums[mid] < query)
		   {
			   l = mid + 1;
		   }
		   if ( nums[mid] == query)
		   {
			   return mid;
		   }
	   }
   }
}

