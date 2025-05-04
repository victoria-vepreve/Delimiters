import java.util.ArrayList;

public class Delimiters{
    private String openDel;
    private String closeDel;
    
    public Delimiters (String open, String close){
        openDel = open;
        closeDel = close;
    }

    public ArrayList<String> getDelimiterList(String[] tokens){
        ArrayList<String> list2 = new ArrayList();
        for (String i: tokens){
            if (i.equals(openDel) || i.equals(closeDel)){
                list2.add(i);
            }
        }
        return list2;
    }

    public boolean isBalanced(ArrayList<String> delimeters){
        int opens = 0;
        int closes = 0;
        for (String i : delimeters){
            if (i.equals(openDel)) opens++;
            if (i.equals(closeDel)) closes++;
            if (closes > opens) return false;

        }
        return opens == closes;
    }
}