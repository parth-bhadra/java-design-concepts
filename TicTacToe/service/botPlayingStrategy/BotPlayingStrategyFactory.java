package TicTacToe.service.botPlayingStrategy;

public class BotPlayingStrategyFactory {
    // TODO: Create an enum for botPlayingStrategies, use it with switch case
    public BotPlayingStrategy getBotPlayingStrategy() {
        return new RandomBotPlayingStrategy();
    }
}
