package ChainOfResponsibilityPattern;

public class DebugLogProcessor extends LogProcessor{
    public DebugLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(String level, String message) {
        if(level.equals(LogLevel.DEBUG.toString())) {
            System.out.println("DEBUG: "+message);
        } else {
            super.log(level, message);
        }
    }
}
