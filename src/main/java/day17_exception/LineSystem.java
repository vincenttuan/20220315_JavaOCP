package day17_exception;

public class LineSystem {
    public static void main(String[] args) {
        LineService lineService = new LineService();
        int statusCode = 0;
        try {
            statusCode = lineService.sendSticker("貼圖", 11537, 52002753);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        System.out.println(statusCode);
        
    }
}
