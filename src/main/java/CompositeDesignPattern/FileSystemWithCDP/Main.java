package CompositeDesignPattern.FileSystemWithCDP;

import CompositeDesignPattern.FileSystemWithoutCDP.Directory;
import CompositeDesignPattern.FileSystemWithoutCDP.File;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        CompositeDesignPattern.FileSystemWithoutCDP.File file = new CompositeDesignPattern.FileSystemWithoutCDP.File("Cloudy With a chance of meatballs");
        CompositeDesignPattern.FileSystemWithoutCDP.Directory action = new CompositeDesignPattern.FileSystemWithoutCDP.Directory("animation", Collections.singletonList(file));

        List<Object> files = new ArrayList<>();
        files.add(action);
        files.add(new File("Spy Kids"));

        CompositeDesignPattern.FileSystemWithoutCDP.Directory directory = new Directory("Movie", files);
        directory.ls();
    }
}
