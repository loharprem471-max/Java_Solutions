class stringOp
{
public static void main(String args[])
{
  String s=new String();
  s="shama";
 
  String s1=new String("new shama");
  
  String s2="Radha";

 StringBuffer sb=new StringBuffer("stringbuffer");
 
 String s3=new String(sb);

 StringBuilder sbd=new StringBuilder("stringbuilder");

 String s4=new String(sbd);

 char a[]={'a','b','c','d'};

 String s5=new String(a);

 byte ba[]={1001,2001,3001};

 String s6=new String(ba);

 System.out.println(s);



}
}