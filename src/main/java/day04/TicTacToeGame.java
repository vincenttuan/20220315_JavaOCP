package day04;

// TTT 井字遊戲

import java.util.Arrays;

public class TicTacToeGame {
    // 棋盤
    static String[][] ttt = new String[3][3];
            
    public static void main(String[] args) {
        
    }
    
    // 開始遊戲
    public static void start() {
        clear();
        gameLoop();
    }
    
    // 遊戲主體
    public static void gameLoop() {
        do {            
            // print ttt
            print();
            // user do it
            // check winner ?
            // pc do it
            // check winner ?
        } while (true);
    }
    
    // 清盤
    public static void clear() {
        for(int i=0;i<ttt.length;i++) {
            for(int k=0;k<ttt[i].length;k++) {
                ttt[i][k] = " ";
            }
        }
    }
    
    // 列印
    public static void print() {
        for(String[] t : ttt) {
            System.out.println(Arrays.toString(t));
        }
    }
    
    
    
}
