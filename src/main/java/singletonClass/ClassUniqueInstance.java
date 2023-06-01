package singletonClass;

public enum ClassUniqueInstance {
    INSTANCE(1);
    private Integer click ;
    private ClassUniqueInstance(Integer click){
        this.click = click;
    }
    public ClassUniqueInstance getInstance(){
        return INSTANCE;
    }

    public Integer getClick(){
        return click;
    }
    public Integer setClick(Integer nClick){
        return click = nClick;
    }
}
