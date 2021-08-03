package ua.lviv.logos;

public class MyException extends Exception{
	private String s;
	
	public MyException(String s) {
		super(s);
		this.s = s;
	}

	private String getS() {
		return s;
	}
	

}
