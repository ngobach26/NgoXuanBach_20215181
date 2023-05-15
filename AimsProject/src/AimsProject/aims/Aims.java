package AimsProject.aims;

import AimsProject.cart.Cart;
import AimsProject.disc.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();

        // DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        // anOrder.addDigitalVideoDisc(dvd1);

        // DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        // anOrder.addDigitalVideoDisc(dvd2);

        // DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        // anOrder.addDigitalVideoDisc(dvd3);

        // System.out.println("Total Cost is:");
        // System.out.println(anOrder.totalCost());

        // System.out.println();
        // System.out.println("Before remove!!");
        // anOrder.displayCart();

        // anOrder.removeDigitalVideoDisc(dvd3);

        // System.out.println();
        // System.out.println("After remove!!");
        // anOrder.displayCart();

        //////////////////////////////////////////
        // DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        

        // DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        
        // DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);

        // anOrder.addDigitalVideoDisc(dvd1, dvd2, dvd3);

        // System.out.println("Total Cost is:");
        // System.out.println(anOrder.totalCost());

        // System.out.println();
        // System.out.println("Before remove!!");
        // anOrder.displayCart();

        // anOrder.removeDigitalVideoDisc(dvd3);

        // System.out.println();
        // System.out.println("After remove!!");
        // anOrder.displayCart();

        /////////////////////////////////////////////////
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        System.out.println(dvd3.getId());
        anOrder.addDigitalVideoDisc(dvd1, dvd2,dvd3);
        
        // System.out.println("Total Cost is:");
        // System.out.println(anOrder.totalCost());

        System.out.println();
        System.out.println("Before remove!!");
        anOrder.displayCart();

        // anOrder.removeDigitalVideoDisc(dvd1);

        // System.out.println();
        // System.out.println("After remove!!");
        // anOrder.displayCart();
        System.out.println(dvd1.nbDigitalVideoDiscs);

        System.out.println();

        int id =3;
        // Integer i = 3;
        Integer j = Integer.valueOf(id);
        // System.out.println(j.equals(i));
        for(Integer i = 0;i < 4;i++){
            System.out.println(j.equals(i));
        }
        
    }
}
