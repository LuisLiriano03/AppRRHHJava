
package DataaAndRegistration;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LogOperationsPersonnel {
    
    public static void writeToFile(String result) {
        
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("RRHHManagementResults.txt", true));
            writer.write(result);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

}
