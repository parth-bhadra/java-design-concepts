package TicTacToe.controller;

import TicTacToe.models.*;
import TicTacToe.service.winningStrategy.WinningStrategies;
import TicTacToe.service.winningStrategy.WinningStrategyFactory;

import java.util.List;

public class GameController {
    public Game createGame(int dimension, List<Player> players, WinningStrategies winningStrategy) {

        try {
            return Game
                    .builder()
                    .setCurrentBoard(dimension)
                    .setPlayers(players)
                    .setWinningStrategy(WinningStrategyFactory.getWinningStrategy(winningStrategy, dimension))
                    .build();
        } catch (Exception e) {
            System.out.println("Error - " + e.getMessage());
            System.out.println("Could not start the game, something went wrong");
        }

        return null;
    }

    public void displayBoard(Game game) {
        game.getCurrentBoard().displayBoard();
    }

    public GameStatus getGameStatus(Game game) {
        return game.getGameStatus();
    }

    public Player getGameWinner(Game game) {
        return game.getWinner();
    }

    public Move executeMove(Game game, Player player) {
        Move move = player.makeMove(game.getCurrentBoard());

        game.setNoOfSymbols(game.getNoOfSymbols() + 1);

        updateGameMoves(game, move);
        updateGameBoardStates(game);

        updateGameStatus(game);
        return move;
    }

    public Player checkWinner(Game game, Move lastMove) {
        Player player = game.getWinningStrategy().checkWinner(game.getCurrentBoard(), lastMove);
        if(player != null) {
            game.setWinner(player);
            game.setGameStatus(GameStatus.COMPLETED);
            return player;
        }
        return null;
    }

    private void updateGameMoves(Game game, Move move) {
        game.getMoves().add(move);
    }

    private void updateGameBoardStates(Game game) {
        game.getBoardStates().add(new Board(game.getCurrentBoard()));
    }

    private void updateGameStatus(Game game) {
        int dimension = game.getCurrentBoard().getSize();
        if(game.getNoOfSymbols() == dimension*dimension) {
            game.setGameStatus(GameStatus.DRAW);
        }
    }

}
