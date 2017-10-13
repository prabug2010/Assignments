package com.java.collections.codes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class FileContentSort {

	public static void main(String[] args) {
		
		FileReader fr = null;
		BufferedReader br = null;
		FileOutputStream fos = null;
		File f = new File("D:/File_Sort_Output.txt");
		try {
			TreeMap<String, String> sortedString = new TreeMap<String, String>();
			fr = new FileReader("D:/File_Sort_Input.txt");
			br = new BufferedReader(fr);
			String data = "";
			String res = "";
			StringBuilder sb = new StringBuilder();
			while ((data = br.readLine()) != null) {
				String a = "";
				res = "";
				for (int z = 0, i = 0; z < data.length(); z++) {
					char ch = data.charAt(z);
					if (ch != 32) {
						if (i== 0) {
							res += Character.toUpperCase(ch);
						} else {
							res += ch;
						}
						i++;
					} else {
						res += ' ';
						i = 0;
					}
				}

				String[] x = res.split(" ");
				a = x[0];
				sortedString.put(a, res);
				a = "";
			}
			try {
				for (Map.Entry<String, String> m : sortedString.entrySet()) {
					sb.append(m.getValue());
					fos = new FileOutputStream(f);
					byte[] byt = sb.toString().getBytes();
					fos.write(byt);
					sb.append("\n");
				}
			} catch (IOException d) {
				System.out.println("exception caught");
			} finally {
				fos.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}