public class CompleteCalc extends Calculator{

    public int divide(int n1, int n2){
        return n1 / n2;
    }

     public int times(int n1, int n2){
        if(n2 != 0){
            return n1 * n2;
        }
        return ERROR;
    }
}
