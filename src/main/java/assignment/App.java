package assignment;
import java.util.Scanner;
import java.util.logging.Logger;

class Crddeatils implements Cloneable{
    String cardholdername;
    long cardnumber;
    String expidate;


    Crddeatils(String cardholdername, long cardnumber, String expidate)
    {
        this.cardholdername= cardholdername;
        this.cardnumber = cardnumber;
        this.expidate = expidate;
    }
    boolean checkequals(long newcardnumber)
    {
        return cardnumber == newcardnumber;
    }

    Crddeatils clon()
    {
        try
        {
        return (Crddeatils) super.clone();
        }
        catch(CloneNotSupportedException e)
        {
            return null;
        }
    }
}
public class App {

    private static final Logger LOGGER = Logger.getLogger("InfoLogging");
    public static void main(String[] args) throws CloneNotSupportedException{
        String cardholdername;
        long cardnumber;
        String expidate;
        long newcardnumber;

        Scanner sc=new Scanner(System.in);
        LOGGER.info("Enter Card Holder name:");
        cardholdername=sc.nextLine();
        LOGGER.info("Enter Card number: ");
        cardnumber=sc.nextLong();
        LOGGER.info("Enter Expiration date:");
        expidate=sc.next();
        Crddeatils cd=new Crddeatils(cardholdername, cardnumber, expidate);
        Crddeatils cdclone=cd.clon();
        LOGGER.info("Enter New card number: ");
        newcardnumber=sc.nextLong();
        Boolean t=cd.checkequals(newcardnumber);
        String res=String.valueOf(t);
        LOGGER.info(res);
        cdclone.cardnumber = newcardnumber;
        LOGGER.info("Card updated successfully.");
        LOGGER.info("Card number: {}",cdclone.cardnumber);
        LOGGER.info("Card holder name : {}",cd.cardholdername);
        LOGGER.info("Expiration date : {}",cd.expidate);


    }
}
