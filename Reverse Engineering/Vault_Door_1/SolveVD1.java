import java.util.ArrayList;

public class SolveVD1 
{
    public static void main(String[] args)
    {
        ArrayList<Character> password = new ArrayList<Character>();
        StringBuilder sb = new StringBuilder();
        String flag;

        for (int i=0; i < 32; i++) 
        {
            password.add('a');
        }

        password.set(0,'d'); 
        password.set(29,'a');
        password.set(4,'r');
        password.set(2,'5');
        password.set(23,'r');
        password.set(3,'c');
        password.set(17,'4');
        password.set(1,'3');
        password.set(7,'b');
        password.set(10,'_');
        password.set(5,'4');
        password.set(9,'3');
        password.set(11,'t');
        password.set(15,'c');
        password.set(8,'l');
        password.set(12,'H');
        password.set(20,'c');
        password.set(14,'_');
        password.set(6,'m');
        password.set(24,'5');
        password.set(18,'r');
        password.set(13,'3');
        password.set(19,'4');
        password.set(21,'T');
        password.set(16,'H');
        password.set(27,'6');
        password.set(30,'f');
        password.set(25,'_');
        password.set(22,'3');
        password.set(28,'d');
        password.set(26,'f');
        password.set(31,'4');

        for (Character ch : password) 
        {
            sb.append(ch);
        }

        flag = sb.toString();
        flag = "picoCTF{"+flag+"}";
        System.out.println(flag);
    }


}