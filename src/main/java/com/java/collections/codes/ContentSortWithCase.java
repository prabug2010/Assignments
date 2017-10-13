package com.java.collections.codes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.testng.reporters.Files;

public class ContentSortWithCase {

	public static void main(String[] args) {

		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		FileOutputStream fos = null;
		File f = new File("D:/newfile101.txt");
		try {
			fr = new FileReader("D:/File_Sort_Input.txt");
			br = new BufferedReader(fr);
			String data = "";
			while ((data = br.readLine()) != null)
			{
				String[] s = data.split(" ");
				int n=s.length;
				for(int i =0; i<n; i++)
				{
					String x = s[i];
					String res ="";
					for(int z =0; z<x.length(); z++)
					{
						char ch = x.charAt(z);
						if(ch == 32) {
							continue;
						}
						if(z%2==0)
						{
							res+=Character.toUpperCase(ch);
						}
						else
						{
							res+=ch;
						}
					}
					s[i]=res;
					
					System.out.println(res);
					for(int k=0; k<s.length;k++)
					{
						try
						{
							String y =s[k];
							fos = new FileOutputStream(f);
							byte[] byt = y.getBytes();
							fos.write(byt);
						}
						catch(IOException d)
						{
							System.out.println("exception caught");
						}
					}				
		/*			
					try
					{
						fw = new FileWriter(f);
						fw.write(res);
					
					}catch (IOException e)
					{
						e.printStackTrace();	
					}		
					*/	
				}			
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}