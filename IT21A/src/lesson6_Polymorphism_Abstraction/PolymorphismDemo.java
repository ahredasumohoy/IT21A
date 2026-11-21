
package lesson6_polymorphism_abstraction;


class Notification {

    public void sendNotification() {
        System.out.println("Sending a general notification...");
    }
}


class EmailNotification extends Notification {

    @Override
    public void sendNotification() {
        System.out.println("Sending an email notification to the customer.");
    }
}


class SMSNotification extends Notification {

    @Override
    public void sendNotification() {
        System.out.println("Sending an SMS notification to the customer.");
    }
}


public class PolymorphismDemo {

    public static void main(String[] args) {

        Notification notification;

        notification = new EmailNotification();
        notification.sendNotification();

        notification = new SMSNotification();
        notification.sendNotification();
    }
}
