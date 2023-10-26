package src.TicTacToe;

import src.TicTacToe.controller.GameController;
import src.TicTacToe.models.*;
import src.TicTacToe.service.winningStrategy.WinningStrategies;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        GameController gameController = new GameController();

        System.out.println("Enter the dimension of the game");
        int dimension = sc.nextInt();

        System.out.println("Will there be any bot in the game? Y/N");
        String isBotPresent = sc.next();

        List<Player> players = new ArrayList<>();
        int iteratorNumber = dimension - 1;

        if(isBotPresent.equalsIgnoreCase("Y")) {
            iteratorNumber = iteratorNumber - 1;
            String botName = "Boto";
            String botSymbol = "B";

            Bot bot = new Bot(dimension, botName, botSymbol.charAt(0), PlayerType.BOT, BotDifficultyLevel.EASY);

            players.add(bot);

            System.out.println(botName + " has a symbol " + botSymbol);

        }

        // add players
        for(int i=1; i<=iteratorNumber; i++) {
            System.out.println("What is the name of the player: " + i);
            String playerName = sc.next();

            System.out.println("What is the symbol of the player: " + i);
            String symbol = sc.next();

            players.add(new Player(i, playerName, symbol.charAt(0), PlayerType.HUMAN));
        }

        Collections.shuffle(players);

        Game game = gameController.createGame(dimension, players, WinningStrategies.ORDERONE_WINNINGSTRATEGY);

        int playerIndex = -1;
        while(gameController.getGameStatus(game).equals(GameStatus.IN_PROGRESS)) {
            System.out.println("Current board status");
            gameController.displayBoard(game);

            playerIndex++;
            playerIndex = playerIndex % players.size();

            // to play the move
            Move movePlayed = gameController.executeMove(game, players.get(playerIndex));

            // TODO: provision to undo

            Player winner = gameController.checkWinner(game, movePlayed);
            if(winner != null) {
                System.out.println("Winner is: " + winner.getName());
                break;
            }
        }

        if(gameController.getGameStatus(game).equals(GameStatus.DRAW)) {
            System.out.println("It is a draw");
        }
        System.out.println("Final board status");
        gameController.displayBoard(game);
        // TODO: provision for replay
    }
}
