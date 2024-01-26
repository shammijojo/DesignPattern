package MementoPattern;

public class ConfigurationManagerOriginator {

    int timeout;

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public ConfigurationManagerMemento saveToMemento() {
        return new ConfigurationManagerMemento(this.timeout);
    }

    public void restoreFromMemento(ConfigurationManagerMemento memento) {
        this.timeout = memento.getTimeout();
    }


}
