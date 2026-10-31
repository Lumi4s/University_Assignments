package io.github.ChainOfResponsibility;

public class SecondLineSupport extends SupportHandler {
    @Override
    protected boolean canHandle(SupportRequest request) {
        return request.getComplexity() <= 4;
    }

    @Override
    protected void process(SupportRequest request) {
        System.out.println("Second line solved: " + request.getDescription());
    }
}
