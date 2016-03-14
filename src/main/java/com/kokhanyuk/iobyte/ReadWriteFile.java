package com.kokhanyuk.iobyte;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Alex on 09.03.2016.
 */
public class ReadWriteFile {

    public void writeByteSearchWord(String[] keyWords, String text, String fileName) {
        int n;
        String s = "";
        for(String wd:keyWords) {
            n=0;
            Pattern p2 = Pattern.compile(wd);
            Matcher m2 = p2.matcher(text);
            while (m2.find()) {
                if (n == 0){ System.out.print(m2.group());
                s += m2.group();
                    s=s+" \n";}
                n++;
            }
            System.out.println(" -" + n);

        }
            File fileByte = new File(fileName);

            FileOutputStream fos = null;
            try {
                fos = new FileOutputStream(fileByte);

                fos.write(s.getBytes());


            } catch (IOException e) {
                System.err.println("Error output: " + e);

            } finally {
                try {
                    if (fos != null) {
                        fos.close();
                    }
                } catch (IOException e) {
                    System.err.println("Error closing: " + e);
                }

        }
    }


    public String readByteFile(String fileName) {
        String strOut = "";
        File fp = new File(fileName);
        if (fp.exists() && fp.isFile()) {
            int b;
            FileInputStream is = null;
            try {
                is = new FileInputStream(fp);
                while ((b = is.read()) != -1) {
                    strOut = strOut + Character.toString((char) b);
                }
            } catch (IOException e) {
                System.err.println("Error file: " + e);
            } finally {
                try {
                    if (is != null) {
                        is.close();
                    }
                } catch (IOException e) {
                    System.err.println("Error closing: " + e);
                }
            }
        } else {
            System.out.println("File " + fp.getName() + " not found");
        }
        return strOut;
    }
}
