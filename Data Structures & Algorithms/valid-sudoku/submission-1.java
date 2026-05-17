class Solution {
    public boolean isValidSudoku(char[][] board) {
        for( int i = 0; i < 9; i=i+3) {
            for ( int j = 0; j<9; j=j+3) {
                if (!checkSmallBox(i, j, board)) {
                    return false;
                }
            }
        }

        for ( int i = 0; i < 9; i++) {
            Set<Character> uniqueNos = new HashSet<>();
            for ( int j = 0; j < 9; j++) {
                if(uniqueNos.contains(board[i][j])) {
                    return false;
                }
                if (board[i][j] != '.'){
                    uniqueNos.add(board[i][j]);
                }
            }
        }

        for ( int j = 0; j < 9; j++) {
            Set<Character> uniqueColNos = new HashSet<>();
            for ( int i = 0; i < 9; i++) {
                if(uniqueColNos.contains(board[i][j])) {
                    return false;
                }
                if (board[i][j] != '.'){
                    uniqueColNos.add(board[i][j]);
                }
            }
        }

        
        return true;
    }

    private boolean checkSmallBox(int i, int j, char[][] board) {
        Set<Character> uniqueNos = new HashSet<>();
        int m = i, n = j;
        System.out.println("m " + m + " n " + n );
        while (i < m + 3) {
            while (j < n + 3) {
                if (uniqueNos.contains(board[i][j])) {
                    
                    return false;
                }
                if (board[i][j] != '.'){
                    uniqueNos.add(board[i][j]);
                } 
                j++;
            }
            i++;
            j = n;
        }
        return true;
    }
}
