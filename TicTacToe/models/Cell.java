package TicTacToe.models;

public class Cell {
    public CellState getCellState;
    private int row;
    private int col;
    private CellState cellState;
    private Player player;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        this.cellState = CellState.EMPTY;
    }

    public void displayCell() {
        if(player == null) {
            System.out.print("| |");
        } else {
            System.out.print("|" + player.getSymbol() + "|");
        }
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public CellState getCellState() {
        return cellState;
    }
}
