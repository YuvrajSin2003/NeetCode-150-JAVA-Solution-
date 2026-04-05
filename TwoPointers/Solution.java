public class Solution {
    public int maxArea(int[] height) {
    //initializing 2 pointers
     int left = 0;
     int right = height.length - 1;
     int maxArea = 0;

    //loop initialization
     while(left <= right){
        
        int len = Math.min(height[left] , height[right]);
        int width = right - left;
        int area = len * width;
        maxArea = Math.max(area , maxArea);

        //Important checks
        if(height[left] < height[right]){
            left++;
        }else{
            right--;
        }
     }   
     return maxArea;
    }
} {
    
}
