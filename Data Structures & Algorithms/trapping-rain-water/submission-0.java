class Solution {
    public int trap(int[] height) {
        int maxwater = 0;

        int front = 0;
        int back = height.length - 1;
        int leftmax = 0, rightmax = 0;
        while(front < back){
            if(height[front] <= height[back]){
                if(height[front] >= leftmax){
                    leftmax = height[front];
                }else{
                    maxwater = maxwater + (leftmax - height[front]);
                }
                    front++;
            }else{
                if(height[back] >= rightmax){
                    rightmax = height[back];
                }else{
                    maxwater = maxwater + (rightmax - height[back]);
                }
                back--;
            }
            
        }
        return maxwater;
    }
}
