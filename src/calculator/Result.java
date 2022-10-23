package calculator;

public class Result {
	private double value;
	private boolean valid;
	private String message;
	
	
	
	public Result() {
		super();
	}

	public Result(String message) {
		super();
		this.message = message;
		this.valid = false;
	}
	
	public Result(Result copy) {
		super();
		this.value = copy.getValue();
		this.valid = copy.isValid();
		this.message = copy.getMessage();
	}

	public Result(double value) {
		super();
		this.value = value;
		this.valid = true;
		this.message = "";
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return isValid() ? ("" + value) :  getMessage();
	}
	

}
