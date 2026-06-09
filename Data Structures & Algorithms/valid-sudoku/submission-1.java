class Solution {
    public boolean isValidSudoku(char[][] board) {
        

        int count = 0;
        int column = 0;
        for(int i = 0; i < board.length; i++){
            HashMap<Character, Integer> map = new HashMap<Character, Integer>();
            for(int j = 0; j < board.length; j++){
                char currentchar = board[i][j];
                if(currentchar == ('.')){
                    continue;
                }else if(map.containsKey(currentchar)){
                    return false;
                }else{
                    map.put(currentchar, count++);
                }
                
            }
        }

        for(int i = 0; i < board.length; i++){
            HashMap<Character, Integer> map = new HashMap<Character, Integer>();
            for(int j = 0; j < board.length; j++){
                char currentchar = board[j][i];
                if(currentchar == ('.')){
                    continue;
                }else if(map.containsKey(currentchar)){
                    return false;
                }else{
                    map.put(currentchar, count++);
                }
                
            }
        }

        for(int row = 0; row < 9; row = row + 3){
            for(int col = 0; col < 9; col = col + 3){
                HashMap<Character, Integer> map = new HashMap<Character, Integer>();
                for(int i = 0; i < 3; i++){
                    for(int j = 0; j < 3; j++){
                        char currentchar = board[row + i][col + j];
                        if(currentchar == ('.')){
                            continue;
                        }else if(map.containsKey(currentchar)){
                            return false;
                        }else{
                            map.put(currentchar, count++);
                        }
                    }
                }
            }
        }

        return true;
    }
}
