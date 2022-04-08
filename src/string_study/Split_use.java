package string_study;

public class Split_use {

	public static void main(String[] args) {
		 String s="I Love My India";
		 String seperator=" "; //seperate by space that is >>" "
		 String[] splittedString =s.split(seperator);
		 
for (int i=0;i<=splittedString.length-1;i++) {
	System.out.println(splittedString[i]);
}
		 System.out.println("***************************************");
		 String name ="My_Name_is_Sid";
		 String sep="_";
		 String[] output =name.split(sep);
		 for(int i=0;i<=output.length-1;i++) {
			 System.out.println(output[i]);
		 }
	}

}
