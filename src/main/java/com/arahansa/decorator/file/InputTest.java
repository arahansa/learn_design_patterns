package com.arahansa.decorator.file;

import java.io.*;

public class InputTest {
    public static void main(String[] args) {
        int c;
        try(InputStream in = new LowercaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")))){
            while((c=in.read()) >= 0){
                System.out.print((char)c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
