package com.example.project;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();
        //your code here

        //I used this website for the Math.round https://stackoverflow.com/questions/8825209/rounding-decimal-points
        double totalTip =  ((double) percent / 100.0) * cost;
        totalTip = Math.round(totalTip * 100.0) / 100.0;
        double bill = totalTip + cost;
        bill = Math.round(bill * 100.0) / 100.0;
        double costBefore = cost / (double) people;
        costBefore = Math.round(costBefore * 100.0) / 100.0;
        double tipPerson = totalTip / (double) people;
        tipPerson = Math.round(tipPerson * 100.0) / 100.0;
        double totalPerson = costBefore + tipPerson;
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
        int people = 2; 
        int percent = 5;
        double cost = 29.56;     
        

       

        
        System.out.println(calculateTip(people,percent,cost));
    }
}
        
