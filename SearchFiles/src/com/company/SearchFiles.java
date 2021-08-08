package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class SearchFiles {

    public static void main(String[] args) {
        List<File> fileList = new ArrayList<>();
        searchFiles(new File("C:/Users/mi"), fileList);
        fileList.forEach(f -> System.out.println(f.getAbsolutePath()));
    }

    private static void searchFiles(File rootFile, List<File> fileList){
        System.out.println("Searching at: " + rootFile.getAbsolutePath());
        File[] files = rootFile.listFiles();
        if(files != null){
            for(File file: files){
                if(file.isDirectory()){
                    searchFiles(file, fileList);
                }else{
                    if(file.getName().toLowerCase().endsWith(".jpg")){
                        fileList.add(file);
                    }
                }
            }
        }
    }

}
