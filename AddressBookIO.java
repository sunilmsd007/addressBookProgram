package addressBookProgram;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class AddressBookIO {

	static void readTextFileContent() throws IOException {
		int dataPositionPresent;
		FileReader fileReaderObject = new FileReader("E:\\addressbook.txt");
		while ((dataPositionPresent = fileReaderObject.read()) != -1)
			System.out.print((char) dataPositionPresent);
		fileReaderObject.close();
	}

	static void writeTextFileContent(ArrayList<Person> book) throws IOException {
		FileWriter fileWriterObject = new FileWriter("E:\\addressbook.txt");
		fileWriterObject.append(book.toString());
		fileWriterObject.close();
	}

	public static void main(String[] args) {
		try {
			readTextFileContent();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
