import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class FileHasher {

    public static void main(String[] args) {
        try {
            // TODO (FH-1): create the JavaFileSystem directory
            File directory = new File("JavaFileSystem");
            directory.mkdir();
            // TODO (FH-2): create notes.txt, data.txt, log.txt and write a sentence into each
            
            File notes = new File(directory, "notes.txt");
            FileWriter nw = new FileWriter(notes);
            nw.write("hashes are unique. sentance 1.");
            nw.close();
            
            File data = new File(directory, "data.txt");
            FileWriter dw = new FileWriter(data);
            dw.write("hashes are unique. sentance 2");
            dw.close();

            File log = new File(directory, "log.txt");
            FileWriter lw = new FileWriter(log);
            lw.write("there is lots and lots of hashes with big numbers. sentance 3.");
            lw.close();

            // TODO (FH-3): read each file back, print it, and write all three into Backup/backup.txt

            String nc = readFile(notesFile);//c is contents, n, notes, d, data, l, log
            String dc = readFile(dataFile);
            String lc = readFile(logFile);

            System.out.println(nc);//notes
            System.out.println(dc);//data
            //log
            System.out.println(lc);

            File backupDirectory = new File(directory, "backup");
            backupDirectory.mkdir();

            File backupFile = new File(backupDirectory, "backup.txt");

            FileWriter bw = new FileWriter(backupFile);//reads into backup
            bw.write(nc + "\n");
            bw.write(dc + "\n");
            bw.write(lc);
            bw.close();
            
            // TODO (FH-4): print each file's name next to hashFile(path)
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }

    /**
     * Reads the file at filePath and returns its SHA-256 hash
     * as a lowercase 64-character hexadecimal string.
     */
    public static String hashFile(String filePath) throws IOException {
        // TODO (FH-4): read the whole file, digest it, convert the bytes to hex
        return "";
    }
}