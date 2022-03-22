package day03;

// 字串考題2
/*
Which code fragment, enables the code to print true?
A. String str2 = str1;
B. String str2 = new String (str1);
C. String str2 = sb1.toString ();
D. String str2 = "Duke";
*/
public class StringAndStringBuilder2 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Duke");
        String str1 = sb1.toString(); // not in string pool
        String str2 = str1;
        System.out.println(str1 == str2);
    }
}
