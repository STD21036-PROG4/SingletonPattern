package singletonClass;
public final class ClassSingleton {

    private String description;
    private static ClassSingleton testOne;
    private ClassSingleton(){
        description = "test";
    }

    public static ClassSingleton getTestOne(){
        if(testOne == null ){
            testOne = new ClassSingleton();
        }
        return testOne;
    }
    public String getDescription(){
        return description;
    }
    public String setDescription(String desc){
        return description = desc;
    }
}
