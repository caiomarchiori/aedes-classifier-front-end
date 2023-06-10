package persistencia;

import java.io.IOException;

public class main {

	public static void main(String[] args) {
		ReadSequentialFile application = new ReadSequentialFile();
		String filename = "itens.bin";
		try {
			application.openFile(filename);
			application.readRecords();
		}
		catch(IOException e) {
			System.err.println(filename);
			e.printStackTrace();
		}
		finally {
			try {
				application.closeFile();
			}
			catch(IOException e) {
				System.err.println(filename);
				e.printStackTrace();
			}
		}
	}

}
