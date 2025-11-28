public class Josephus {

    public static void main(String[] args) {

        System.out.println(josephus(6, 4) + 1); //+1 for 1 based calculation

    }

    static int josephus(int n, int k) {
        if(n==1) return 0;
        return (josephus(n-1, k) + k) % n;
    }
}
