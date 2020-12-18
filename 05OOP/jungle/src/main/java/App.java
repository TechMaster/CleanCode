import java.util.ArrayList;
import java.util.List;

import annotation.Zoo;
import encapsulation.after.Address;
import encapsulation.after.Person;
import family.Family;
import forest.Jungle;
import forest.PetHouse;
import generic.GenericSort;
import graphiceditor.before.GraphicsEditor;
import orderbefore.Order;
import orderbefore.OrderItem;
import university.University;

public class App {
    static void testOrderBefore() {
        List<OrderItem> orderItems = new ArrayList<>();
        orderItems.add(new OrderItem("Logitech Mouse", 24, 1));
        orderItems.add(new OrderItem("Dell 23 Monitor", 240, 1));
        orderItems.add(new OrderItem("Kingston RAM DDR4 16G", 25, 4));

        String shipToCountry = "EU";
        Order myOrder = new Order(orderItems, shipToCountry);
        System.out.println("Total cost if ship to " + shipToCountry + " = " + myOrder.getOrderTotal());
    }

    public static void main(String[] args) {
        /*
         * Jungle jungle = new Jungle(); jungle.animateAnimalWorld();
         * 
         * PetHouse pethouse = new PetHouse(); pethouse.allMakeSound();
         * 
         * University uni = new University(); uni.teach(); testOrderBefore();
         * 
         * Family family = new Family(); family.test();
         * 
         * GenericSort.demoSort();
         * 
         * Zoo.listAnnotationParams();
         * 
         * Zoo.listTableAnnotationParams();
         * 
         * GraphicsEditor ge = new GraphicsEditor(); try { ge.openFile("girl.bmp"); }
         * catch (Exception e) { e.printStackTrace(); }
         */
        
        try {
            Person person;
            Address address = new Address("JK", "Hanoi", "48 Tố Hữu", "Viwaseen");
            person = new Person("Cường", "Trịnh", "cuong#techmaster.vn",
                    address);
            System.out.println(person.getFullName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
