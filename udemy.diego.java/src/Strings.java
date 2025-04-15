public class Strings {
    public static void main(String[] args) {

        String original = "abcde FGHIJ ABC abc DEFG             ";
        String s1 = original.toLowerCase();
        String s2 = original.toUpperCase();
        String s3 = original.trim();
        String s4 = original.substring(2);
        String s5 = original.substring(2, 9);
        String s6 = original.replace('a', 'x');
        String s7 = original.replace("abc", "xy");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");

        System.out.println("Original: -" + original + "-");
        System.out.println("LowerCase: -" + s1 + "-");
        System.out.println("UpperCase: -" + s2 + "-");
        System.out.println("Trim: -" + s3 + "-");
        System.out.println("Substring 2: -" + s4 + "-");
        System.out.println("Substring 2 ate 9: -" + s5 + "-");
        System.out.println("Replace a por x: -" + s6 + "-");
        System.out.println("Replace abc por xy: -" + s7 + "-");
        System.out.println("IndexOf 'bc': " + i );
        System.out.println("LastIndexOf 'bc': " + j );
    }
}
