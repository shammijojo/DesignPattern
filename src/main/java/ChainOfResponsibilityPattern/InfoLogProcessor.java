package ChainOfResponsibilityPattern;

public class InfoLogProcessor extends LogProcessor{


    public InfoLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(String level, String message) {
        if(level.equals(LogLevel.INFO.toString())) {
            System.out.println("INFO: "+message);
        } else {
            super.log(level, message);
        }
    }
}
