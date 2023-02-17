package assignment1;
import java.util.*;
public class Anagram {
	public static void main(String[] args) {
//		Scanner sc = new Scanner (System.in);
		String x ="SILENT";
		String y="LISTEN";
		char a []=x.toCharArray();
		char b[]= y.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		boolean result=Arrays.equals(a,b);
		if (result==true)
		{
			System.out.println("string is anagram");
		}
		else {
			System.out.println("string is not anagram");
		}}}