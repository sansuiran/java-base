package com.rank.base.string;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/**
 * 1024rank.com
 */
public class StringRank {

    public static void main(String[] args) throws UnsupportedEncodingException {

        makeStringBuilder();


    }

    public static void  makeStringBuilder(){
        StringBuilder builder = new StringBuilder("1024rank.com");
        String s = new String(builder); //1024rank
        System.out.print(s);
    }

    public static void makeStringBuffer(){
        StringBuffer buffer = new StringBuffer("1024rank.com");
        String s = new String(buffer);
        System.out.print(s);
    }

    public static void charArray(){
        char charArr[] = {'1', '0', '2', '4', 'r','a','n','k'};
        String s = new String(charArr); //1024rank.com
        System.out.print(s);
    }

    public static void byteArray(){
        String webUrl="1024rank.com";
        String webUrlNew= new String("1024rank.com");
        Charset cs = Charset.defaultCharset();
        byte[] demoArray = { 102, 101, 107, 115};
        String s =new String(demoArray,1,3); //1024rank.com
        System.out.print(s);
    }

}
