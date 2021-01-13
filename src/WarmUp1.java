public class WarmUp1 {
    public static void main(String[] args)
    {
        System.out.println("First Question");
        //First Question
        for(int i=100; i>=0; i-=5)
            System.out.println(i);

        System.out.println("Second Question");
        //Second Question
        for(int i =0; i<=100; i+=10)
            System.out.println(i);

        System.out.println("Third Question");
        //Third Question
        for(int i =0; i<=100; i+=10)
        {
//            if (i%20 ==0)
//                System.out.println(i + " Java");
//            else
//                System.out.println(i);

            System.out.printf("%n%s", (i%20==0)? i + " Java": i);
        }


    }
}
