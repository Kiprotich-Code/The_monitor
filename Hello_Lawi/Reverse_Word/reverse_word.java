package HELLO_LAWI.Reverse_Word;

public class reverse_word {
    public static void main(String[] args) {
        String str = "Programmer", nstr="";
        char ch;

        System.out.print("Original word: ");
        System.out.println("Programmer");

        for (int i=0; i<str.length(); i++) 
        {
            ch = str.charAt(i);
            nstr = ch+nstr;
        }

        System.out.println("Reversed string: " + nstr);
    }
}
