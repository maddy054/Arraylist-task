package tester;
import arraylist.ArrayListTask;
import helper.InputInvalidException;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Iterator;
import java.util.List;

public class ArrayListTester {
	public static void main(String[] args) {
		Logger logger = Logger.getLogger(ArrayListTester.class.getName());
		ArrayListTask alTask = new ArrayListTask();
		Scanner alScanner = new Scanner(System.in);
		Scanner intScanner = new Scanner(System.in);
		logger.log(Level.INFO,"1. create a empty array list and print the length \n 2.create an array list and add strings from commend line "
				+ "\n 3. craete a array list and add 5 integer from commend line \n 4.Create array list and add custom object \n 5. create an "
				+ "arraylist and add integer,string,object \n 6. create a arraylist and adding strings to list and find the index of the req string "
				+ "\n 7.create a arraylist and adding strings to list and print the each element using iterator \n 8.create a arraylist and adding strings "
				+ "to list and find the string at required index \n 9.create a arraylist and adding strings to list and find the first and last index of"
				+ " particular string \n 10. create a arraylist and adding strings to list and add a string at specific index \n 11. Create array list and "
				+ "add strings to it and cerate a new arraylist from existing arraylist \n 12. Create two array list and form third array list from these"
				+ " two array list \n 13.Create two array list and form third array list from these two array list but second array list come first \n "
				+ "14. Create array list and add decimal values and remove a value at particular location \n 15. create two array list with strings amd delete "
				+ "the elements of first which are in the second");
		int select = 0;
		int noOfString =0;
		try {
		
		do {
			List<Object> myArray = alTask.getArrayList();
			List<String> stringArrayList = alTask.getArrayList();
			List<String> secondArrayList = alTask.getArrayList();
		
		
		logger.log(Level.INFO,"Choose any one ");
		
		select = intScanner.nextInt();
	    
		if(select == 2 || (select >= 6 && select <= 13) || select == 15 || select == 16 || select == 18) {
			logger.log(Level.INFO, "Enter the number of String you want to add ");
	 	    noOfString = intScanner.nextInt();
	 	    
			for(int i=0;i<noOfString;i++) {
				logger.log(Level.INFO,"enter the string "+(i+1));
				
				String stringValue = alScanner.nextLine();
			    alTask.addValue(stringArrayList,stringValue);
			}
		}
		
	
		
		switch (select){
		
		case 1:
			logger.log(Level.INFO,"The array list after joining strings is "+myArray);
			logger.log(Level.INFO,"The length of array list after joining strings is "+alTask.getLength(null)); 
		break;
		
		case 2:
			
			logger.log(Level.INFO,"The array list after joining strings is "+stringArrayList);
			logger.log(Level.INFO,"The length of array list after joining strings is "+alTask.getLength(stringArrayList));

		break;
			
	    case 3:
	    	logger.log(Level.INFO,"Enter the number of integer you want to add ");
	    	int noOfInt = intScanner.nextInt();

			for(int i=0;i<noOfInt;i++) {
				System.out.println("enter the integer "+(i+1));
				
				int intValue = intScanner.nextInt();
				alTask.addValue(myArray,intValue);
			}
			logger.log(Level.INFO,"The array list after joining strings is "+myArray);
			logger.log(Level.INFO,"The length of array list after joining strings is "+alTask.getLength(myArray));
		break;
		
	    case 4:
	    	TesterObject myTest = new TesterObject();
	    	CustomObject myCustomObj = new CustomObject();
	    	
	    	alTask.addValue(myArray,myTest);
	    	alTask.addValue(myArray,myCustomObj);
	    	logger.log(Level.INFO, "The array list after joining strings is "+myArray);
	    	
			logger.log(Level.INFO,"The length of array list after joining strings is "+alTask.getLength(myArray));
		break;
		
	    case 5:
	    	logger.log(Level.INFO,"Enter the number of integer you want to add ");
	        noOfInt = intScanner.nextInt();
	    	for(int i=0;i<noOfInt;i++) {
	    		System.out.println("Enter the value "+(i+1));
	    		alTask.addValue(myArray,alScanner.nextLine());
	    	}
	    	
	    	logger.log(Level.INFO,"Enter the number of String you want to add ");
	        noOfString = intScanner.nextInt();
	    	for(int i=0;i<noOfString;i++) {
	    		System.out.println("Enter the value "+(i+1));
	    		alTask.addValue(myArray,alScanner.nextLine());
	    	}
	    	
	    	TesterObject myTester = new TesterObject();
	    	CustomObject myCustomObject = new CustomObject();
	    	
	    	myTester.setNumber(21);
	    	myCustomObject.setName("maddy");
	    	
	    	alTask.addValue(myArray,myTester);
	    	alTask.addValue(myArray,myCustomObject);
	    	
	    	logger.log(Level.INFO,"The array list after joining strings is "+myArray);
	    	
	    	
	    break;
	    
	    case 6:
	    	logger.log(Level.INFO,"Enter the string which index is need to find ");
	    	String stringToFind  = alScanner.nextLine();
	    	int reqIndex = alTask.getIndex(stringArrayList,stringToFind);
	    	logger.log(Level.INFO,"The index of the String "+stringToFind+" in the array is "+reqIndex);
	    	
	    	logger.log(Level.INFO,"The array list after joining strings is "+stringArrayList);
	    	logger.log(Level.INFO,"The length of array list after joining strings is "+alTask.getLength(stringArrayList));
	    break;
	    	
	    case 7:
	 	  
	    	Iterator<String> iterate = stringArrayList.iterator();
	    	for(int i=0;i<noOfString;i++) {
	    		System.out.println(iterate.next());
	    	}
	    	
	    break;
	    
	    case 8:
	  
	    	logger.log(Level.INFO,"Enter the index of the string" );
	 	    int indexReq = intScanner.nextInt();
	 	    String valueAtIndex = alTask.getValue(stringArrayList, indexReq);
	 	    logger.log(Level.INFO,"Value at the index "+indexReq+" is "+valueAtIndex);
	 	    logger.log(Level.INFO,"The array list after joining strings is "+stringArrayList);
	 	    logger.log(Level.INFO,"The length of array list after joining strings is "+alTask.getLength(stringArrayList));
		break;
		
	    case 9:
	    	
	    	logger.log(Level.INFO,"Enter the string which index is need to find ");
	    	stringToFind  = alScanner.nextLine();
	    	
	    	int firstInd = alTask.getIndex(stringArrayList,stringToFind);
	    	int lastIndex = alTask.getLastIndex(stringArrayList,stringToFind);
	    	
	    	logger.log(Level.INFO,"The first index of "+stringToFind+" is "+firstInd+" and the last index is "+lastIndex);
	    break;
	    
	    case 10:
	    
	    	logger.log(Level.INFO,"Enter the index you want to add the string ");
	        int indexOfStr = intScanner.nextInt();
	        logger.log(Level.INFO,"Enter the string ");
	        String strToAdd = alScanner.nextLine();
	        
	        alTask.addAtIndex(stringArrayList,indexOfStr,strToAdd);
	        
	        System.out.println("The array list after joining strings is "+stringArrayList);
			System.out.println("The length of array list after joining strings is "+alTask.getLength(stringArrayList));
	    break;
	    
	    case 11:
	    	logger.log(Level.INFO,"Enter the starting index ");
	    	int startIndex = intScanner.nextInt();
	    	System.out.println("Enter the ending index ");
	    	int endIndex = intScanner.nextInt();
	    	List<String> myList = alTask.getSubList(stringArrayList, startIndex, endIndex);
	    	logger.log(Level.INFO,"The array list after joining strings is "+myList);
			
	    break;
	    
	    case 12:
	    	
	    	logger.log(Level.INFO,"Enter the number of extra String you want to add in second list ");
			int extraString = intScanner.nextInt();
			for(int i=0;i<noOfString+extraString;i++) {
				System.out.println("enter the string "+(i+1));
				
				String stringValue = alScanner.nextLine();
			    alTask.addValue(secondArrayList ,stringValue);
			    
			}
		    alTask.addArrayList(stringArrayList, secondArrayList);	
		    logger.log(Level.INFO,"The array list after joining strings is "+stringArrayList);
		    logger.log(Level.INFO,"The length of array list after joining strings is "+alTask.getLength(stringArrayList));
		    
		break;
		
	    case 13:
	    	logger.log(Level.INFO,"Enter the number of extra String you want to add in second list ");
			extraString = intScanner.nextInt();
			for(int i=0;i<noOfString+extraString;i++) {
				logger.log(Level.INFO,"enter the string "+(i+1));
				
				String stringValue = alScanner.nextLine();
			    alTask.addValue(secondArrayList ,stringValue);
			    
			}
		
			logger.log(Level.INFO,"Enter the starting index ");
	    	int addIndex = intScanner.nextInt();
	    	alTask.addArrayListAtIndex(stringArrayList, secondArrayList,addIndex);
	    	logger.log(Level.INFO,"The array list after joining strings is "+stringArrayList);
	    	logger.log(Level.INFO,"The length of array list after joining strings is "+alTask.getLength(stringArrayList));
	    case 14:
	    	List<Double> myDecimalArray = alTask.getArrayList();
	    	System.out.println("Enter the number of decimal you want to add ");
	    	int noOfDecimal = intScanner.nextInt();

			for(int i=0;i<noOfDecimal;i++) {
				System.out.println("enter the decimal "+(i+1));
				
				double doubleValue = intScanner.nextInt();
				alTask.addValue(myDecimalArray,doubleValue);
			}
			
			logger.log(Level.INFO,"Enter the index of the decimal you want to delete" );
		 	 indexReq = intScanner.nextInt();
		 	 alTask.deleteAtIndex(myDecimalArray,indexReq);
		 	 
		 	logger.log(Level.INFO,"The array list after joining strings is "+myDecimalArray);
		 	logger.log(Level.INFO,"The length of array list after joining strings is "+alTask.getLength(myDecimalArray));
	    	break;
	    	
	    case 15:
	    	System.out.println("Enter the number of String you want to add in second list ");
			int reqString = intScanner.nextInt();
			for(int i=0;i<reqString ;i++) {
				logger.log(Level.INFO,"Enter the string "+(i+1));
				
				String stringValue = alScanner.nextLine();
			    alTask.addValue(secondArrayList ,stringValue);
			    
			}
		    alTask.removeElements(stringArrayList, secondArrayList);	
		    logger.log(Level.INFO,"The array list after removing second array list elements from first is "+stringArrayList);
		    logger.log(Level.INFO,"The length of array list is "+alTask.getLength(stringArrayList));
		break;
		
	    case 16:
	    	logger.log(Level.INFO,"Enter the number of String you want to add in second list ");
			reqString = intScanner.nextInt();
			for(int i=0;i<reqString ;i++) {
				logger.log(Level.INFO,"Enter the string "+(i+1));
				
				String stringValue = alScanner.nextLine();
			    alTask.addValue(secondArrayList ,stringValue);
			    
			}
		    alTask.removeExcept(stringArrayList, secondArrayList);	
		    logger.log(Level.INFO,"The array list after removing second array list elements from first is "+stringArrayList);
		    logger.log(Level.INFO,"The length of array list is "+alTask.getLength(stringArrayList));
	    break;
	    
	    case 17:
	    	List<Long> longArrayList = alTask.getArrayList();
	    	
	    	logger.log(Level.INFO,"Enter the number of values you want to add in the array list ");
			int reqLong = intScanner.nextInt();
			for(int i=0;i<reqLong ;i++) {
				System.out.println("Enter the value "+(i+1));
				
				Long longValue = alScanner.nextLong();
			    alTask.addValue(longArrayList ,longValue);
			}
			alTask.removeAllElements(longArrayList);
			logger.log(Level.INFO,"The length of array list after removing all the elements is "+alTask.getLength(longArrayList));
			
	    case 18:
	    	logger.log(Level.INFO,"Enter the string to check ");
			
			stringToFind = alScanner.nextLine();
			
			alTask.checkContains(stringArrayList, stringToFind);
			
		break;
	    
	      }
		 }while(select !=0);
		 }catch(InputInvalidException ie) {
			 logger.log(Level.SEVERE,ie.getMessage());
			StackTraceElement[] element = ie.getStackTrace();
			for(StackTraceElement value:element) {
				logger.log(Level.SEVERE, value.toString());
			}
			
	   }catch(ReflectiveOperationException e) {
		   logger.log(Level.SEVERE,e.getMessage());
	   }
	
   }
	
 }


