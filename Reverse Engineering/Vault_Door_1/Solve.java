import java.util.ArrayList;

public class Solve 
{

public static void main(String[] args)
    {
        ArrayList<Character> password = new ArrayList<Character>(32);

        password.add(0,'d');
        password.add(29,'7');
        password.add(4,'r');
        password.add(2, '5');
        password.add(23,'r');
        password.add(3,'c');
        password.add(17,'4');
        password.add(1,'3');
        password.add(7, 'b');
        password.add(10,'_');
        password.add(5,'4');
        password.add(9, '3');
        password.add(11,'t');
        password.add(15,'c');
        password.add(8,'l');
        password.add(12,'H');
        password.add(20,'c');
        password.add(14,'_');
        password.add(6,'m');
        password.add(24,'5');
        password.add(18,'r');
        password.add(13,'3');
        password.add(19,'4');
        password.add(21,'T');
        password.add(16,'H');
        password.add(27,'1');
        password.add(30,'f');
        password.add(25,'_');
        password.add(22,'3');
        password.add(28,'e');
        password.add(26,'5');
        password.add(31,'d');

        for(char flag: password)
        {
            System.out.println(flag);
        }
    }

}