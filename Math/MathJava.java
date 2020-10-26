class MathJava{
    public static void main(String[] args) {



        int Max = Math.max(5, 10); //find max with this 2 value
        int Min = Math.min(5, 10); //find min with this 2 value
        double Sq = Math.sqrt(64);   //find sqea rout  == reskarea in khmer

        double Absolute = Math.abs(-4.7); //The Math.abs(x) method returns the absolute (positive) value of x:

        double Rabdom = Math.random(); //Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive):

        int randomNum = (int)(Math.random() * 101);  // 0 to 100

        System.out.println(randomNum);
        int day = 4;
            switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            }
    }
}