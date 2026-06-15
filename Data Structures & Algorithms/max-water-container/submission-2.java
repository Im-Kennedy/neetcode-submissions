class Solution {
    public int maxArea(int[] heights) {
        
        // int max = 0;
        // for(int i = 0; i < heights.length - 1; i++){
        //     int index = i + 1;
        //     while(index != heights.length){
        //         int currentdistance = index - i;
        //         int currentarea = (Math.min(heights[i], heights[index]) * currentdistance);
        //         if(currentarea > max){
        //             max = currentarea;
        //         }
        //         index++;
        //     }
        // }
        // return max;

        int max = 0;
        int front = 0;
        int back = heights.length - 1;
        while(front < back){
            int currentdistance = back - front;
            System.out.println("distance: " + currentdistance);
            int currentarea = Math.min(heights[front], heights[back]) * currentdistance;
            System.out.println("area: " + currentarea);
            if(currentarea > max){
                max = currentarea;
            }
            System.out.println("max: " + max);
            if(heights[front] < heights[back]){
                front++;
            }else{
                back--;
            }
            System.out.println();
        }
        return max;
    }
}
