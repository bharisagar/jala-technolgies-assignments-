package javaio;
import java.io.*;
public class bufferinputstream {
	public static void main(String args[]){    
		  try{    
			  bufferinputstream fin=new bufferinputstream();    
			  bufferinputstream bin=new bufferinputstream();    
		    int i;    
		    while((i=bin.read())!=-1){    
		     System.out.print((char)i);    
		    }    
		    bin.clone();    
		    fin.clone();    
		  }catch(Exception e){System.out.println(e);}    
		 }

	private int read() {
		// TODO Auto-generated method stub
		return 0;
	}    
		}

