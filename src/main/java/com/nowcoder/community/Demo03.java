package com.nowcoder.community;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.io.Reader;

public class Demo03 {
    public static void main(String[] args) throws IOException {
//        Reader r=new FileReader("test.txt");
//        int i=r.read();
//        while(i!=-1){
//            System.out.print((char)i);
//            i=r.read();
//        }
//        Reader r=new FileReader("test.txt");
//        char[] cs=new char[10];
//        int length=r.read(cs);
//        while(length!=-1){
//            System.out.print(new String(cs,0,length));
//            length=r.read(cs);
//        }
//        r.close();

        BufferedReader br=new BufferedReader(new FileReader("test.txt"));
        String line=br.readLine();
        while(line!=null){
            System.out.println(line);
            line=br.readLine();
        }
        br.close();
    }
}
