package day17_exception;

public class LineSystem {
    public static void main(String[] args) {
        LineService lineService = new LineService();
        int statusCode = 0;
        try {
            // 發送文字訊息
            statusCode = lineService.sendText("Hello...");
            // 發送Youtube連結
            statusCode = lineService.sendText("https://www.youtube.com/watch?v=U9VpeXil8u8");
            // 發送貼圖
            statusCode = lineService.sendSticker("貼圖", 11537, 52002753);
            // 發送網路圖片
            String imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/b/bf/F-16C_Fighting_Falcon.JPEG/300px-F-16C_Fighting_Falcon.JPEG";
            statusCode = lineService.sendWebImage("Web", imageUrl);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        System.out.println(statusCode);
        
    }
}
