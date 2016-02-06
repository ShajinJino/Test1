package main;

public class Login

{
	public static boolean test(String uname,String pass)
	{
		boolean t=false;
		String nmae=uname;
		String pas=pass;
	if(nmae=="shajin" && pas=="jino")
	{
	t=true;	
	}
 return t;
}
	public static boolean test1(String uname,String pass)
	{
		boolean t=true;
		String nmae=uname;
		String pas=pass;
	if(nmae=="shajin" && pas=="")
	{
	t=false;
	}
 return t;
}
	public static boolean test2(String uname,String pass)
	{
		boolean t=true;
		String nmae=uname;
		String pas=pass;
	if(nmae=="shajin" && pas!="jino")
	{
	t=false;
	}
 return t;
}
	public static boolean test3(String uname,String pass)
	{
		boolean t=true;
		String nmae=uname;
		String pas=pass;
	if(nmae!="shajin" && pas!="jino")
	{
	t=false;
	}
 return t;
}
	public static boolean test4(String uname,String pass)
	{
		boolean t=true;
		String nmae=uname;
		String pas=pass;
	if(nmae=="" && pas=="")
	{
	t=false;
	}
 return t;
}
}
