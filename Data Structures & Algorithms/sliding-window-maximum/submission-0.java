class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> addlist = new LinkedList<>();
        int[] returnlist = new int[nums.length - k + 1];
        int resultIndex = 0;//where to insert next result

        for(int i = 0; i < nums.length; i++){
            //remove from the back anything sxmaller than current
            //they can neer be max while current is in the window
            while(!addlist.isEmpty() && nums[i] >= nums[addlist.peekLast()]){
                addlist.removeLast();
            }

            //add current index to back of deque
            addlist.addLast(i);

            //remove from front if its outside the window
            if(addlist.peekFirst() < i - k + 1){
                addlist.removeFirst();
            }

            //window is full, record the max
            if(i >= k - 1){
                returnlist[resultIndex] = nums[addlist.peekFirst()];
                resultIndex++;
            }
            
        }

        return returnlist;
    }
}
