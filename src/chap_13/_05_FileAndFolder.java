package chap_13;

import java.io.File;

public class _05_FileAndFolder {
    public static void main(String[] args) {
        String folder = ".";
        File filesAndFolders = new File(folder);
        System.out.println("현재 폴더 경로 : " + filesAndFolders.getAbsolutePath());
        for (File file : filesAndFolders.listFiles()) {
            System.out.println(file.getName());
        }
    }
}
