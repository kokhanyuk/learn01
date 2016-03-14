package com.kokhanyuk.iobyte;

/**
 * Created by Alex on 09.03.2016.
 */
public class IoByte {
    public static void main(String[] arg) {
        String fileName = "TaxCalculator01.txt";
        String[] keyWords = new String[]{"public", "class", "int", "void", "for"};

        ReadWriteFile byteRead = new ReadWriteFile();

        // System.out.println(byteRead.readByteFile(fileName));
       // for (String word : keyWords) {
            byteRead.writeByteSearchWord(keyWords, byteRead.readByteFile(fileName), "out.txt");
        //}
    }
}
