import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hash_map_Pattern {
    public static  Boolean Word_pattern(String words, String pattern){
        String[] w=words.split(" ");
        if(w.length!=pattern.length())
        return false;
        Map<Character,String>char_word=new HashMap<>();
        Map<String,Character>word_char=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char c=pattern.charAt(i);
            String word=w[i];
            if(!char_word.containsKey(c)){
            char_word.put(c, word);
            System.out.print(char_word.get(c)+" ");
            }
            if(!word_char.containsKey(word)){
            word_char.put(word, c);
            System.out.print(word_char.get(word)+" ");
            }
            System.out.println(char_word.get(c).equals(word));
            System.out.println(word_char.get(word).equals(c));
            if(!char_word.get(c).equals(word)||!word_char.get(word).equals(c))
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String words=sc.nextLine();
        String pattern=sc.next();
        // System.out.println(str);
        // System.out.println(s);
        System.out.println(Word_pattern(words,pattern));
    }
}
