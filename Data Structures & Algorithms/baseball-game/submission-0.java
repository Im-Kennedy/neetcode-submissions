class Solution {
    public int calPoints(String[] operations) {
        List<Integer> record = new ArrayList<>();
        
        for(String op : operations){
            int size = record.size();
            if(op.equals("C")){
                record.remove(size - 1);
            } else if(op.equals("D")){
                record.add(record.get(size - 1) * 2);
            } else if(op.equals("+")){
                record.add(record.get(size - 1) + record.get(size - 2));
            } else {
                record.add(Integer.parseInt(op));
            }
        }
        
        int sum = 0;
        for(int score : record) sum += score;
        return sum;
    }
}