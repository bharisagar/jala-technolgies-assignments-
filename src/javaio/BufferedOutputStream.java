package javaio;
import java.io.FileOutputStream;

public class BufferedOutputStream {
	public static void main(String[] args) {

        String data = "This is a line of text inside the file";

        try {
            // Creates a FileOutputStream
            FileOutputStream file = new FileOutputStream("output.txt");

            // Creates a BufferedOutputStream
            BufferedOutputStream output = new BufferedOutputStream();

            byte[] array = data.getBytes();

            // Writes data to the output stream
            output.write(array);
            output.clone();
        }

        catch (Exception e) {
            e.getStackTrace();
        }}

	private void write(byte[] array) {
		// TODO Auto-generated method stub
		
	}}
