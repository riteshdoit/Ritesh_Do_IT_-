// Java program to count occurrences
// of an element
 2) Count number of occurrences (or frequency) in a sorted array   
               Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 1
               Output: 2  
              Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 4
             Output: -1 // 4 doesn't occur in arr[]
class lab_eg_27_B
{
    // Returns number of times x occurs in arr[0..n-1]
    static int countOccurrences(intarr[], int n, int x)
    { 
        int res = 0;
        for (int i=0; i<n; i++)
            if (x == arr[i])
              res++;
        return res;
    }
     
    public static void main(String args[])
    {
        int arr[] = {1, 2, 2, 2, 2, 3, 4, 7 ,8 ,8 };
        int n = arr.length;
        int x = 2;
        System.out.println(countOccurrences(arr, n, x));
    }
}
