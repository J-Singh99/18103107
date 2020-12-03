/*
    - integer -1 after converting to byte is -1.
    - converting byte to char, now char is unsigned. So 2^16 - 1.
    - converting the char to integer is a widening typecast (int can hold 2^31-1)
    - so final num becomes 2^16 - 1 = 65535
*/
class Ans2
{
    public static void main(String[] args)
    {
        int num = -1;
        byte byt = (byte)num;
        char chr = (char)byt;
        int fin = chr;
        
        System.out.println("The initial number is: " + num);
        System.out.println("The number after converting into bytes: " + byt);
        System.out.println("And after being converted to character: " + chr);
        System.out.println("The end result is : " + fin + " after converting back to integer.");

        sc.close()
    }

}
