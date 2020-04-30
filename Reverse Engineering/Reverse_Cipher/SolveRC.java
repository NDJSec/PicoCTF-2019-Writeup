
public class SolveRC 
{
    public static void main(String[] args) 
    {
        String ciphertext = "picoCTF{w1{1wq80haib767}";
        char[] ciphertext2 = ciphertext.toCharArray();
        char[] plaintext = "picoCTF{w1{1wq80haib767}".toCharArray();

        for (int i = 0x16; i >=8; i--) 
        {
            char newchar = ciphertext2[i];

            if ((i & 1) == 0) 
            {
                plaintext[i] = (char) (newchar - 5);
            } 
            else 
            {
                plaintext[i] = (char) (newchar + 2);
            }
        }

        System.out.println(new String(plaintext));

    }

}