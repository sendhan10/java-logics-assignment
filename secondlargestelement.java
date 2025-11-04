public class secondlargestelement 
{
    public static void main(String[] args) 
    {
        int[]arr = {4,8,6,9,7};
        int fmax = 0;
        int smax = 0;
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i]>fmax)
            {
                smax = fmax;
                fmax = arr[i];
            }else if(arr[i]>smax){
                smax = arr[i];
            }
        }
        System.out.println(fmax);
        System.out.println(smax);
        
        
    }
    
}
