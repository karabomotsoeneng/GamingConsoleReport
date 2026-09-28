

package com.mycompany.gamingconsolereport;

/**
 *
 * @author Karabo
 */
public class GamingConsoleReport {

    public static void main(String[] args) {
       // 1D Array for city names 
       String[] City = {"CapeTown", "Port Elizabeth", "Pretoria"};
       //Array 2D number 1 electronics franchise for three different cities.
       int[][] electronicsFranchise = {
           {1000,2000,3000}, //CapeTown
           {2000,3000,4000}, // Port Elizabeth  
           {1500,1100,1200}, // Pretoria 
    };  
       // 1. print the gaming console report section 
       System.out.println("------------------------------------------------------------");
       System.out.println("Gaming Console Report");
       System.out.println("-------------------------------------------------------------");
       System.out.printf("%-15s%-15s%-15s%-15s%n","", "PS5", "XBOX", "SWITCH");
       // LOOP TO DISPLAY TABLE DATA 
       for (int i = 0; i < City.length; i++){
           System.out.printf("%-15s%-15d%-15d%-15d%n", City[i], electronicsFranchise[i][0], electronicsFranchise[i][1], electronicsFranchise[i][2]);
           
       }
       System.out.println();
       // 2. print the console sales totals for each city 
       System.out.println("---------------------------------------------------------------");
       System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
       System.out.println("---------------------------------------------------------------");
        
       // loop to calculate fordisplaying totals 
       for (int i = 0; i < City.length; i++){
           int cityTotal = electronicsFranchise[i][0] +  electronicsFranchise[i][1] + electronicsFranchise[i][2];
           
           // display the city with the most sales 
           String CITY = (cityTotal >= 6000)?"CITY WITH THE MOST SALES" : "";
           System.out.printf("%-15s%-15d%s%n", City[i], cityTotal,CITY );
           
    }
}
}

