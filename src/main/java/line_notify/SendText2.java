package line_notify;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

public class SendText2 {
    // 存取權杖
    private static final String TOKEN = "";
    // 發送位置
    private static final String LINE_NOTIFY_URL = "https://notify-api.line.me/api/notify";
    public static void main(String[] args) {
        // 1. 要發送的資料
        String message = "\nHello 哈囉! 我是海綿寶寶";
        try {
            // 2. 發送前設定
            byte[] postData = null;
            postData = ("message=" + message).getBytes("UTF-8");
            System.out.println(Arrays.toString(postData));
            // 3. 建立 URL 物件
            URL url = null;
            url = new URL(LINE_NOTIFY_URL);
             // 4. 建立 HttpURLConnection 物件
            HttpURLConnection conn = null;
            conn = (HttpURLConnection)url.openConnection();
            // conn 設定
            conn.setDoOutput(true); // 可以傳送資料
            conn.setRequestMethod("POST"); // 傳送方式
            conn.setRequestProperty("Authorization", "Bearer " + TOKEN); // 授權 + Bearer 加密
            conn.setUseCaches(false);
            // 5. 訊息發送
            DataOutputStream out = new DataOutputStream(conn.getOutputStream());
            out.write(postData); // 資料寫入(傳送)
            out.flush();
            // 6. 顯示回應資料
            if(conn.getResponseCode() != HttpURLConnection.HTTP_CREATED) { // 過濾掉建立連線的回應
                int statusCode = conn.getResponseCode();
                System.out.println(statusCode);
                if(statusCode == 200) { // HTTP Code 的回應碼 = 200 表示成功
                    System.out.println("發送成功");
                }
            }
        } catch (UnsupportedEncodingException ex) {
            System.out.println("無法編碼:" + ex);
            return;
        } catch (MalformedURLException ex) {
            System.out.println("請確認網址是否正確?" + ex);
            return;
        } catch (IOException ex) {
            System.out.println("連線失敗或資料傳送失敗或資料回應有誤:" + ex);
        }
        
        
    }
}
