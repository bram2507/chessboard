package Chessboard;

public class Chessboard {
    private int width;
    private int heigth;
    private String[][] board = new String[this.width][this.width];

    public Chessboard() {
        this.heigth = 8;
        this.width = 8;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeigth() {
        return this.heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public void displayBoard() {
        for (int i = 0; i < 8; i++)
            for (int j = 0; j < 8; j++) {
                this.board[i][j] = "pepe";
            }

        System.out.print(this.board);
    }

}
