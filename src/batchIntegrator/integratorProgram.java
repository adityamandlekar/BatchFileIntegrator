package batchIntegrator;
import java.io.IOException;
import java.lang.Runtime;

public class integratorProgram {
    public static void main(String[] args) {
        {
            try {

                Process process = Runtime.getRuntime().exec("cmd /c start C:\\BatchFileIntegratorMaven.bat");
              } catch (IOException ex) {
            }
        }

    }
}
