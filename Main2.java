import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n = Integer.parseInt(s.split(" ")[0]);
		int m = Integer.parseInt(s.split(" ")[1]);
		String word = sc.nextLine();
		char[][] arr = new char[n][m];
		for (int i = 0; i < n; i++) {
			String line = sc.nextLine();
			for (int j = 0; j < m; j++) {
				arr[i][j] = line.charAt(j);
			}
		}
		if (isLine(arr, word)) {
			System.out.println("YES");
		} else
			System.out.println("NO");

	}

	private static boolean isLine(char[][] arr, String word) {
		int row = arr.length;
		int col = arr[0].length;
		boolean[][] flag = new boolean[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				flag[i][j] = true;
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (arr[i][j] == word.charAt(0)) {
					flag[i][j] = false;
					if (isExits(arr, i, j, word.substring(1), flag)) {
						return true;
					}
					flag[i][j] = false;
				}
			}
		}
		return false;
	}

	private static boolean isExits(char[][] board, int i, int j, String w, boolean[][] flag) {
		if (w.length() == 0)
			return true;
		char c = w.charAt(0);
		if (i + 1 < board.length && board[i + 1][j] == c && isExits(board, i + 1, j, w.substring(1), flag)
				&& flag[i + 1][j]) {
			flag[i + 1][j] = false;
			return true;
		}
		if (i >= 1 && board[i - 1][j] == c && isExits(board, i - 1, j, w.substring(1), flag) && flag[i - 1][j]) {
			flag[i - 1][j] = false;
			return true;
		}
		if (j + 1 < board[0].length && board[i][j + 1] == c && isExits(board, i, j + 1, w.substring(1), flag)
				&& flag[i][j + 1]) {
			flag[i][j + 1] = false;
			return true;
		}
		if (j >= 1 && board[i][j - 1] == c && isExits(board, i, j - 1, w.substring(1), flag) && flag[i][j - 1]) {
			flag[i][j - 1] = false;
			return true;
		}
		return false;
	}

}
