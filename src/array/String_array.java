package array;

import java.util.Arrays;

public class String_array {
public static void main(String[] args) {
	String[]str= {"saff","sda","adffd","asds"};
	printString(str);
	//String []str2=returnString();
	printString(returnString());
}

static void printString(String [] str) {
	System.out.println(Arrays.toString(str));
}

static String [] returnString() {
	String []str= {"asds","dsdsa","das"};
	return str;
}
}
