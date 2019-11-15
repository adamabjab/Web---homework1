import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.lang.System;

public class Getting {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		String stat ="stat"; //to write "stat" in html
		String [] colors = { "rectangle blue","rectangle red","rectangle green"}; //three color rectangles  
		int n, m=0;
		PrintWriter printWriter;
		FileWriter fileWriter;
		try{
			fileWriter = new FileWriter("hw1.html"); //html file
			printWriter = new PrintWriter(fileWriter);
			printWriter.print("<!DOCTYPE html>\n");
			printWriter.print("<html><head><style>\n");
			printWriter.print(".stat{position: absolute;top: 0px;left: 0px; display: inline-flex;height: 100%;width: 100%;}\n");
			printWriter.print(".rectangle{height: 100%;width: 100%;}\n");
			printWriter.print(".blue{background-color: blue;}\n");
			printWriter.print(".red{ background-color: red ;}\n");
			printWriter.print(".green{ background-color: green;}\n");
			printWriter.print("</style> </head> <body><div class=" + stat + ">\n");
			n = scr.nextInt(); //scan how many rectangles
			for(int i=0; i<n; i++){
				printWriter.print("<div class="+ "\"" + colors[m] + "\""+  "></div>\n");
				m++;
				if(m==3) //restart the coloring every 3(blue > red > green)
					m=0;
			}
			printWriter.print("</div> </body> </html>\n");
			printWriter.close();
		}
		catch(Exception e){System.out.println("file not found");}
	}
}
