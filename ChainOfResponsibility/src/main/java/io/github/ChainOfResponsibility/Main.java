package io.github.ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        SupportHandler firstLine = new FirstLineSupport();
        SupportHandler secondLine = new SecondLineSupport();
        SupportHandler manager = new ManagerSupport();

        firstLine.setNext(secondLine).setNext(manager);

        firstLine.handle(new SupportRequest("Password reset", 1));
        firstLine.handle(new SupportRequest("Database error", 3));
        firstLine.handle(new SupportRequest("Server failure", 7));
        firstLine.handle(new SupportRequest("Unknown critical issue", 11));
    }
}
