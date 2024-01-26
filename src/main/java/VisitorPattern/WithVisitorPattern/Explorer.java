package VisitorPattern.WithVisitorPattern;

public interface Explorer {
    void visit(Mercury mercury);
    void visit(Earth earth);

    default void visit(Planet planet) {
        System.out.println("Cannot explore");
    }
}
