package day25_io;

// 將 f18.jpg 上傳到 LineNotify

import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;

public class UploadImageToLineNotify {
    public static void main(String[] args) throws Exception {
        // 1. 準播發送的文字資料
        String message = "F18 大黃蜂";
        // 2. 圖檔位置
        File file = new File("src/main/java/f18.jpg");
        // 3. Token
        String token = "";
        // 4. 發送位置
        String lineNotifyUrl = "https://notify-api.line.me/api/notify";
        // 5. 發送前設定
        // 5.1 標頭檔 Header
        Map<String, String> headers = new LinkedHashMap<>();
        headers.put("Authorization", "Bearer " + token);
        // 5.2 POST 參數
        HttpPostMultipart multipart = new HttpPostMultipart(lineNotifyUrl, "utf-8", headers);
        multipart.addFormField("message", message); // 文字
        multipart.addFilePart("imageFile", file); // 檔案
        // 6. 傳送並取得回傳值
        String response = multipart.finish();
        System.out.println(response);
    }
}
