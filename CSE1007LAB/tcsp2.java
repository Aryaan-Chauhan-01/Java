//to greet someone based on the time of the local system
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
class tcsp2
{
    public static void main(String args[])
    {
        System.out.println(java.time.LocalDateTime.now());
        //d=java.time.LocalDateTime.now();
        System.out.println(java.time.Clock.systemUTC().instant());
    }
}