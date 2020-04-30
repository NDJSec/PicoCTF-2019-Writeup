
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;

public class Solve 
{
    public static void main(String[] args) 
    {
        String flagIn = "w4rm1ng_Up_w1tH_jAv4_c0b141c5e30";
        String flagOut = "picoCTF{"+flagIn+"}";
        StringSelection stringSelection = new StringSelection(flagOut);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
        System.out.println("Flag was copied to your clipboard");
        
    }
    
}