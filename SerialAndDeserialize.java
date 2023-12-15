import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialAndDeserialize {
    public static void main(String[] args) {
        String filePath = "../filepath";
        try {
            FileOutputStream fileone = new FileOutputStream(filePath);
            BufferedOutputStream bos = new BufferedOutputStream(fileone);
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeUTF("Hello world");
            oos.close();
        } catch (Exception e) {

        }

        try {
            FileInputStream fileone = new FileInputStream(filePath);
            BufferedInputStream bos = new BufferedInputStream(fileone);
            ObjectInputStream oos = new ObjectInputStream(bos);
            String text = oos.readUTF();
            System.out.println(text);
            oos.close();
        } catch (Exception e) {

        }
    }
}
