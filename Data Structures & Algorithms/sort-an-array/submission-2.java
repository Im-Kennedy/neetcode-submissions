class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums);
        return nums;
    }

    private void mergeSort(int[] arr) {
        int length = arr.length;
        
        if(length < 2) return;  // base case
        
        int mid = length / 2;
        int[] leftHalf = new int[mid];
        int[] rightHalf = new int[length - mid];
        
        // fill left half
        for(int i = 0; i < mid; i++){
            leftHalf[i] = arr[i];
        }
        
        // fill right half
        for(int i = mid; i < length; i++){
            rightHalf[i - mid] = arr[i];
        }
        
        mergeSort(leftHalf);
        mergeSort(rightHalf);
        merge(arr, leftHalf, rightHalf);
    }

    private void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        
        while(i < left.length && j < right.length){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        
        while(i < left.length){
            arr[k] = left[i];
            i++;
            k++;
        }
        
        while(j < right.length){
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}