package ChainOfResponsibilityPattern;

public class ErrorLogProcessor extends LogProcessor {
    public ErrorLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(String level, String message) {
        if(level.equals(LogLevel.ERROR.toString())) {
            System.out.println("ERROR: "+message);
        } else {
            super.log(level, message);
        }
    }
}
