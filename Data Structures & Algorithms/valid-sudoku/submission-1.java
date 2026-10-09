class Solution {
    public boolean isValidSudoku(char[][] board) {
        int [] rows= new int[9];
        int[] cols=new int[9];
        int[] submat=new int[9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                int val = board[i][j];
                if(board[i][j]=='.'){
                    continue;
                }
                int pos = 1 << (val-1);
                if((rows[i] & pos)>0){
                    return false;
                }
                rows[i]=rows[i] | pos;
                if((cols[j] & pos)>0){
                    return false;
                }
                cols[j]=cols[j]|pos;
                int idx = (i/3)*3 +j/3;
                if((submat[idx] & pos)>0){
                    return false;
                }
                submat[idx] = submat[idx] | pos;
            }
        }
        return true;
    }
}
