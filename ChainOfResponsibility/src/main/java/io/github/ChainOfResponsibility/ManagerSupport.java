package io.github.ChainOfResponsibility;

public class ManagerSupport extends SupportHandler {
    @Override
    protected boolean canHandle(SupportRequest request) {
        return request.getComplexity() <= 10;
    }

    @Override
    protected void process(SupportRequest request) {
        System.out.println("Manager solved: " + request.getDescription());
    }
}
