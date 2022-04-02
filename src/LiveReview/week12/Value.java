package LiveReview.week12;

public class Value {

    int param;
    boolean calledMethod = false;
    boolean calledConstructor= false;
    public Value(){} // no parameter
    public Value(int param){ // single parameter
        this.param=param;
    }
    public void setValue(int param){ // one parameter method and is void
        this.param=param;
        calledMethod =  true;
    }
    public boolean wasModified(){
        return calledMethod;
    }

    public int getValue() {
       /* if (this.calledMethod){
            return this.param;
        }else if (calledConstructor){
            return this.param;
        }else{
           return this.param;
        }*/
        return this.param;
    }


}
