package day17_exception;

import java.io.File;

public class LineService {
    // 存取權杖
    private static final String TOKEN = "";
    // 發送位置
    private static final String LINE_NOTIFY_URL = "https://notify-api.line.me/api/notify";
    // 傳送文字
    public int sendText(String message) {
        return 0;
    }
    // 傳送文字 + 貼圖
    public int sendSticker(String message, int packageId, int id) {
        return 0;
    }
    // 傳送文字 + 網路圖片
    public int sendWebImage(String message, String imageUrl) {
        return 0;
    }
    // 傳送文字 + 本地圖片
    public int sendLocalImage(String message, File imageFile) {
        return 0;
    }
    
}
