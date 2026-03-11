import java.util.*;

public class length_last {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

String n =sc.nextLine();
String [] nn=n.split(" ");
int nv=nn.length-1;
String m=String.valueOf(nn[nv]);
System.out.print(m.length());
    }
}