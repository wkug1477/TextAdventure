package util;
//will kuglen utility
import java.awt.*;
import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;
import java.io.*;
import java.awt.event.*;
import javax.imageio.*;
import java.awt.image.*;
//class methods
class Uwk
{
	//Images==============================================================================================
	static BufferedImage im;
	//static BufferedImage im2;
	public static void readImage() throws IOException
	{
		im=ImageIO.read(new File("audience.png"));
		//im2=ImageIO.read(new File("HAL3.png"));
	}
	public static void drawImage(Graphics g)
	{
		g.drawImage(im,0,0,100,80,null);
		//g.drawImage(im2,550,50,100,100,null);
	}
	
	//Miscellaneous=======================================================================================
	public static void delay(int n)
	{
		long startDelay = System.currentTimeMillis();
		long endDelay = 0;
		while(endDelay - startDelay < n)
			endDelay = System.currentTimeMillis();
	}	
	public static int getR(int low, int high)
	{
		Random rand = new Random();
		return rand.nextInt (high - low + 1) + low;
	}	
	
	//colors==============================================================================================
	public static Color getColor(Graphics g)
	{
		return new Color(getR(0,255), getR(0,255), getR(0,255));
	}
	//bright colors
	public static Color getBrightColor()
	{
		return getColor(1f,1f);
	}
	public static Color getColor(float s, float l)
	{
		return Color.getHSBColor(new Random().nextFloat(),s,l);
	}		
	
	//printing display====================================================================================
	public static void sopl(String str)
	{
		System.out.println(str);
	}//public sopl string
	public static void sop(String str)
	{
		System.out.print(str);
	}//public sop string
	public static void sopl(int str)
	{
		System.out.println(str);
	}//public sopl int
	public static void sop(int str)
	{
		System.out.print(str);
	}//public sop int
	public static void sopl(double str)
	{
		System.out.println(str);
	}//public sopl double
	public static void sop(double str)
	{
		System.out.print(str);
	}//public sop double
	public static void sopl(char str)
	{
		System.out.println(str);
	}//public sopl char
	public static void sop(char str)
	{
		System.out.print(str);
	}//public sop char
	
	//get stuff===========================================================================================
	public static int getI(String str)
	{
		int num; // local variable
		Scanner kb = new Scanner(System.in);
		sop(str+"-> ");
		num = kb.nextInt();
		return num;
	}//getInt
	public static String getS(String str)
	{
		String num; // local variable
		Scanner kb = new Scanner(System.in);
		sop(str+"-> ");
		num = kb.nextLine();
		return num;
	}//getString
	public static double getD(String str)
	{
		Double num; // local variable
		Scanner kb = new Scanner(System.in);
		sop(str+"-> ");
		num = kb.nextDouble();
		return num;
	}//getDouble
	public static char getC(String str)
	{
		char num; // local variable
		Scanner kb = new Scanner(System.in);
		sop(str+"-> ");
		num = kb.nextLine().charAt(0);
		return num;
	}//getChar
	
	//display misc.=======================================================================================
	public static void center(String str)
	{
		int len = str.length();
		int tab = (80 - len) / 2;
		for (int k = 1; k <= tab; k++)
			System.out.print(" ");
		System.out.println(str);
	} //display center	
	public static String centerS(String str)
	{
		String str2 = "";
		int len = str.length();
		int tab = (80 - len) / 2;
		for (int k = 1; k <= tab; k++)
			str2 += " ";
		str2 += str;
		return str2;
	}//return centered
	public static void rightJustify(String str)
	{
		int len = str.length();
		int tab = 80 - len;
		for (int k = 1; k <= tab; k++)
		   	System.out.print(" ");
		System.out.println(str);		  
	} //display right justify
	
	
	
	//MY OWN STUFF========================================================================================
	//internet
	public static void internet(String url)
	{
		String cmd = "cmd /c start http://";
		try
		{
			Process p=Runtime.getRuntime().exec(cmd + url);
		}catch(IOException e) {System.out.println(e);}
	}//internet
	
	//quadratic
	public static void quad(double q1,double q2,double q3)
	{
		//q1 = getI("A");
		//q2 = getI("B");
		//q3 = getI("C");
		double x1 = (-q2 + Math.sqrt(Math.pow(q2,2)-4*q1*q3))/(2*q1);
		Uwk.sopl(x1);
		double x2 = (-q2 - Math.sqrt(Math.pow(q2,2)-4*q1*q3))/(2*q1);
		Uwk.sopl(x2);
	}//quad		
	
	//splitter
	public static void split(int times)
	{
		for(int k = 1; k <= times; k++)
			Uwk.sop("~");
		System.out.println();
	}//split
}//class Uwk
