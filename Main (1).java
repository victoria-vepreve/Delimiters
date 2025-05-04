import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        String[] tokens = {"(", "x + y", ")", "* 5"};
        Delimiters d = new Delimiters("(", ")");
        System.out.println(d.getDelimiterList(tokens));

        String open = "<sup>";
        String close = "</sup>";
        d = new Delimiters(open, close);
        ArrayList<String> delimiters = new ArrayList<String>();
        String[] delims = {open, open, close, open, close, close};
        for (String s : delims) delimiters = new ArrayList<String>();
        System.out.println(d.isBalanced(delimiters));
    }
}