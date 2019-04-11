
public class Validator {
    private final int PARAM_COUNT = 2;

    boolean isValid(String[] args) {
        boolean result = false;
        int len = args.length;

        if (isCorrectParamQuantity(len) && isIntegers(args, len) && isParamsBiggerThanOne(args, len)) {
            result = true;
        }

        return result;
    }

    private boolean isCorrectParamQuantity(int lenght) {

        if (lenght == PARAM_COUNT) {
            return true;
        } else {
            System.out.println("Wrong quantity of Parameters!\nPlease enter 2 (TWO) parameters");
            return false;
        }
    }

    private boolean isIntegers(String[] args, int lenght) {
        boolean result = true;

        for (int i = 0; i < lenght; i++) {
            try {
                Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("Wrong input format! Please enter NUMBERS");
                return false;
            }
        }

        return result;
    }

    private boolean isParamsBiggerThanOne(String[] args, int lenght) {
        boolean result = true;

        for (int i = 0; i < lenght; i++) {
            if (Integer.parseInt(args[i]) < 1) {
                System.out.println("Wrong value of parameter [" + i + "]\nPlease enter values not less than 1(ONE)");
                result = false;
            }
        }
        return result;
    }
}
