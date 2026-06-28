class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        double[][] cars = new double[position.length][2];
        for(int i = 0; i < position.length; i++){
            cars[i][0] = position[i]; //position
            cars[i][1] = speed[i];
        }

        Arrays.sort(cars, (a, b) -> Double.compare(b[0], a[0]));

        Stack<Double> list = new Stack<>();
        
        for(int i = 0; i < cars.length; i ++){
            double tta = (target - cars[i][0]) / cars[i][1];
            if(list.isEmpty() || tta > list.peek()){
                list.push(tta);
            }
        }
        return list.size();
    }
}
