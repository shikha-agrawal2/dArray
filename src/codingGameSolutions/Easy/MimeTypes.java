package codingGameSolutions.Easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//https://www.codingame.com/ide/puzzle/mime-type
public class MimeTypes {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // Number of elements which make up the association table.
        int Q = in.nextInt(); // Number Q of file names to be analyzed.
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String EXT = in.next(); // file extension
            String MT = in.next(); // MIME type.
            map.put(EXT.toLowerCase(), MT);
        }
        in.nextLine();

        for (int i = 0; i < Q; i++) {
            String FNAME = in.nextLine();
            String fileExtension = getFileExtension(FNAME).toLowerCase();// One file name per line.
            if(map.containsKey(fileExtension)){
                System.out.println(map.get(fileExtension));
            }
            else {
                System.out.println("UNKNOWN");
            }
        }



        // For each of the Q filenames, display on a line the corresponding MIME type. If there is no corresponding type, then display UNKNOWN.
        //System.out.println("UNKNOWN");
    }

    private static String getFileExtension(String fname) {
        int i = fname.lastIndexOf('.');
        if(i<0){return "";}
        String substring = fname.substring(i+1);
        return substring;
    }
}
