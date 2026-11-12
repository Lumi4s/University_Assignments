package io.github.ChainOfResponsibility;

public abstract class SupportHandler {
    private SupportHandler next;

    public SupportHandler setNext(SupportHandler next) {
        this.next = next;
        return next;
    }

    public void handle(SupportRequest request) {
        if (canHandle(request)) {
            process(request);
        } else if (next != null) {
            next.handle(request);
        } else {
            System.out.println("No handler available: " + request.getDescription());
        }
    }

    protected abstract boolean canHandle(SupportRequest request);

    protected abstract void process(SupportRequest request);
}
