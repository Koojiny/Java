package chap_13;

import java.io.File;

public class _04_Folder {
    public static void main(String[] args) {
        String folderName = "A";
        File folder = new File(folderName);
        folder.mkdir();
        if (folder.exists()) {
            System.out.println("폴더가 존재합니다 : " + folder.getAbsolutePath());
        }

        System.out.println("------------------------------------------------");

        folderName = "A/B/C";
        // "A" + File.separator + "B" + File.separator + "C"
        // 윈도우 : C:\\Users\\koojiny\
        // 맥 : /Users/koojiny/Documents/Dev/Java/A

        folder = new File(folderName);
        // folder.mkdir(); // 단일 폴더 생성
        folder.mkdirs(); // 여러 개의 하위 폴더를 생성
        if (folder.exists()) {
            System.out.println("폴더가 존재합니다 : " + folder.getAbsolutePath());
        } else {
            System.out.println("폴더 생성 실패 (mkdir)");
        }
    }
}
