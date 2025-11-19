public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] start = new boolean[n+1];
        int p = 2;
        for(int i = 0; i <= n; i++){
            if(i>1)
            start[i] = true;
        }
        while (p<=Math.sqrt(n)) {
            if (start[p] == true) {
                for(int i = 0; i <= n; i++){
                    if (i > p && i % p == 0) {
                        start[i] = false;
                    }
                }
            }
            p++;
        }
        int count = 0;
        for(int i = 0; i<=n; i++){
            if (start[i] == true) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("There are " + count + " primes between 2 and " + n + ". (" + (int)(((double) count / n)*100) + "% are primes)");

    }
}