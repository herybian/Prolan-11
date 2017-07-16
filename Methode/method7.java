package laporanmethod;

/**
 *
 * @author Herybian
 */
public class method7 {
    private static int i;
       public static void main (String [] args){
        System.out.println("Hery Bian\n");
        int [] ages = { 99 , 66 , 69 };
        for (int i = 0 ; i < ages.length; i++)
        {
            System.out.println(ages[i]);
        }
        test (ages);
        for ( int i = 0 ; i<ages.length ; i++)
        {
            System.out.println( ages [i] );
        }
    }
    public static void test (int [] arr  )
    {
        for ( int i = 0 ; i<arr.length ; i++);
    {
            arr[i] = i + 77 ;
    }
  } 
}
