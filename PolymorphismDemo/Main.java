package PolymorphismDemo;

public class Main {
    public static void main(String[] args) {

        // BaseLogger[] loggers = new BaseLogger[] { new FileLogger(), new
        // EmailLogger(), new DatabaseLogger(),
        // new BaseLogger(),new ConsoleLogger() };

        // for (BaseLogger logger : loggers) {
        // logger.log("Test Mesajı...");
        // }

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();
    }

}
