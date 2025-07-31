package com.File_Handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Directories_Ex {
    public static void main(String[]args){
       // File dir = new File("My Folder/ Folder 1/ Folder 2");

//        if(dir.mkdir()){
//            System.out.println("folder created");
//        }else{
//            System.out.println("folder exists already");
//        }

//        if (dir.mkdirs()){
//            System.out.println("done");
//        }else
//            System.out.println("not");

        File folder = new File("Folder");
        folder.mkdir();

        File file = new File(folder,"Example.txt");

        try{
            FileWriter fw = new FileWriter(file);
            fw.write("Hi");
            fw.close();
        } catch (IOException e) {
            System.out.println(e);
        }

        if(folder.exists()){
            System.out.println("folder exists");
        }

        File old = new File("Example.txt");
         File newFile = new File("Ex.txt");
        old.renameTo(newFile);

        System.out.println(folder.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.getName());
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.exists());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.canExecute());
        System.out.println(file.length());
        System.out.println(file.lastModified());


//        if(folder.exists() && folder.isDirectory()){
//            String [] files = folder.list();
//
//            for(String fname : files){
//                System.out.println(fname);
//            }
//        }else{
//            System.out.println("not exists");
//        }
        if(folder.exists() && folder.isDirectory()){
            File [] files = folder.listFiles();

            if(files != null && files.length >0){
                for (File f : files){
                    System.out.println(f.getAbsolutePath());
                }
            }else
                System.out.println("empty");
        }else {
            System.out.println("not exists");
        }

    }
}
