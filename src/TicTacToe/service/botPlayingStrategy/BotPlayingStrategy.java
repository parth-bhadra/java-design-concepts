package src.TicTacToe.service.botPlayingStrategy;

import src.TicTacToe.models.Board;
import src.TicTacToe.models.Move;
import src.TicTacToe.models.Player;

public interface BotPlayingStrategy {
    Move makeMove(Board board, Player player);
}
