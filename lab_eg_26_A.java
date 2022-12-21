public class lab_eg_26_A {
    public static void main(String[] args) {
        int array[]= {23, 92, 56, 39, 93};
        int max = 0;
 
        for(int i=0; i<array.length; i++ ) {
            if(array[i]>max) {
                max = array[i];
            }
        }
        int min = array[0];
 
        for(int i=0; i<array.length; i++ ) {
            if(array[i]<min) {
                min = array[i];
            }
        }
        System.out.println("Maximum value: "+max);
        System.out.println("Minimum value: "+min);
    }
 }
 