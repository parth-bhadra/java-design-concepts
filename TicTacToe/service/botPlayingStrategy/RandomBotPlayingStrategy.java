package TicTacToe.service.botPlayingStrategy;

import TicTacToe.models.Board;
import TicTacToe.models.Cell;
import TicTacToe.models.CellState;
import TicTacToe.models.Move;

import java.util.List;

public class RandomBotPlayingStrategy implements BotPlayingStrategy {
    @Override
    public Move makeMove(Board board) {
        List<List<Cell>> matrix = board.getBoard();
        for(int i=0; i<matrix.size(); i++) {
            for(int j=0; j<matrix.size(); j++) {
                if(matrix.get(i).get(j).getCellState().equals(CellState.EMPTY)) {
                    return new Move(i, j);
                }
            }
        }

        return null;

    }
}
