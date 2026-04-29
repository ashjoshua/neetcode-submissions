class Solution {
    public boolean isValidSudoku(char[][] board) {
        if( board == null || board.length !=9 || board[0].length !=9) return false;
            HashSet<Character>[] rows = new HashSet[9];
            HashSet<Character>[] columns = new HashSet[9];
            HashSet<Character>[] box = new HashSet[9];

            for(int i = 0; i<9; i++){
                rows[i] = new HashSet<>();
                columns[i] = new HashSet<>();
                box[i] = new HashSet<>();                
            }

            for(int r= 0; r<9; r++){

                for(int c = 0; c<9; c++){

                        
                        char ch = board[r][c];
                        if(ch== '.'){
                            continue;
                        }
                        int boxIndex = (r/3) *3 + (c/3);
                        if(rows[r].contains(ch)) return false;
                        if(columns[c].contains(ch)) return false;
                        if(box[boxIndex].contains(ch)) return false;

                        rows[r].add(ch);
                        columns[c].add(ch);
                        box[boxIndex].add(ch);


                }
            }



        return true;
    }
}
