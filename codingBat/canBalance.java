/*Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to
the sum of the numbers on the other side.


canBalance([1, 1, 1, 2, 1]) → true
canBalance([2, 1, 1, 2, 1]) → false
canBalance([10, 10]) → true
*/

public boolean canBalance(int[] nums) {
  int lsum=0;
  for(int i=0;i<nums.length;i++)
  {
    lsum=lsum+nums[i];
    int rsum=0;
    for(int j=nums.length-1;j>i;j--)
    {
     rsum=rsum+nums[j]; 
     
    }
     if(rsum==lsum)
  return true;
  }
 return false;
}

