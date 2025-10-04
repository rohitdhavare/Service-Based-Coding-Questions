package Leetcode;

class wordSearch {
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(word.charAt(0)==board[i][j])
                {
                    boolean found = dfs(board,i,j,word,0);
                    if(found)
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean dfs(char[][] board,int r,int c,String word,int wordIndex)
    {
        if(wordIndex==word.length())
        {
            return true;
        }
        int row = board.length;
        int col = board[0].length;
        if(r<0 || c<0 ||r>=row||c>=col)
        {
            return false;
        }
        if(board[r][c]==' ' || board[r][c]!=word.charAt(wordIndex))
        {
            return false;
        }

        char ch = board[r][c];
        board[r][c]=' ';
        if(dfs(board,r-1,c,word,wordIndex+1)||
                dfs(board,r+1,c,word,wordIndex+1)||
                dfs(board,r,c-1,word,wordIndex+1)||
                dfs(board,r,c+1,word,wordIndex+1))
        {
            return true;
        }
        // backtrack
        board[r][c]=ch;
        return false;

    }
}
