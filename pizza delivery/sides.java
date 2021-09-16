import java.io.*;
public class sides
{
    public static double price3= 0;
    public static double totalprice3= 0;
    public static void cakes() throws IOException
     {
         String conts;
         BufferedReader buff = new BufferedReader (new InputStreamReader(System.in));
       
        System.out.println( "     PIZZA ITALIAN PIZZAS");
        System.out.println();
        System.out.println("            MENU"    );
        System.out.println();
        System.out.println();
         do
      {
        System.out.println(" SIDES ");
        System.out.println();
        System.out.println(" Veg ");
        System.out.println();
        System.out.println(" 21. Choco Lava Cake            Rs 55 ");
        System.out.println(" 22. Buttersctoch Mouse Cake    Rs 59   ");
        System.out.println(" 23. Garlic BreadSticks         Rs 60");
        System.out.println(" 24. Cheesy Dip                 Rs 20");
        System.out.println(" 25. Cheesy Jalapeno Dip        Rs 20"); 
        System.out.println(" 26. Pepsi[diet]                Rs 50");
        System.out.println();
        System.out.println(" Non Veg ");
        System.out.println();
        System.out.println(" 27. Chicken Wings with cheese 'n' basil dip             Rs 99");
        System.out.println();
        System.out.println(" choose by entering the number");
        int side = Integer.parseInt(buff.readLine());
        System.out.println(" enter the number of sides you want");
        int side_tot = Integer.parseInt(buff.readLine());
        if(side==21)
        {
            price3 = side_tot*55;
        }
        if(side==22)
        {
            price3 = side_tot*59;
        }
        if(side==23)
        {
            price3 = side_tot*60;
        }
        
        if(side==24||side==25)
        {
            price3 = side_tot*20;
        }
        if(side==27)
        {
            price3 = side_tot*99;
        }
        if(side==26)
        {
            price3 = side_tot*50;
        }  
        totalprice3 = totalprice3+ price3;
        System.out.println(" if you want more from this section enter 'continue3' and press 'enter key' else just press 'enter key' .");
         conts = buff.readLine();
    }while(conts.equalsIgnoreCase("continue3"));
    System.out.println();
    System.out.println(" total price is equal to "+ totalprice3);
    System.out.println(" ------------------------------------------------------------------------------------------------------------------------------------------------------------------");
}
}