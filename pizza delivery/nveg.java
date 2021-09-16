import java.io.*;
public class nveg
{
    public static double price2 = 0;
    public static double totalprice2= 0;
    public static void non()throws IOException
    {
        String cont;
        BufferedReader buff = new BufferedReader (new InputStreamReader(System.in));
   
        System.out.println( "     PIZZA ITALIAN PIZZAS");
        System.out.println();
        System.out.println("            MENU"    );
        System.out.println();
        System.out.println();
         do
     {
        System.out.println(" NON VEGETARIAN ");
        System.out.println();
        System.out.println();
        System.out.println(" Non Veg I ");
        System.out.println(" Price: Small -Rs 155 , Medium -Rs285 ,Large -Rs445 ");
        System.out.println(" 10. Peppy O' Chicken ");
        System.out.println("       [hot 'n' spicy chicken, onion, sweet corn]");
        System.out.println(" 11. Spicy Chicken ");
        System.out.println("       [Red pepper & hot 'n' spicy chicken ]");
        System.out.println(" 12. O' Fiery Chicken ");
        System.out.println("       [Chunks of chicken, onion & green chillies]");
        System.out.println();
        System.out.println(" Non Veg II ");
        System.out.println(" Price: Small -Rs 195 ,  Medium -Rs330 , Large -Rs 495 ");
        System.out.println(" 13. Keema Do Pyaaza ");
        System.out.println("       [onion, double keema and jalapeno]");
        System.out.println(" 14. EurO' Chicken ");
        System.out.println("       [chicken franks, hot 'n' spicy chicken, onion, yellow capsicum & black olives]");
        System.out.println(" 15. Pizza O' Punjab ");
        System.out.println("       [chicken tikka, onion, yellow capsicum, jalapeno]");
        System.out.println(" 16. O' Chicken Supreme ");
        System.out.println("       [hot 'n' spicy chicken, chicken tikki, chunky chicken]");
        System.out.println(" 17. Chicken Golden Deight ");
        System.out.println("       [golden corn, double barbeque chicken & extra cheese]");
        System.out.println();
        System.out.println("    COMBOS ");
        System.out.println(" 18. Peppy O' Chicken(S) + Keema Do Pyaaza(S)");
        System.out.println("  Actual price = Rs 350 : Offer = Rs300  ");
        System.out.println(" 19. EurO' Chicken(M) + Chicken Wings + Pepsi(Diet) ");
        System.out.println("  Actual price = Rs 479 : Offer = Rs 410 ");
        System.out.println();
        System.out.println("  @@@NEW@@@   ");
        System.out.println(" 20. Pasta Italiano Red              Rs99");
        System.out.println();
        System.out.println(" choose your pizza by entering the number");
        int nveg = Integer.parseInt(buff.readLine());
        System.out.println(" enter the number of pizzas you want");
        int nveg_tot = Integer.parseInt(buff.readLine());
        
    if(nveg>=10&&nveg<=12)
    {
        System.out.println(" enter 'S' for small , 'M' for medium, 'L'for large");
        String nveg_size2 = buff.readLine();
        if(nveg_size2.equalsIgnoreCase("S"))
        {
            price2 = nveg_tot*155;
        }
        if(nveg_size2.equalsIgnoreCase("M"))
        {
            price2 = nveg_tot*285;
        }
        if(nveg_size2.equalsIgnoreCase("L"))
        {
            price2 = nveg_tot*445;
        }
    }
    if(nveg>=13&&nveg<=17)
    {
        System.out.println(" enter 'S' for small , 'M' for medium, 'L' for large");
        String nveg_size3 = buff.readLine();
        if(nveg_size3.equalsIgnoreCase("S"))
        {
            price2 = nveg_tot*195;
        }
        if(nveg_size3.equalsIgnoreCase("M"))
        {
            price2 = nveg_tot*330;
        }
        if(nveg_size3.equalsIgnoreCase("L"))
        {
            price2 = nveg_tot*495;
        }
    }
    if(nveg==18)
    {
        price2 = nveg_tot*300;
    }
    if(nveg==19)
    {
        price2 = nveg_tot*410;
    }
    if(nveg==20)
    {
        price2 = nveg_tot*99;
    }
    totalprice2 = totalprice2 + price2;
        System.out.println(" if you want more pizzas from this section enter 'continue2' and press 'enter key' else just press 'enter key' .");
         cont = buff.readLine();
    }while(cont.equalsIgnoreCase("continue2"));
    System.out.println();
    System.out.println(" total price2 is equal to "+ totalprice2);
    System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
}
}