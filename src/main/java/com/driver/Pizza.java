package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    public boolean isDeluxe = false;
    private int extraCheese, extraToppings, takeAway;

    public void setDeluxe(boolean isDeluxe) {
        this.isDeluxe = isDeluxe;
    }

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here

        if(isVeg) price = 300;
        else price = 400;

    }
    public Pizza(Boolean isVeg,Boolean isDeluxe){
        this.isVeg = isVeg;
        // your code goes here

        if(isVeg) price = 300;
        else price = 400;

        if(isDeluxe){
            addExtraCheese();
            addExtraToppings();
        }
    }

    public int getPrice(){
        return price+extraCheese+extraToppings+takeAway;
    }

    public void addExtraCheese(){
        // your code goes here
        extraCheese = 80;
    }

    public void addExtraToppings(){
        // your code goes here
        if (isVeg) extraToppings = 70;
        else extraToppings = 120;
    }

    public void addTakeaway(){
        // your code goes here
        takeAway = 20;
    }

    public String getBill(){
        // your code goes here
        bill = "Base Price Of The Pizza: "+price+"\n";
        if(extraCheese!=0)
            bill += "Extra Cheese Added: "+extraCheese+"\n";
        if(extraToppings!=0)
            bill += "Extra Toppings Added: "+extraToppings+"\n";
        if(takeAway!=0)
            bill += "Paperbag Added: "+takeAway+"\n";
        bill += "Total Price: "+(price+extraCheese+extraToppings+takeAway)+"\n";
        return this.bill;
    }
}
