package ChainOfResponsibilityPattern;

public abstract class LogProcessor {

    LogProcessor nextLogProcessor;

    public LogProcessor(LogProcessor nextLogProcessor) {
        this.nextLogProcessor = nextLogProcessor;
    }


    public void log(String level, String message) {
        if(this.nextLogProcessor != null) {
            nextLogProcessor.log(level, message);
        }
    }




}
