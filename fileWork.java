import java.io.FileWriter;
import java.io.IOException;

public class fileWork {
    public static void main(String[] args) {
        
        // Создание и запись дозапись

        try (FileWriter fw = new FileWriter("file.txt", false)) {
            fw.write("line 1");
            fw.append('\n');
            fw.append('2');
            fw.append('\n');
            fw.write("line 3");
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());

        }

    }

}
