public class WarmUp2 {
    public static void main(String[] args) {

        System.out.println("A string"); // this creates a new line after the String is printed
        System.out.printf("timeToSki(30) should be false: %b%n", timeToSki(30));
        System.out.printf("timeToSki(31) should be true: %b%n", timeToSki(31));

        double gpa = 98.76567854567;
        System.out.println("println gpa =" +gpa);
        System.out.printf("printf gpa =%.1f%n",gpa);

        for (int i=0; i<=10000; i+=100)
            System.out.printf("%d%n",i);
    }
    public static boolean timeToSki (int snowDepth)
    {
        return snowDepth >30;
//        if (snowDepth >= 30)
//        {
//            return true;
//        }
//        else {
//            return false;
//        }
    }
}
