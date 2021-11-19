package org.infinite.tap;

import org.infinite.tap.domain.Customer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // 1. Refactor with Streams
        List<Customer> secondTierCustomer = new ArrayList<>();
        Iterator<Customer> iterator = Customer.getAll().iterator();
        while (iterator.hasNext()) {
            Customer customer = iterator.next();
            if (customer.getTier() == 2) {
                secondTierCustomer.add(customer);
            }
        }

        // 2. Find all canceled orders
        // List<Order> canceledOrders = ...

        // 3. Find all pending orders created on Monday
        // List<Order> pendingOrders = ...

        // 4. Find the names of all tier 1 customers
        // List<String> tier1Names = ...

        // 5. Find the sum of all TOYS products prices
        // double toysSum = ...

        // 6. Find how many clothes have been ordered
        // long countClothes = ...

        // 7. Find if we have a tier 3 customer named "George"
        // boolean hasGeorge = ...

        // 8. Find if all orders from September are delivered
        // boolean areAllDelivered = ...

        // 9. Find the category of the max priced product that have ever been ordered
        // Category category = ...

        // 10. Sum the prices in each category of products
        // Map<Category, Double> pricesSum = ...

        // 11. Count all the products with map and reduce operations only
        // Integer productCount = ...

        // 12. For given number n generate a list of square of each number in [1..n]

        // 13. Generate 10 random numbers

        // 14. Find all orders containing any electronics
        // List<Order> ordersWithElectronics = ...

        // 15. Implement a collector that concatenates String - StringJoiner implements Collector
        // String names = Customer.getAll().collect(new StringJoiner());

    }
}
