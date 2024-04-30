import java.util.LinkedList;
import java.util.Queue;

public class Controller {
    private Queue<Customer> nameOfQueue;

    public Controller() {
        // Inicializa a fila como LinkedList
        nameOfQueue = new LinkedList<>();
    }

    public void start() {
        // Adiciona alguns clientes à fila
        addCustomer(new Customer("John"));
        addCustomer(new Customer("Alice"));
        addCustomer(new Customer("Bob"));

        // Remove um cliente da fila
        removeCustomer();
    }

    public void addCustomer(Customer customer) {
        // Adiciona o cliente à fila
        nameOfQueue.add(customer);
        System.out.println("Customer " + customer.getName() + " added to the queue.");
    }

    public void removeCustomer() {
        // Remove o cliente da fila (primeiro da fila)
        Customer removedCustomer = nameOfQueue.remove();
        System.out.println("Customer " + removedCustomer.getName() + " removed from the queue.");
    }

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.start();
    }
}
