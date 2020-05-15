import java.util.HashMap;

public class SearchWord {
    public static void main(String[] args) {
        char[][] board = {{'A'}};
        System.out.println(exist(board, "AB"));
    }
    public static boolean exist(char[][] board, String word) {
        HashMap<Character, Integer> wordCnt = new HashMap<>();
        HashMap<Character, Integer> boardCnt = new HashMap<>();
        for (int z = 0; z < word.length(); z++) {
            wordCnt.put(word.charAt(z), wordCnt.getOrDefault(word.charAt(z), 0) + 1);
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.println(board[i][j]);
                boardCnt.put(board[i][j], boardCnt.getOrDefault(board[i][j], 0) + 1);
            }
        }

        if (word.length() > boardCnt.size()) {
            return false;
        }

        boolean answer = false;
        for (char ch : wordCnt.keySet()) {
            for (char bo : boardCnt.keySet()) {
                if (ch == bo && boardCnt.get(bo) < wordCnt.get(ch)) {
                    return false;
                } else if (ch == bo &&  wordCnt.get(ch) <= boardCnt.get(bo)) {
                    answer = true;
                }
            }
        }
        return answer;
    }
}
