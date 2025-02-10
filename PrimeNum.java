class PrimeNum { 
    public static void main(String[] args) {
        
        int range = Integer.parseInt(args[0]);
        
        for (int i = 2; i <= range; i++) {
            boolean isPrime = true;
            
            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) { // If i is divisible by j, it's not prime
                    isPrime = false;
                    break; // No need to check further divisors
                }
            }


            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
