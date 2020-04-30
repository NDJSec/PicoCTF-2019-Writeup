
public class SolveVD3 
{
    public static void main(String[] args) 
    {

        String flagIn = "jU5t_a_sna_3lpm17ga45_u_4_mbrf4c";

        char[] buffer = new char[32];
        int i;
        for (i=31; i>=17; i-=2) {
            buffer[i] = flagIn.charAt(i);
        }
        for (i=16; i<32; i+=2) {
            buffer[i] = flagIn.charAt(46-i);
        }
        for (i=8; i<16; i++) {
            buffer[i] = flagIn.charAt(23-i);
        }
        for (i=0; i<8; i++) {
            buffer[i] = flagIn.charAt(i);
        }
        
        String password = new String(buffer);
        String flagOut = "picoCTF{"+password+"}";
        System.out.println(flagOut);
        
    }

}