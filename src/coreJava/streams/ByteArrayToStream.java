package coreJava.streams;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class ByteArrayToStream {

    public static void main(String args[]) {
        String str = "Google is GOD";
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        // Creating InputStream from byte array
        // ByteArrayInputStream is sub-class of InputStream
        InputStream is = new ByteArrayInputStream(bytes);
        String stringFromBytes = streamToString(is, StandardCharsets.UTF_8);
        System.out.println("String recreated from bytes : " + str);
        // Writing byte array to OutputStream
        OutputStream os = new ByteArrayOutputStream();
        try {
            os.write(bytes);
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /*
     * Read String from InputStream and closes it
     */
    public static String streamToString(InputStream is, Charset encoding) {
        BufferedReader br = new BufferedReader(new InputStreamReader(is, encoding));
        StringBuilder sb = new StringBuilder(1024);
        try {
            String line = br.readLine();
            while (line != null) {
                sb.append(line);
                line = br.readLine();
            }
        } catch (IOException io) {
            System.out.println("Failed to read from Stream");
            io.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException ioex) {
                System.out.println("Failed to close Streams");
                ioex.printStackTrace();
            }
        }
        return sb.toString();
    }


    //Read more: https://javarevisited.blogspot.com/2014/04/how-to-convert-byte-array-to-inputstream-outputstream-java-example.html#ixzz6544MMxz7
}
