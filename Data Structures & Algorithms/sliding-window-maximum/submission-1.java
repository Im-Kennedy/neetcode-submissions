class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // Deque<Integer> addlist = new LinkedList<>();
        // int[] returnlist = new int[nums.length - k + 1];
        // int resultIndex = 0;//where to insert next result

        // for(int i = 0; i < nums.length; i++){
        //     //remove from the back anything sxmaller than current
        //     //they can neer be max while current is in the window
        //     while(!addlist.isEmpty() && nums[i] >= nums[addlist.peekLast()]){
        //         addlist.removeLast();
        //     }//we compare the value

        //     //add current INDEX to back of deque
        //     addlist.addLast(i);

        //     //remove from front if its outside the window
        //     if(addlist.peekFirst() < i - k + 1){//check INDEX with formula
        //         addlist.removeFirst();
        //     }

        //     //window is full, record the max
        //     if(i >= k - 1){//check INDEX WITH FORMULA
        //         returnlist[resultIndex] = nums[addlist.peekFirst()];//ADD VALUE
        //         resultIndex++;
        //     }
            
        // }

        // return returnlist;

        Deque<Integer> stack = new LinkedList<>();
        int[] returnlist = new int[nums.length - k + 1];
        int index = 0;

        for(int i = 0; i < nums.length; i++){
            //we need to check to see if the current i is bigger than whats
            //in the stack. 
            while(!stack.isEmpty() && nums[i] >= nums[stack.peekLast()]){
                stack.removeLast();
            }

            stack.addLast(i);

            //check outside numbers. 
            //peekfirst checks index, if index is less than formula
            if(stack.peekFirst() < i - k + 1){
                stack.removeFirst();
            }

            if(i >= k - 1){
                returnlist[index] = nums[stack.peekFirst()];
                index++;
            }
        }
        return returnlist;
    }
}
