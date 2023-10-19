package TicTacToe.models;

import TicTacToe.exceptions.DuplicateSymbolException;
import TicTacToe.exceptions.InvalidBoardSizeException;
import TicTacToe.exceptions.InvalidBotCountException;
import TicTacToe.exceptions.InvalidPlayerCountException;
import TicTacToe.service.winningStrategy.WinningStrategy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Game {
    private Board currentBoard;
    private List<Player> players;
    private Player currentPlayer;
    private GameStatus gameStatus;
    private Player winner;
    private List<Move> moves;
    private List<Board> boardStates;
    private WinningStrategy winningStrategy;

    private Game(Board currentBoard, List<Player> players, WinningStrategy winningStrategy) {
        this.currentBoard = currentBoard;
        this.players = players;
        this.gameStatus = GameStatus.IN_PROGRESS;
        this.moves = new ArrayList<Move>();
        this.boardStates = new ArrayList<Board>();
        this.winningStrategy = winningStrategy;
    }

    public static Builder builder () {

        // if and only if validation succeeds, create a game object
        // otherwise don't

        return new Builder();
    }

    public static class Builder {
        private int dimension;
        private List<Player> players;
        private WinningStrategy winningStrategy;

        public Builder setCurrentBoard(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setWinningStrategy(WinningStrategy winningStrategy) {
            this.winningStrategy = winningStrategy;
            return this;
        }

        public void validateBotCount() throws InvalidBotCountException {
            int botCount = 0;
            for(Player player: players) {

                if(player.getPlayerType().equals(PlayerType.BOT)) {
                    botCount++;
                }
            }
            if(botCount > 1) {
                throw new InvalidBotCountException("Bot count cannot be more than 1, currently: " + botCount);
            }
        }

        public void validateBoardSize () throws InvalidBoardSizeException {
            if(dimension < 3 || dimension > 10) {
                throw new InvalidBoardSizeException("Board size should be <= 3 OR >= 10, currently: " + dimension);
            }
        }

        public void validatePlayerCount() throws InvalidPlayerCountException {
            if(players.size() != dimension-1) {
                throw new InvalidPlayerCountException("Player count is invalid, currently: " + players.size());
            }
        }

        public void validateDuplicateSymbol() throws DuplicateSymbolException {
            HashSet<Character> symbolSet = new HashSet<>();
            for(Player player : players) {
                symbolSet.add(player.getSymbol());
            }

            if(symbolSet.size() != players.size()) {
                throw new DuplicateSymbolException("All players should have unique symbols");
            }
        }

        public void validate () throws Exception {
            // make this method throw exceptions?
            // or its parent should throw exceptions?
            // write your validations here
            validateBoardSize();
            validateBotCount();
            validateDuplicateSymbol();
            validatePlayerCount();

        }

        public Game build() throws Exception {
            validate();
            return new Game(new Board(dimension), players, winningStrategy);

        }


    }

}
