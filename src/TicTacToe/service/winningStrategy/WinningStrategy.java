package src.TicTacToe.service.winningStrategy;

import src.TicTacToe.models.Board;
import src.TicTacToe.models.Move;
import src.TicTacToe.models.Player;

public interface WinningStrategy {
    Player checkWinner(Board board, Move lastMove);
}
