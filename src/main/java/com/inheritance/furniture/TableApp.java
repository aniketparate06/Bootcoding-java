package com.inheritance.furniture;


public class TableApp {
    public static void main(String[] args) {
        DiningTable diningTable=new DiningTable();
        ComputerTable computerTable=new ComputerTable();
        diningTable.setLeg(6);
        diningTable.setColor("Golden");

        computerTable.setLeg(4);
        computerTable.setColor("Brown");

        System.out.println("Dining Table Leg: "+diningTable.getLeg());
        System.out.println("Dining Table Color: "+diningTable.getColor());

        System.out.println("Computer Table Leg: "+computerTable.getLeg());
        System.out.println("Computer Table Color: "+computerTable.getColor());
    }
}
