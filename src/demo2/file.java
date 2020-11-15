package demo2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class file {
    public static void main(String[] args) throws IOException {
        String onelines=procssfile((BufferedReader br)->br.readLine()+br.readLine());
        System.out.println(onelines);
    }
    public String procssfile() throws IOException{
        try (BufferedReader br=new BufferedReader(new FileReader("data.txt"))){
            return br.readLine();
        }
    }

    public static String procssfile(Bufferpro p)throws  IOException{
        try(BufferedReader br=new BufferedReader(new FileReader("F:\\data.txt"))){
            return p.procss(br);
        }
    }
}
