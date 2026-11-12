package io.github.ChainOfResponsibility;

public class FirstLineSupport extends SupportHandler {
    @Override
    protected boolean canHandle(SupportRequest request) {
        return request.getComplexity() <= 2;
    }

    @Override
    protected void process(SupportRequest request) {
        System.out.println("First line solved: " + request.getDescription());
    }
}
