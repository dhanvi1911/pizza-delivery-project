import java.io.* ;
public class menu
{
    public static double price = 0;
    public static double totalprice = 0;
    public static void veg() throws IOException
    {
        String con;
        BufferedReader buff = new BufferedReader (new InputStreamReader(System.in));
        System.out.println( "     PIZZA ITALIAN PIZZAS");
        System.out.println();
        System.out.println("            MENU"    );
        System.out.println();
        do
      {
          System.out.println();
        System.out.println( " VEGETARIAN ");
        System.out.println();
        System.out.println( "Simply Veg");
        System.out.println(" Price: Small - Rs 75 ,Medium - Rs 155 ,Large - Rs 295 ");
        System.out.println(" 1. Margherita ");
        System.out.println("       [Single Cheese Topping and tomato]");
        System.out.println();
        System.out.println(" Veg I ");
        System.out.println(" Price: Small - Rs 110,  Medium -Rs 225 , Large -Rs 385 ");
        System.out.println(" 2. Double Cheese Margherita ");
        System.out.println("       [Extra Cheese and tomato]");
        System.out.println(" 3. O' Veggie Country Special ");
        System.out.println("       [Onion ,Crisp capcicum , cheese, mushroom and fresh tomato ]");
        System.out.println();
        System.out.println(" Veg II ");
        System.out.println(" Price: Small -Rs155 ,  Medium -Rs 285 , Large -Rs 445 ");
        System.out.println(" 4. Peppy Paneer ");
        System.out.println("       [Paneer ,Crisp capcicum and red pepper]");
        System.out.println(" 5. Mexican Red Wave ");
        System.out.println("       [Onion,Crisp capcicum,fresh tomato & jalapeno,Exotic Mexican Herbs,Spicy]");
        System.out.println(" 6. Gourmet ");
        System.out.println("       [Black Olives, golden corn, jalapeno & extra cheese]");
        System.out.println();
        System.out.println("   COMBOS   ");
        System.out.println(" 7. O' Veggie Country Special(M) + Gourmet(M) + Coco Lava Cake ");
        System.out.println("  Actual price = Rs565 : Offer =Rs 500 ");
        System.out.println(" 8. Peppy Paneer(S) + Mexican Red Wave(S) + Cheesy Dip  ");
        System.out.println("  Actual price = Rs330:  Offer = Rs 290 ");
        System.out.println();
        System.out.println(" @@@ NEW @@@   ");
        System.out.println(" 9. Pasta Italiano Red                  Rs 89");
        System.out.println();
        
        System.out.println(" choose your pizza by entering the number");
        int veg = Integer.parseInt(buff.readLine());
        System.out.println(" enter the number of pizzas you want");
        int veg_tot = Integer.parseInt(buff.readLine());
        if(veg==1)
     {   System.out.println(" enter 'S'for small , 'M' for medium, 'L' for large");
        String veg_size1 = buff.readLine();
         if(veg_size1.equalsIgnoreCase("S"))
         {
              price=veg_tot*75;
            }
            else if(veg_size1.equalsIgnoreCase("M"))
         {
              price=veg_tot*155;
            }
            else if(veg_size1.equalsIgnoreCase("L"))
         {
              price=veg_tot*295;
            }
        }
        if(veg==2 || veg==3)
        {
            System.out.println(" enter 'S' for small , 'M' for medium, 'L' for large");
        String veg_size2 = buff.readLine();
         if(veg_size2.equalsIgnoreCase("S"))
         {
              price=veg_tot*110;
            }
            else if(veg_size2.equalsIgnoreCase("M"))
         {
              price=veg_tot*225;
            }
            else if(veg_size2.equalsIgnoreCase("L"))
         {
              price=veg_tot*385;
            }
        }
        if(veg>=4&&veg<=6)
        {System.out.println(" enter 'S' for small , 'M' for medium, 'L' for large");
        String veg_size3 = buff.readLine();
         if(veg_size3.equalsIgnoreCase("S"))
         {
              price=veg_tot*155;
            }
            else if(veg_size3.equalsIgnoreCase("M"))
         {
              price=veg_tot*285;
            }
            else if(veg_size3.equalsIgnoreCase("L"))
         {
              price=veg_tot*445;
            }
        }
        if (veg==7)
        {
            price = veg_tot*500;
        }
        if(veg==8)
        {
            price= veg_tot*295;
        }
        if(veg==9)
        {
            price = veg_tot*89;
        }
        totalprice = totalprice + price;
        System.out.println();
        System.out.println(" if you want more pizzas from this section enter 'continue' and press 'enter key' else just press 'enter key ' .");
         con = buff.readLine();
       }while(con.equalsIgnoreCase("continue"));
    System.out.println();
    System.out.println(" total price is equal to "+ totalprice);
    System.out.println(" ------------------------------------------------------------------------------------------------------------------------------------------------------------");
     }
}   
