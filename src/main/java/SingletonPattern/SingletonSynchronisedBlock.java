package SingletonPattern;

public class SingletonSynchronisedBlock {

    private static SingletonSynchronisedBlock object;

    public static SingletonSynchronisedBlock getInstance(){
        if(object==null) {
            synchronized (SingletonSynchronisedBlock.class) {
                //Second thread waiting confirms if object was created by first thread
                if (object == null) {
                    object = new SingletonSynchronisedBlock();
                }
            }
        }
        return object;
    }

    public void getObjectRef(){
        System.out.println(object);
    }
}
