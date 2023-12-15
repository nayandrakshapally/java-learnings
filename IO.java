import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IO {
    public static void main(String[] args) throws IOException {
        String filePath = "../filepath";

        try {
            File fileone = new File(filePath);
            if (!fileone.exists()) {
                fileone.createNewFile();
            } else {
                System.out.println("file already exists");
            }
            File dir = new File(filePath);
            if (!dir.exists()) {
                dir.mkdir();
            } else {
                System.out.println("file already exists");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        // Buffered writter and reader
        FileWriter writer = null;
        BufferedWriter bWriter = null;
        try {
            File fileone = new File(filePath);
            writer = new FileWriter(fileone, true);
            bWriter = new BufferedWriter(writer);
            bWriter.write("hello world");
            bWriter.newLine();
            bWriter.write("first write in file");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            bWriter.close();
        }
        // reading data
        FileReader reader = null;
        BufferedReader bReader = null;
        try {
            File fileone = new File(filePath);
            reader = new FileReader(fileone);
            bReader = new BufferedReader(reader);
            String str = bReader.readLine();
            while (str != null) {
                System.out.println(str);
                str = bReader.readLine();
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            bWriter.close();
        }

    }
}
