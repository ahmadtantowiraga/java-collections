package com.enigma.java_file_io;

import com.enigma.Mahasiswa;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
//       File file=new File("coba.txt");
//        File file2=new File("coba2.txt");
//        extracted(file);
//        extracted1(file);
//        extracted2(file);
//        extracted3(file);
        Path path=Path.of("mahasiswa");

        try (OutputStream stream = Files.newOutputStream(path))
        {
            ObjectInputStream oos  = new ObjectInputStream(stream);
            Mahasiswa mahasiswa=new Mahasiswa(
                    "cahyo",17,"IT"
            );
            oos.writeObject(mahasiswa);
            oos.close();

        } catch (IOException e){
            e.printStackTrace();
        }

        //load
        try(InputStream stream =Files.newInputStream(path)){
            ObjectInputStream ois=new ObjectInputStream(stream);
            Mahasiswa cahyo =(Mahasiswa) ois.readObject();
            System.out.println(cahyo);
            ois.close();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    private static void extracted3(File file) {
        try (FileReader fd=new FileReader(file)){
            while (true){
                int ascii=fd.read();
                if(ascii==-1)break;
                System.out.println((char)ascii);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void extracted2(File file) {
        try (FileWriter fw= new FileWriter(file)){
            fw.write("Halo Enigma Camp");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void extracted1(File file) {
        try (FileInputStream fis =new FileInputStream(file)){
            while (true){
                int ascii =fis.read();
                if (ascii==-1)break;
                System.out.println((char) ascii);

            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void extracted(File file) {
        try {
            FileOutputStream fos = new FileOutputStream(file, true);
            fos.write(65);
            fos.write(72);
            fos.write(77);
            fos.write(65);
            fos.write(68);
            fos.write(" Tanto Wiraga".getBytes(StandardCharsets.UTF_8));
            fos.close();
        }catch (IOException exception){
                exception.printStackTrace();
            }
    }
}
