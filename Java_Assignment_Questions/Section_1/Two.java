public class Two {
    
    public static void main(String[] args) {
        int a=1;
        int b=2;
        System.out.println("Before swap: a="+a+" b="+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swap: a="+a+" b="+b);
        a=1;
        b=2;
        System.out.println("Before tempSwap: a="+a+" b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After tempSwap: a="+a+" b="+b);

    }

}
