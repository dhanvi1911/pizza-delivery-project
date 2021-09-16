import java.io.* ;
public class PizzaItalianPizzas
{
   public static void main()throws IOException
   {   
       double total_amount=0;
       String sc;
       double discount;
       double dis_amt;
       System.out.println("    WELCOME TO PIZZA ITALIAN PIZZAS !!!!  "  );
       BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Enter your name.");
        String name = buff.readLine();
        System.out.println(" Enter your contact information ");
        long number = Long.parseLong(buff.readLine());
    do{
        System.out.println();
        System.out.println(" Enter 1 for veg menu card , 2 for non veg menu card , 3 for                            sides menu card ");         
        int mc = Integer.parseInt(buff.readLine());
        switch(mc)
        {
            case 1: menu.veg();
                   System.out.println();
                   break;
            case 2:nveg.non();
                   System.out.println();
                   break;
            case 3:sides.cakes();
                   System.out.println();
                   break;
            default : System.out.println(" please check your input ");
        }
        total_amount = menu.totalprice + nveg.totalprice2 + sides.totalprice3 ;
        System.out.println();
        System.out.println("  Please type 'stop' if you want to stop ");
        System.out.println(" Type 'continue' if you want to continue ");
        sc = buff.readLine();
        System.out.println();
        }
        while(sc.equalsIgnoreCase("continue"));    
        
        if(total_amount > 500 && total_amount <=1000)
        {
            System.out.println(" As you have purchased above Rs. 500 , so you get a discount of 5% ");
            discount =  0.05 * total_amount;
            dis_amt = total_amount - discount;
           
            System.out.println();
        System.out.println("                             $$$ BILL $$$   ");
        System.out.println();
        System.out.println("                             NAME : "+name);
        System.out.println();
        System.out.println("                      CONTACT NO. : " +number);
        System.out.println();
        System.out.println("                      VEG SECTION : Rs " +menu.totalprice );
        System.out.println();
        System.out.println("                  NON VEG SECTION : Rs "+ nveg.totalprice2);
        System.out.println();
        System.out.println("                            SIDES : Rs "+ sides.totalprice3 );
        System.out.println();
        System.out.println("                AMOUNT TO BE PAID = Rs "+total_amount);
        System.out.println();  
        System.out.println("                         DISCOUNT : Rs " +discount);
        System.out.println();
        System.out.println(" AMOUNT TO BE PAID AFTER DISCOUNT = Rs "+dis_amt);
        System.out.println();  
        System.out.println(" --------------------------------------------------------------------------");
        System.out.println();
    }
    if(total_amount > 1000)
        {
            System.out.println(" As you have purchased above Rs. 1000 , so you get a discount of 10% ");
            discount =  0.10 * total_amount;
            dis_amt = total_amount - discount;
           
            System.out.println();
        System.out.println("                             $$$ BILL $$$   ");
        System.out.println();
        System.out.println("                             NAME : "+name);
        System.out.println();
        System.out.println("                      CONTACT NO. : " +number);
        System.out.println();
        System.out.println("                      VEG SECTION : Rs " +menu.totalprice );
        System.out.println();
        System.out.println("                  NON VEG SECTION : Rs "+ nveg.totalprice2);
        System.out.println();
        System.out.println("                            SIDES : Rs "+ sides.totalprice3 );
        System.out.println();
        System.out.println("                AMOUNT TO BE PAID = Rs "+total_amount);
        System.out.println();  
        System.out.println("                         DISCOUNT : Rs " +discount);
        System.out.println();
        System.out.println(" AMOUNT TO BE PAID AFTER DISCOUNT = Rs "+dis_amt);
        System.out.println();  
        System.out.println(" --------------------------------------------------------------------------");
        System.out.println();
    }
    
    
       else
       {
           System.out.println();
        System.out.println("               $$$ BILL $$$   ");
        System.out.println();
        System.out.println("              NAME : "+name);
        System.out.println();
        System.out.println("       CONTACT NO. : " +number);
        System.out.println();
        System.out.println("       VEG SECTION : Rs " +menu.totalprice );
        System.out.println();
        System.out.println("   NON VEG SECTION : Rs "+ nveg.totalprice2);
        System.out.println();
        System.out.println("             SIDES : Rs "+ sides.totalprice3 );
        System.out.println();
        System.out.println("          DISCOUNT : Rs 0.0 ");
        System.out.println();
        System.out.println(" AMOUNT TO BE PAID = Rs "+total_amount);
        System.out.println();  
        System.out.println(" --------------------------------------------------------------------------");
        System.out.println();
        System.out.println();
    }
            Suggestions.sugg();        
    }
}   








