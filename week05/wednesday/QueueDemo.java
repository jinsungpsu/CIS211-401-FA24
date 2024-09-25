import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class QueueDemo {
    public static void main(String[] args) {
        Queue<Order> driveThruOrders = new LinkedList<>();

        /*
        add will give exception
        offer will give true/false
         */
        if (!driveThruOrders.offer(new Order(1, new String[]{"French Fries", "Burger"}))){
            System.out.println("OOps can't take that order... kitchen is too busy");
        }

        if (!driveThruOrders.offer(new Order(2, new String[]{"Ice cream", "shake"}))){
            System.out.println("OOps can't take that order... kitchen is too busy");
        }

        System.out.println(driveThruOrders);

        while(!driveThruOrders.isEmpty()) {
            Order orderBeingServed = driveThruOrders.poll();
            /*
            poll or peek will give null
            element will give an exception
             */
            if (orderBeingServed != null) {
                System.out.println("Customer is being served order: " + orderBeingServed);
            } else {
                System.out.println("There were no orders....");
            }
        }

    }
}

class Order {
    private int orderNumber;
    private String[] foodItems;

    public Order(int orderNumber, String[] foodItems) {
        this.orderNumber = orderNumber;
        this.foodItems = foodItems;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String[] getFoodItems() {
        return foodItems;
    }

    public void setFoodItems(String[] foodItems) {
        this.foodItems = foodItems;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", foodItems=" + Arrays.toString(foodItems) +
                '}';
    }
}
