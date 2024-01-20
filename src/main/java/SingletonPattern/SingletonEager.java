package SingletonPattern;

public class SingletonEager {

    //Private Constructor
    private SingletonEager(){}

    //private static object which cannot be accessed directly outside class
    private static SingletonEager object=new SingletonEager();

    //method to be called by other classes to get the object
    public static SingletonEager getInstance(){
        return object;
    }

    public void printMessage(String msg){
        System.out.println(msg);
    }
}

/**
 Used in logging,caching rtc
 */
