package io.github.ChainOfResponsibility;

public class SupportRequest {
    private final String description;
    private final int complexity;

    public SupportRequest(String description, int complexity) {
        if (complexity < 1) {
            throw new IllegalArgumentException("Complexity must be positive");
        }
        this.description = description;
        this.complexity = complexity;
    }

    public String getDescription() {
        return description;
    }

    public int getComplexity() {
        return complexity;
    }
}
