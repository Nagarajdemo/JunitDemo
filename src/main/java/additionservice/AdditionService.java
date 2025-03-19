package additionservice;

public class AdditionService {
    public int additionCall(int x, int y){
        AdditionCalculation additionCalculation=new AdditionCalculation();
        return additionCalculation.additionCalculationLogic(x,y);

    }
}
