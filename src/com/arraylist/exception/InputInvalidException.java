package com.arraylist.exception;
public class InputInvalidException extends Exception{
public InputInvalidException(String message){
super(message);
}
public InputInvalidException(String message,Throwable cause) {
	super(message,cause);
}

}