package Strings;

public class stream {
    public static void main(String[] args) {
        //skip("", "Praveen");
        System.out.println(skips("praaveen"));
        System.out.println(skipp("praveenappwelcome"));
    }
    static void skip(String emp, String orig){
        if(orig.isEmpty()){
            System.out.println(emp);
            return;
        }
        char ch=orig.charAt(0);
        if(ch=='a'){
            skip(emp, orig.substring(1));
        }
        else{
            skip(emp+ch, orig.substring(1));
        }
    }

    //returing the string
    static String skips(String org){
        if(org.isEmpty()){
            return "";
        }
        char ch=org.charAt(0);
        if(ch=='a'){
            return skips(org.substring(1));
        }
        else{
            return ch+skips(org.substring(1));
        }
    }
//skip th word
static String skip(String str){
    if(str.isEmpty()){
        return "";
    }
    char ch=str.charAt(0);
    if(str.startsWith("apple")){
        return skip(str.substring(5));
    }
   // else
    return ch+skip(str.substring(1));
    }

    //skipping not the word apple
    static String skipp(String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("app")&&!str.startsWith("apple")){
            return skipp(str.substring(3));
        }
        return str.charAt(0)+ skipp(str.substring(1));
    }
}
