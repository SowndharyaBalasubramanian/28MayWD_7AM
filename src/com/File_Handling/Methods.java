package com.File_Handling;

import java.io.*;

public class Methods {
    public static void main(String[]args){
        File file = new File("Sample.txt");

        //creation
//        try{
//            if(file.createNewFile()){
//                System.out.println("file is created successfully");
//            }else{
//                System.out.println("file already exists");
//            }
//        } catch (IOException e) {
//            System.out.println(e);
//        }

        //write
//        try{
//            FileWriter fw = new FileWriter("Sample.txt"  );
//            fw.write('A');
//            fw.write("\nGood morning everyone...");
//            fw.write("\nWelcome to java file handling");
//            fw.write(100 + "\n");
//            fw.append(200 + "\n");
//            fw.close();
//        } catch (IOException e) {
//            System.out.println(e);
//        }

//        try{
//            FileReader fr = new FileReader("Sample.txt");
//
//            int character;
//
//            while((character = fr.read()) != -1){
//                System.out.println((char) character);
//            }
//            fr.close();
//            System.out.println("the file was read successfully");
//        }catch (IOException e){
//            System.out.println(e);
//        }

       //delete
//        try{
//            if(file.delete()){
//                System.out.println("file deleted successfully");
//            }else
//                System.out.println("File not exists");
//        } catch (Exception e) {
//            System.out.println();
//        }


        //bufferWriter

        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("Sample.txt"));
            bw.write("Good morning");
            bw.newLine();
            bw.append("Everyone");
            bw.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        //bufferedreader
        try{
            BufferedReader br = new BufferedReader(new FileReader("Sample.txt"));
            String line;

            while ((line = br.readLine()) != null){
                System.out.println(line);
            }

            br.close();
            System.out.println("completed");
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
