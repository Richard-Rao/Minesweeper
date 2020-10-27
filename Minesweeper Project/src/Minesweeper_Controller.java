
import java.util.Scanner;

public class Minesweeper_Controller {
	int numerRows = 0;
	int numerCols = 0;
	int numerMines = 0;

	Minesweeper_Controller(int rows, int cols, int mines) {
		numerRows = rows;
		numerCols = cols;
		numerMines = mines;
	}

	public void magic() {

		
		Minesweeper_Model model = new Minesweeper_Model();
		model.createNewGrid(numerRows, numerCols, numerMines);

		System.out.println("  /\\/\\ (_)_ __   ___  _____      _____  ___ _ __   ___ _ __ ");
		System.out.println(" /    \\| | '_ \\ / _ \\/ __\\ \\ /\\ / / _ \\/ _ \\ '_ \\ / _ \\ '__|");
		System.out.println("/ /\\/\\ \\ | | | |  __/\\__ \\\\ V  V /  __/  __/ |_) |  __/ | ");
		System.out.println("\\/    \\/_|_| |_|\\___||___/ \\_/\\_/ \\___|\\___| .__/ \\___|_|  ");
		System.out.println("                                           |_|              ");
		Scanner in = new Scanner(System.in);
		int newRow = -1;
		int newCol = -1;

		while (!model.isGameWon()) {

			System.out.print("  ");
			for (int i = 0; i < model.getCols(); i++) {
				System.out.printf("%2d", i);
			}
			System.out.println();
			for (int row = 0; row < model.getRows(); row++) {
				System.out.printf("%2d ", row);
				for (int col = 0; col < model.getCols(); col++) {
					if (model.isFlag(row, col)) {
						System.out.print("! ");
					} else if (!model.isRevealed(row, col)) {
						System.out.print("_ ");
					} else if (model.isRevealed(row, col)) {
						if (model.getNumNeighboringMines(row, col) == 0) {
							System.out.print("  ");
						} else {
							System.out.print(model.getNumNeighboringMines(row, col) + " ");
						}
					}
				}
				System.out.println();
			}
			boolean flaggo = false;
			System.out.println("There are " + model.minesLeft() + " mine(s) left");
			System.out.println("Would you Like to flag a cell or reveal a cell?");
			System.out.print("Enter 'f' or 'r' > ");
			String choice = in.next();
			if (choice.equals("f")) {
				flaggo = true;
			} else {
				flaggo = false;
			}
			System.out.print("Enter row: ");
			newRow = in.nextInt();
			System.out.print("Enter col: ");
			newCol = in.nextInt();
			if (flaggo) {
				if (model.isFlag(newRow, newCol))
					model.setFlag(newRow, newCol, false);
				else
					model.setFlag(newRow, newCol, true);
			} else if (model.isMine(newRow, newCol)) {
				System.out.println("YOU LOST");
				break;
			} else {
				model.reveal(newRow, newCol);
			}
			System.out.println();
		}
		if (model.isGameWon()) {
			System.out.print("  ");
			for (int i = 0; i < model.getCols(); i++) {
				System.out.printf("%2d", i);
			}
			System.out.println();
			for (int row = 0; row < model.getRows(); row++) {
				System.out.printf("%2d ", row);
				for (int col = 0; col < model.getCols(); col++) {
					if (model.isMine(row, col)) {
						System.out.print("* ");
					} else if (model.getNumNeighboringMines(row, col) != 0) {
						System.out.print(model.getNumNeighboringMines(row, col) + " ");
					} else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}

			System.out.println("");

			System.out.print("  ");
			for (int i = 0; i < model.getCols(); i++) {
				System.out.printf("%2d", i);
			}
			System.out.println();
			for (int row = 0; row < model.getRows(); row++) {
				System.out.printf("%2d ", row);
				for (int col = 0; col < model.getCols(); col++) {
					if (model.isFlag(row, col)) {
						System.out.print("! ");
					} else if (!model.isRevealed(row, col)) {
						System.out.print("_ ");
					} else if (model.isRevealed(row, col)) {
						if (model.getNumNeighboringMines(row, col) == 0) {
							System.out.print("  ");
						} else {
							System.out.print(model.getNumNeighboringMines(row, col) + " ");
						}
					}
				}
				System.out.println();
			}
			System.out.println("YOU WIN");
		}
		in.close();

	}

	public static void main(String[] args) {
		Minesweeper_Controller wewp = new Minesweeper_Controller(10, 10, 10);
		wewp.magic();
	}

}
