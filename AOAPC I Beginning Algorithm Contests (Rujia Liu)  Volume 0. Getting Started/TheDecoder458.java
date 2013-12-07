import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * @author ramekuma
 *
 */
public class TheDecoder458 {
	public static void main(String[] args) throws IOException {
        DataInputStream input = new DataInputStream(System.in);
        DataOutputStream output = new DataOutputStream(System.out) ;
        int C;
        while ((C =input.read()) !=-1)
            output.write((Character.isSpace((char)C) ? C : ((C-7 + 256) % 256)));
    }
}
