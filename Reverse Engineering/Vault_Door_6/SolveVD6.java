import java.util.ArrayList;

public class SolveVD6 
{
    public static void main(String[] args) 
    {
        ArrayList<Character> password = new ArrayList<Character>();
        StringBuilder sb = new StringBuilder();
        String flagOut;
        byte[] myBytes = 
        {
            0x3b, 0x65, 0x21, 0xa , 0x38, 0x0 , 0x36, 0x1d,
            0xa , 0x3d, 0x61, 0x27, 0x11, 0x66, 0x27, 0xa ,
            0x21, 0x1d, 0x61, 0x3b, 0xa , 0x2d, 0x65, 0x27,
            0xa , 0x63, 0x65, 0x64, 0x67, 0x37, 0x6d, 0x62,
        };

        for (int i = 0; i < 32; i++) 
        {
            password.add((char)(myBytes[i] ^ 0x55));
        }

        for (Character ch : password) 
        {
            sb.append(ch);
        }

        flagOut = sb.toString();
        flagOut = "picoCTF{"+flagOut+"}";
        System.out.println(flagOut);
    }

}