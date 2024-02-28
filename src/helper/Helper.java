package helper;

import java.util.ArrayList;
import java.util.List;

public class Helper{
	
	public static void checkNull(Object obj) throws InputInvalidException{
		if(obj == null){
			throw new InputInvalidException("Argument is null");
			}
		}
	public static <E> void checkIndex(List<E> myList,int index)throws InputInvalidException{
		checkNull(myList);
		if (index > myList.size()) {
			
			throw new InputInvalidException("Index value is greater than length of array list");
		}
	}
	public static <E> void checkTwoIndex(List<E> myList,int firstIndex,int lastIndex) throws InputInvalidException {
		checkIndex(myList,firstIndex);
		checkIndex(myList,lastIndex);
		if(firstIndex > lastIndex) {
			throw new InputInvalidException("Value of last index must be greater than first index");
		}
	}
  }
