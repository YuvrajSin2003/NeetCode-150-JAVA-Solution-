class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        for(int pile:piles){
            right = Math.max(pile , right);
        }
        while(left < right){
            int mid = left+(right-left)/2;
            if(canFinish(mid , piles , h)){
                right = mid ;
            }else{
                left = mid + 1;;
            }
        }
        return left;
    }
    private boolean canFinish(int mid,int[] piles, int h){
        int hour = 0;
        for(int pile : piles){
           hour += (pile + mid - 1) / mid;
        }
        return hour <= h;
    }
}