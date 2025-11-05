public class subsetsofstring 
{
    public static void main(String[] args) {
        String str = "FUN";
        for(int i = 0; i<str.length(); i++)
        {
            String s = "";
            for(int j = i; j<str.length(); j++)
            {
                s += str.charAt(j);
                System.out.println(s);
            }
        }
    }   
}
