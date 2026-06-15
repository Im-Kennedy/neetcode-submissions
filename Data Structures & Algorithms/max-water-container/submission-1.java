class Solution {
    public int maxArea(int[] heights) {
        
        int max = 0;
        for(int i = 0; i < heights.length - 1; i++){
            int index = i + 1;
            while(index != heights.length){
                int currentdistance = index - i;
                int currentarea = (Math.min(heights[i], heights[index]) * currentdistance);
                if(currentarea > max){
                    max = currentarea;
                }
                index++;
            }
        }
        return max;
    }
}
