package src.TicTacToe.models;

import src.TicTacToe.service.botPlayingStrategy.BotPlayingStrategy;
import src.TicTacToe.service.botPlayingStrategy.BotPlayingStrategyFactory;

public class Bot extends Player {

    private BotDifficultyLevel botDifficultyLevel;

    public Bot(int id, String name, char symbol, PlayerType playerType, BotDifficultyLevel botDifficultyLevel) {
        super(id, name, symbol, playerType);
        this.botDifficultyLevel = botDifficultyLevel;

    }

    // how does makeMove on bot behave the way I should want to make it behave - override the method
    @Override
    public Move makeMove(Board board) {
        BotPlayingStrategy botPlayingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategy(botDifficultyLevel);
        Move move = botPlayingStrategy.makeMove(board, this);
        return move;
    }
}
