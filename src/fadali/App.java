package fadali;

public class App {
    public static void main(String[] args) throws Exception {

        SavingAccount x = new SavingAccount("100", 1000, 1.500);

        Account from = new Account("from", 10000);
        Account to = new Account("to", 10000);

        System.out.println("from:" + from.getBalance());
        System.out.println("to:" + to.getBalance());

        System.out.println(x.addInterest());

        BankOperations a = new BankOperations(from, to);
        a.transfer(555);
        System.out.println("a:" + a);
        System.out.println("a from:" + from.getBalance());
        System.out.println("a to:" + to.getBalance());

        /* Association, Aggregation, Composition */
        Department dept = new Department(165465, "CS"); // Aggregation
        Employee employee = new Employee(6868, 940.0f, "mostafa", "soliman", "fadali", "B-", "94867-894", "EG", "1992",
                dept);

        System.out.println(employee);

    }
}

/**
 * AccountOperations
 */
