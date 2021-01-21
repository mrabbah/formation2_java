
package filecopyexample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RABBAH Mahmoud
 */
public class FileCopyExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Path source = Paths.get("C:\\Users\\RABBAH Mahmoud\\Desktop\\example.txt");
        Path dest = Paths.get("C:\\Users\\RABBAH Mahmoud\\Desktop\\new.txt");
        try {
            Files.copy(source, dest, REPLACE_EXISTING);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }

    
}
