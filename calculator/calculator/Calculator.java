package calculator;

public abstract class Calculator implements Calc{
  
    public int add(int n1, int n2){
        return n1 + n2;
    }

    public int substract(int n1, int n2){
        return n1 - n2;
    }
}
