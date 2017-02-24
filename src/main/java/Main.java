import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author: Brojandos.
 * @creation_date: 24.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder builder = new StringBuilder(reader.readLine());
            System.out.println(builder.toString().equals(builder.reverse().toString()) ? "YES" : "NO");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}