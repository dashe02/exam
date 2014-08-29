package io;

import java.io.*;

public class InputTest {
	public static void main(String[] args) throws IOException  {
		int c;

		InputStream fin=new FileInputStream("e:/test.txt");
       BufferedInputStream bin=new BufferedInputStream(fin);
       InputStream in=new LowerCaseInputStream(bin);
		while((c = in.read()) >= 0) {
				System.out.print((char)c);
			}
       bin.close();
       in.close();
       fin.close();
	}
}
