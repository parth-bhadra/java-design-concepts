package src.TicTacToe.service.botPlayingStrategy;

import src.TicTacToe.models.BotDifficultyLevel;

public class BotPlayingStrategyFactory {
    // TODO: Create an enum for botPlayingStrategies, use it with switch case
    public static BotPlayingStrategy getBotPlayingStrategy(BotDifficultyLevel botDifficultyLevel) {
        switch(botDifficultyLevel) {
            case EASY -> {
                return new RandomBotPlayingStrategy();
            }

        }
        return null;
    }
}
