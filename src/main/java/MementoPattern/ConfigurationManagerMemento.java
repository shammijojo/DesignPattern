package MementoPattern;

public class ConfigurationManagerMemento {

    private int timeout;

    public ConfigurationManagerMemento(int timeout) {
        this.timeout = timeout;
    }

    public int getTimeout() {
        return timeout;
    }
}
