package TicTacToe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int size;
    private List<List<Cell>> board;
    public Board(int size) {
        this.size = size;
        this.board = new ArrayList<>();

        for(int i=0; i<size; i++) {
            this.board.add(new ArrayList<>());
            for(int j=0; j<size; j++) {
                this.board.get(i).add(new Cell(i, j));
            }
        }

    }

    public void displayBoard() {
        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                this.board.get(i).get(j).displayCell();
            }
        }
    }

    public int getSize() {
        return size;
    }

    public List<List<Cell>> getBoard() {
        return board;
    }
}
