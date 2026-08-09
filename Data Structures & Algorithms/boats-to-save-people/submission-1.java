class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int front = 0;
        int back = people.length - 1;
        int count = 0;
        while(front <= back){
            int sum = people[front] + people[back];
            if(sum <= limit){
                count++;
                front++;
                back--;
            }else{
                count++;
                back--;
            }
        }
        return count;
    }
}