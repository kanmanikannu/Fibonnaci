public class Main {
    public static void main(String[] args) {
        int number=12;

        Fibonnaci fibo=new Fibonnaci();
        System.out.println("Fibonnaci="+fibo.fibonnaci(number));
    }
}

class Fibonnaci
{
    int fibonnaci(int number)
    {
        if(number<=1)
        {
            return number;
        }
        return fibonnaci(number-1)+(number-2);
    }
}