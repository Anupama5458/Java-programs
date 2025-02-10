class HappyNum {

    
    int fun(int n) {
        int sum = 0;
        while (n != 0) {
            int r = n % 10;
            sum += r * r;
            n = n / 10;

        }
        return sum;
    }

    public static void main(String[] args) {
        HappyNum obj = new HappyNum();  
        int n = Integer.parseInt(args[0]);  
        int num = n;

        while (num != 1 && num != 4) {
            num = obj.fun(num); 
        }

        if (num == 1) {
            System.out.println("It's a happy number! :)");
        } else {
            System.out.println("Not a happy number :(");
        }
    }
}
