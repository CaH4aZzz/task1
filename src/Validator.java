/**
 * Created by avokado on 11.04.2019.
 */
public class Validator {
    private final int PARAM_COUNT = 2;

    boolean isValid(String[] args) {
        boolean result = false;
        int len = args.length;

        if (isCorrectParamQuantity(len) && isIntegers(args, len)){
            result = true;
        }

        return result;
    }

    private boolean isCorrectParamQuantity(int lenght){

        if (lenght == PARAM_COUNT) {
            return  true;
        }else {
            System.out.println("Wrong quantity of Parameters!\nPlease enter 2 (TWO) parameters");
            return false;
        }
    }

    private boolean isIntegers(String[] args, int lenght){
        boolean result = true;

        for (int i = 0; i < lenght; i++) {
            try{
                Integer.parseInt(args[i]);
            }catch (NumberFormatException e){
                System.out.println("Wrong input format! Please enter NUMBERS");
                return false;
            }
        }

        return result;
    }
}
