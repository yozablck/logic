package logically;


public class Task6 {
    static boolean a(int A[], int size, int K){
        for(int i = 0; i < (size - 1); i++){
            for(int j = (i + 1); j < size; j++){
                if(A[i] + A[j] == K){
                
                return true;
                }
            }
        }
        return false;
    }
    public static void main (String[]args){
        int A[] = {4,3,6,7,1};
        int K = 10;
        int size = A.length;
        
        if(a(A, size, K)){
            System.out.println("BISA");
        }else{
            System.out.println("TIDAK BISA");
        }
    }
}
//    public static void main (String[]args){
//        int N = 5;
//        int K = 10;
//        int[] array = {4,3,6,7,1};
//        int sum = 0;
//        for(int i = 0;i<array.length;i++){
//            System.out.print(" " + array[i]);
//            for( int num : array){
//                sum = sum+num;
////                 if(10 == sum){
////                System.out.println("BISA");
////                }else{
////                System.out.println("TIDAK BISA");
//            }
//            }
//        }
//    }
    

