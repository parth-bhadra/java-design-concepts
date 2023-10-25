package TicTacToe.service.winningStrategy;

import TicTacToe.exceptions.InvalidBoardSizeException;
import TicTacToe.models.Board;
import TicTacToe.models.Move;
import TicTacToe.models.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class OrderOneWinningStrategy implements WinningStrategy {
    private int dimension;
    private List<HashMap<Character, Integer>> rowHashMaps;
    private List<HashMap<Character, Integer>> columnHashMaps;
    private HashMap<Character, Integer> leftDiagonalHashMap;
    private HashMap<Character, Integer> rightDiagonalHashMap;
    private HashMap<Character, Integer> cornerHashMap;

    public OrderOneWinningStrategy(int dimension) {
        this.dimension = dimension;
        leftDiagonalHashMap = new HashMap<>();
        rightDiagonalHashMap = new HashMap<>();
        cornerHashMap = new HashMap<>();
        this.rowHashMaps = new ArrayList<>();
        this.columnHashMaps = new ArrayList<>();

        for (int i = 0; i < dimension; i++) {
            this.rowHashMaps. add(new HashMap<>());
        }
        for (int j = 0; j < dimension; j++) {
            this.columnHashMaps.add(new HashMap<>());
        }
    }

    public boolean isLeftDiagonalCell(int i, int j) {
        return i == j;
    }

    public boolean isRightDiagonalCell(int i, int j) {
        return i + j == dimension - 1;
    }

    public boolean isCornerCell(int i, int j) {
        return (i == 0 && j == 0) || (i == dimension - 1 && j == 0) || (i == 0 && j == dimension - 1) || (i == dimension - 1 && j == dimension - 1);
    }


    @Override
    public Player checkWinner(Board board, Move lastMove) {
        Player player = lastMove.getPlayer();
        char symbol = player.getSymbol();
        int row = lastMove.getCell().getRow();
        int column = lastMove.getCell().getCol();
        if(checkRowWin(row, symbol, player) != null || checkColWin(column, symbol, player) != null || checkCornerWin(row, column, symbol, player) != null || checkLeftDiagonalWin(row, column, symbol, player) != null || checkRightDiagonalWin(row, column, symbol, player) != null) {
            return player;
        }
        return null;
    }

    public Player checkRowWin(int i, char symbol, Player lastPlayer) {
        // check if there is at least one symbol in the row
        // if not register that symbol as one, in the hashmap
        rowHashMaps.get(i).putIfAbsent(symbol, 0);

        rowHashMaps.get(i).put(
                symbol,
                rowHashMaps.get(i).get(symbol) + 1
        );

        if(rowHashMaps.get(i).get(symbol) == dimension) return lastPlayer;
        return null;
    }

    public Player checkColWin(int j, char symbol, Player lastPlayer) {
        columnHashMaps.get(j).putIfAbsent(symbol, 0);

        columnHashMaps.get(j).put(
                symbol,
                columnHashMaps.get(j).get(symbol) + 1
        );

        if(columnHashMaps.get(j).get(symbol) == dimension) return lastPlayer;
        return null;
    }
    public Player checkLeftDiagonalWin(int i, int j, char symbol, Player lastPlayer) {

        if(isLeftDiagonalCell(i, j)) {
            leftDiagonalHashMap.putIfAbsent(symbol, 0);
            leftDiagonalHashMap.put(symbol, leftDiagonalHashMap.get(symbol) + 1);

            if((int)leftDiagonalHashMap.get(symbol) == dimension) return lastPlayer;
        }
        return null;
    }
    public Player checkRightDiagonalWin(int i, int j, char symbol, Player lastPlayer) {
        if(isRightDiagonalCell(i, j)) {
            rightDiagonalHashMap.putIfAbsent(symbol, 0);
            rightDiagonalHashMap.put(symbol, rightDiagonalHashMap.get(symbol) + 1);

            if((int)rightDiagonalHashMap.get(symbol) == dimension) return lastPlayer;
        }
        return null;
    }
    public Player checkCornerWin(int i, int j, char symbol, Player lastPlayer) {
        if(isCornerCell(i, j)) {
            cornerHashMap.putIfAbsent(symbol, 0);
            cornerHashMap.put(symbol, cornerHashMap.get(symbol) + 1);

            if((int)cornerHashMap.get(symbol) == 4) return lastPlayer;
        }
        return null;
    }


}
