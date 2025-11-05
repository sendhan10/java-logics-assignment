public class dividestringintonparts 
{
   
        public static void main(String[] args) {
            String str = "abcdefghijk";  // 11 chars
            int n = 3;
    
            int partSize = str.length() / n;
            int index = 0;
    
            System.out.println("Dividing into parts :");
            for (int i = 0; i < n - 1; i++) {
                System.out.println(str.substring(index, index + partSize));
                index += partSize;
            }
    
            // Print remaining part
            System.out.println(str.substring(index));
        }
    }


