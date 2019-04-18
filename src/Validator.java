
public class Validator {
    private static final int PARAM_COUNT = 2;

    boolean isValid(String[] args) throws NumberFormatException, IllegalArgumentException{
        int len = args.length;

        return (isCorrectParamQuantity(len) && isIntegersAndBiggerThanZero(args, len));
    }

    private boolean isCorrectParamQuantity(int paramCount) throws IllegalArgumentException{

        if (!(paramCount == PARAM_COUNT))
            throw new IllegalArgumentException("Wrong quantity of Parameters!\nPlease enter 2 (TWO) parameters");
        return paramCount == PARAM_COUNT;
    }

    private boolean isIntegersAndBiggerThanZero(String[] args, int lenght) throws NumberFormatException, IllegalArgumentException{

        for (int i = 0; i < lenght; i++) {
            try {
                int param;
                if ((param = Integer.parseInt(args[i])) < 0)
                    throw new IllegalArgumentException("Wrong value of parameter [" + (i + 1) + "] : " + args[i]+
                            "\nPlease enter values not less than 1(ONE)");
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Wrong input format for parameter [" + (i + 1) + "] : " + args[i]+
                        "\nPlease enter only positive NUMBERS");
            }
        }
        return true;
    }
}
