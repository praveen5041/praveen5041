import java.util.*;
public class StringToken {
    static String s="Rama sita:"+"Ravana brahama:";
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringTokenizer st=new StringTokenizer(str," ");
        String in1=sc.nextLine();
        String in2=sc.nextLine();
        while(st.hasMoreTokens()){
                System.out.println(st.nextToken());
                if(st.countTokens(st.nextToken));
        }
        StringTokenizer sr=new StringTokenizer(s,":");
        while(sr.hasMoreTokens()){
            String key=sr.nextToken();
            String val=sr.nextToken();
            System.out.println(key+"\n"+val);
        }
        //date utilies
        Date date=new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        //calender utilies
        Calendar calendar=Calendar.getInstance();
        
        System.out.println(calendar);
        System.out.println(calendar.get(Calendar.HOUR));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
    }
}
