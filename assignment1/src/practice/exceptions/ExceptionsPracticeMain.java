package practice.exceptions;

public class ExceptionsPracticeMain {
	public static void main(String[] args) {
		DivisionByZeroHandler.main(args);
        ArrayIndexHandler.main(args);
        InvalidStringHandler.main(args);
        InvalidAgeHandler.main(args);
        FileNotFoundHandler.main(args);
        NestedExceptionHandler.main(args);
        MultipleExceptionsHandler.main(args);
        IOExceptionHandler.main(args);
        IllegalArgumentHandler.main(args);
        
        try {
        	ChainedExceptionsHandler.main(args);
        } catch (InvalidInputException e) {
        	System.out.println("Unlocked InvalidInputException!");
        	e.printStackTrace();
        }
	}
}
