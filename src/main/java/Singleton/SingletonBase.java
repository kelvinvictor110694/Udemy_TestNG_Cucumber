package Singleton;

public class SingletonBase {

    private static SingletonBase singleton;

    private SingletonBase(){

    }

    public static SingletonBase getSingletonInstance(){
         singleton = new SingletonBase();
        return singleton;
    }

    public void data(){
        System.out.println("Example for Singleton");
    }
}
