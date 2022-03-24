package day04;

// TTT 井字遊戲

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {
    // 棋盤
    static String[][] ttt = new String[3][3];
            
    public static void main(String[] args) {
        start();
    }
    
    public static void userDoIt() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請 User 輸入位置:");
        int x = scanner.nextInt();
        ttt[x/3][x%3] = "O";
    }
    
    public static void pcDoIt() {
        System.out.print("請 PC 輸入位置:");
        while (true) {            
            Random r = new Random();
            int x = r.nextInt(9); // 0~8
            if(ttt[x/3][x%3].equals(" ")) {
                System.out.println(x);
                ttt[x/3][x%3] = "X";
                break;
            }
        }
    }
    
    // 遊戲主體
    public static void gameLoop() {
        do {            
            // print ttt
            print();
            // user do it
            userDoIt();
            // check winner ?
            // pc do it
            pcDoIt();
            // check winner ?
        } while (true);
    }
    
    // 開始遊戲
    public static void start() {
        clear();
        gameLoop();
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
