import java.util.Arrays;
public class anagram 
{
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        String str1 = s1.replaceAll("[^a-zA-Z]","").toLowerCase();
        String str2 = s2.replaceAll("[^a-zA-Z]","").toLowerCase();
        if(str1.length()!=str2.length())
        {
            System.out.println("Not an anagram");
            return;
        }
        char[]arr = str1.toCharArray();
        char[]arr1 = str2.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);
        if(Arrays.equals(arr,arr1)){
            System.out.println("It is an anagram");
        }else{
            System.out.println("Not an anagram");
        }
    }
   
}
