import java.io.*;
public class FileRW {
	public static void main(String args[]) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			in = new FileInputStream("E:\\Arun\\geonames1000.sql");
			out = new FileOutputStream("E:\\Arun\\output.txt");

			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		}finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}
}
