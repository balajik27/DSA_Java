package dailyLeetcode;
import java.util.*;

public class Word_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[][] arr = new char[][] {
			{'A','B','C','E'},
			{'S','F','C','S'},
			{'A','D','E','E'}
		};
		
		exist(arr , "ABCCED");
	}
	
	static boolean exist(char[][] board, String word) {
		ArrayList<Character> list = new ArrayList<>();
	

		for(int i=0;i<word.length();i++) {
			list.add(word.charAt(i));
		}

//		list.remove(Character.valueOf('C'));
		System.out.println(list);
		for(int i=0;i<board.length;i++) {
			for(int j = 0;j<board[i].length;j++) {
				if(list.contains(board[i][j])) {
					list.remove(Character.valueOf(board[i][j]));
//					System.out.println("board[i][j] = " + board[i][j]);
					board[i][j] = '$';
				}
			}
		}
		System.out.println(list);
		System.out.println(Arrays.deepToString(board));
		
		return true;
    }
}
