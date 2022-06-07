package day24_io;

// 建立資料夾

import java.io.File;

public class CreateFolder {
    public static void main(String[] args) {
        // File 可以當成檔案或目錄
        String path = "src/main/java/day24_io";
        String folderName = "/data";
        String fullPath = path + folderName;
        File file = new File(fullPath);
        if(!file.exists()) {
            // 建立目錄
            file.mkdir();
            System.out.println("建立目錄成功");
        } else {
            System.out.println(file + " 已存在");
        }
    }
}
