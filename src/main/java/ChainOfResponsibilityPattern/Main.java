package ChainOfResponsibilityPattern;

public class Main {

    public static void main(String[] args) {
        ErrorLogProcessor errorLogProcessor = new ErrorLogProcessor(null);
        InfoLogProcessor infoLogProcessor  = new InfoLogProcessor(errorLogProcessor);
        LogProcessor logProcessor = new DebugLogProcessor(infoLogProcessor);

        logProcessor.log("INFO","info message");

        logProcessor.log("DEBUG","debug message");

        logProcessor.log("ERROR","error message");

    }

}
