import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Main {
    static int total=0;
    static  Scanner input=new Scanner(System.in);
    public static void itemType(String str,int itemPrice ){
        System.out.println(printSpaces()+"************* "+str+" *************");
        int itemQuantity;
        System.out.print(printSpaces()+"Enter quantity = ");
        itemQuantity=input.nextInt();
        itemPrice=itemQuantity*itemPrice;
        System.out.println(printSpaces()+"You order "+itemQuantity+"  "+str+" whose price is "+itemPrice);
            total+=itemPrice;
    }
    public static void coffe(){
        printHeader("COFEE");
        System.out.println(printSpaces()+"(1)****HOT Cofee...$20");
        System.out.println(printSpaces()+"(2)****COLD Cofee...$25");
        int cofeeChoice=input.nextInt();
        if (cofeeChoice==1){
           itemType("HOT Cofee",20);
        } else if (cofeeChoice==2) {
           itemType("COLD Cofee",25);
        }else{
            System.out.println(printSpaces()+"Please Select 1 or 2");
        }
    }
    


    public static void burgers(){
        printHeader("Burger");
        System.out.println(printSpaces()+"(1)****Zinger Burger...$100");
        System.out.println(printSpaces()+"(2)****Cheese Burger...$110");
        System.out.println(printSpaces()+"(3)****Beef Burger.....$90");
        System.out.println(printSpaces()+"(4)****Mexian Burger...$200");
        System.out.print(printSpaces()+"Please select your choice ");
        String choiceInString= input.next();
        try {
            int choice=Integer.parseInt(choiceInString);
            switch (choice){
                case 1:{
                    itemType("Zinger Burger",100);
                }break;
                case 2:{
                    itemType("Cheese Burger",110);
                }break;
                case 3:{
                    itemType("Beef Burger",90);
                }break;
                case 4:{
                    itemType("Mexian Burger",200);
                }break;
                default:{
                    System.out.println(printSpaces()+"Pleses select a number from a given range");
                }
            }
        }catch (NumberFormatException e){
            System.out.println(printSpaces()+"only caracters are allowed");
        }
    }










    public static void pizzas(){
        printHeader("pizzas");
        System.out.println(printSpaces()+"(1)**** Chicken Tika .......$999");
        System.out.println(printSpaces()+"(2)**** Hot & Spice ........$800");
        System.out.println(printSpaces()+"(3)**** Chicken Fajita .....$900");
        System.out.println(printSpaces()+"(4)**** Fruit Pizza ........$700");
        System.out.print(printSpaces()+"Please select your choice ");
        String choiceInString= input.next();
        try {
            int choice=Integer.parseInt(choiceInString);
            switch (choice){
                case 1:{
                    itemType("Chicken Tika",999);
                }break;
                case 2:{
                    itemType("Hot & Spice",800);
                }break;
                case 3:{
                    itemType("Chicken Fajita",900);
                }break;
                case 4:{
                    itemType("Fruit Pizza",700);
                }break;
                default:{
                    System.out.println(printSpaces()+"Pleses select a number from a given range");
                }
            }
        }catch (NumberFormatException e){
            System.out.println(printSpaces()+"only caracters are allowed");
        }
    }
    public static void tea(){
        printHeader("TEA");
        System.out.println(printSpaces()+"(1)****GREEN TEA...$20");
        System.out.println(printSpaces()+"(2)****BLACK TEA...$25");
        System.out.println(printSpaces()+"(3)****LEMON TEA...$20");
        System.out.println(printSpaces()+"(4)****GINGER TEA...$20");
        System.out.print(printSpaces()+"Please select your choice ");
        String choiceInString= input.next();
        try {
            int choice=Integer.parseInt(choiceInString);
            switch (choice){
                case 1:{
                    itemType("GREEN Tea",22);
                }break;
                case 2:{
                    itemType("BLACK Tea",25);
                }break;
                case 3:{
                    itemType("LEMON Tea",25);
                }break;
                case 4:{
                    itemType("GINGER Tea",25);
                }break;
                default:{
                    System.out.println(printSpaces()+"Pleses select a number from a given range");
                }
            }
        }catch (NumberFormatException e){
            System.out.println(printSpaces()+"only caracters are allowed");
        }
    }
    public static void customer(){
        boolean condition =true;
        do {
            System.out.println("                           ***********************************CHATAGORY***********************************");

            System.out.println(printSpaces()+"1)....Cofee");
            System.out.println(printSpaces()+"2)....Tea");
            System.out.println(printSpaces()+"3)....Burgers");
            System.out.println(printSpaces()+"4)....Pizzas");
            System.out.println(printSpaces()+"5)....Shakes");
            System.out.println(printSpaces()+"6)....Break");
            //Choice from catagory
            System.out.print(printSpaces()+"Please select your choice ");
            String choiceInString= input.next();
            try {
                int choice=Integer.parseInt(choiceInString);
                switch (choice){
                    case 1:{
                        coffe();
                    }break;
                    case 2:{
                        tea();
                    }break;
                    case 3:{
                        burgers();
                    }break;
                    case 4:{
                        pizzas();
                    }break;
                    case 5:{

                    }break;
                    case 6:{
                        condition=false;
                    } break;
                    default:{
                        System.out.println(printSpaces()+"Pleses select a number from a given range");
                    }
                }
            }catch (NumberFormatException e){
                System.out.println(printSpaces()+"only caracters are allowed");
            }
        }while (condition);
    }

    public static void main(String[] args) {
        boolean condition =true;
        do {
            System.out.println(printSpaces()+"1)....CUSTOERS");
            System.out.println(printSpaces()+"2)....ADMIN");
            //Choice from catagory
            System.out.print(printSpaces()+"Please select your choice ");
            String choiceInString= input.next();
            try {
                int choice=Integer.parseInt(choiceInString);
                switch (choice){
                    case 1:{
                        customer();
                        condition=false;
                    }break;
                    case 2:{

                    }break;
                    default:{
                        System.out.println(printSpaces()+"Pleses select a number from a given range");
                    }
                }
            }catch (NumberFormatException e){
                System.out.println(printSpaces()+"only caracters are allowed");
            }
        }while (condition);
    }
    public static void printHeader(String str){
        Scanner input=new Scanner(System.in);
        System.out.println(printSpaces()+"********************************");
        System.out.println(printSpaces()+"************* "+str+" *************");
        System.out.println(printSpaces()+"********************************");
    }
    public static String printSpaces(){
        return "                                                      ";
    }
}