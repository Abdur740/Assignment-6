package assignment;

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

    public Object clone() throws  CloneNotSupportedException
    {
        return  super.clone();
    }
}
