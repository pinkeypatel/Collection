package collection;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintFile {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("C:\\Users\\suran\\OneDrive\\Desktop\\kk.txt");
		PrintWriter output = new PrintWriter(file);
		output.print("Dhruv mad");
		output.println("dsfsesaeefdcfgxfgdrzdsrsasdd");
output.close();
	}

}
