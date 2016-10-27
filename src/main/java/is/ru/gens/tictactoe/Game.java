package is.ru.gens.tictactoe;

public class Game {
	
    public static void initialize_board(char[][] board, int rows, int column) {

	    for(int i = 0; i < rows; i++)
	    {
	        for(int j = 0; j < column; j++)
	         {
	           board[i][j] = ' ';
	         }
	     }
    }

    public static void displayBoard(char[][] board)
    {
    	int rows = 3;
    	int column = 3;
    	if(board[0][0] != ' ')
    	{
    		for(int i = 0; i < rows; i++)
	    	{
		        for(int j = 0; j < column; j++)
		    	{
		    		System.out.println(board[i][j] + " rows " +  i + " column" + j);
		    	}
	    	}
    	}
    	    else
		    {
		    	System.out.println("Empty board");
		    }
	}
}
