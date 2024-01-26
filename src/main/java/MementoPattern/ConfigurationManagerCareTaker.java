package MementoPattern;

import com.sun.istack.internal.Nullable;

import java.util.ArrayList;
import java.util.List;

public class ConfigurationManagerCareTaker {

    List<ConfigurationManagerMemento> history;

    public ConfigurationManagerCareTaker() {
        history = new ArrayList<>();
    }

    public void add(ConfigurationManagerMemento memento) {
        history.add(memento);
    }

    @Nullable
    public ConfigurationManagerMemento undo() {
        if(history.size()>0) {
            ConfigurationManagerMemento memento = history.get(history.size()-1);
            history.remove(history.size()-1);
            return memento;
        }
        return null;
    }


}
