package com.example.project;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();
        //your code here

        //I used this website for the Math.round https://stackoverflow.com/questions/8825209/rounding-decimal-points
        double totalTip =  ((double) percent / 100.0) * cost;
        double bill = totalTip + cost;
        double costBefore = cost / (double) people;
        double tipPerson = totalTip / (double) people;
        double totalPerson = costBefore + tipPerson;
        
        totalTip = Math.round(totalTip * 100.0) / 100.0;
        bill = Math.round(bill * 100.0) / 100.0;
        costBefore = Math.round(costBefore * 100.0) / 100.0;
        tipPerson = Math.round(tipPerson * 100.0) / 100.0;
        totalPerson = Math.round(totalPerson * 100.0) / 100.0;
                       
        result.append("-------------------------------\n");
        result.append("Total bill before tip: " + "$" + cost + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%" + "\n");
        result.append("Total tip: " + "$" + totalTip + "\n");
        result.append("Total Bill with tip: " + "$" + bill + "\n");
        result.append("Per person cost before tip: " + "$" + costBefore + "\n");
        result.append("Tip per person: " + "$" + tipPerson + "\n");
        result.append("Total cost per person: " + "$" + totalPerson + "\n");
        result.append("-------------------------------\n");


        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) 
    {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 12; 
        int percent = 15;
        double cost = 566.97;     
        

       

        
        System.out.println(calculateTip(people,percent,cost));
    }
}
        
