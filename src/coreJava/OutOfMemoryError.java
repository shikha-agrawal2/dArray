package coreJava;

public class OutOfMemoryError {
    public static void main(String[] args) {
        int i = ((2^31)-1);
        Object[] obj = new Object[i];
    }
}
