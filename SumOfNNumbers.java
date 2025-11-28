public class SumOfNNumbers {

    public static void main(String[] args) {

        System.out.println(SumOfN(3));
    }

    static int SumOfN(int n){

        if (n == 1){
            return 1;
        }else {

            return SumOfN(n-1) + n;
        }


    }
}
