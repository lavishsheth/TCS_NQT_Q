import java.util.Scanner;
class TCS32{
    public static void main(String args[]){
        String[] mainMenu = {"Coffee", "Tea", "Soups", "Beverages"};

        // Define the sub-menu for each main menu item
        String[][] subMenu = {
                {"Espresso Coffee", "Cappuccino Coffee", "Latte Coffee"},
                {"Plain Tea", "Assam Tea", "Ginger Tea", "Cardamom Tea", "Masala Tea", "Lemon Tea", "Green Tea", "Organic Darjeeling Tea"},
                {"Hot and Sour Soup", "Veg Corn Soup", "Tomato Soup", "Spicy Tomato Soup"},
                {"Hot Chocolate Drink", "Badam Drink", "Badam-Pista Drink"}
        };

        
               // Prompt the user to select a main menu item
               System.out.println("Enter the first letter to select main menu:");
               System.out.println("c - Coffee\n" +
                                  "t - Tea\n" +
                                  "s - Soups\n" +
                                  "b - Beverages");

            
                Scanner sc =  new Scanner(System.in);
                char MainMenuselection=sc.next().toLowerCase().charAt(0);


                int MainMenuIndex=0;
                switch(MainMenuselection){
                    case 'c':
                    MainMenuIndex=0;
                    break;

                    case 't':
                    MainMenuIndex=1;
                    break;

                    case 's':
                    MainMenuIndex=2;
                    break;

                    case 'b':
                    MainMenuIndex=3;
                    break;

                    default:
                    System.out.println("INVALID INPUT"); 
                    return;
                }

                 // Prompt the user to select a sub-menu item
        System.out.println("Enter the sub-menu item number:");

        for(int i=0;i<subMenu[MainMenuIndex].length;i++){
            int subMenuSelection = sc.nextInt();

            // Display the selected sub-menu item
            System.out.println("Welcome to CCD!\n" +
                               "Enjoy your " + subMenu[MainMenuIndex][subMenuSelection-1] + "!");
        }
    }

    }