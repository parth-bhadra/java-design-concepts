package TicTacToe.service.botPlayingStrategy;

import TicTacToe.models.Board;
import TicTacToe.models.Move;

public interface BotPlayingStrategy {
    Move makeMove(Board board);
}
