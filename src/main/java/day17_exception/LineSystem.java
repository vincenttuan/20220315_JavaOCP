package day17_exception;

public class LineSystem {
    public static void main(String[] args) {
        LineService lineService = new LineService();
        int statusCode = 0;
        try {
            //statusCode = lineService.sendSticker("貼圖", 11537, 52002753);
            String imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/b/bf/F-16C_Fighting_Falcon.JPEG/300px-F-16C_Fighting_Falcon.JPEG";
            statusCode = lineService.sendWebImage("Web", imageUrl);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        System.out.println(statusCode);
        
    }
}
