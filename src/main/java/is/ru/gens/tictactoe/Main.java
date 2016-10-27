package is.ru.gens.tictactoe;

public class Main {
	
    public static void main(String[] args) {
    	int numRows = 3;
    	int numColumn = 3;
    	char[][] board = new char[numRows][numColumn];

    	Game new_game = new Game();
    	new_game.initialize_board(board, numRows, numColumn);

    	new_game.displayBoard(board);
    }
}