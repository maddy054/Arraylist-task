package com.arraylist.logics;
//import java.util.ArrayList;
import java.util.List;

import com.arraylist.exception.InputInvalidException;
import com.arraylist.utilities.Helper;

public class ArrayListTask {
	
	@SuppressWarnings("unchecked")
	public <E> List<E> getArrayList() throws ReflectiveOperationException{
		Class<?> myClass = Class.forName("java.util.ArrayList");
		Object myObj = myClass.getDeclaredConstructor().newInstance();
		return (List<E>) myObj;
	}
	public <E> int getLength(List<E> myList) throws InputInvalidException{
	    try {
	    	return myList.size();
	    	
	    }catch(NullPointerException n) {
	    	
	    throw new InputInvalidException("Array is null",n);
	    	
	    }
	}
	public <E> void addValue(List<E> myList,E value)throws InputInvalidException{
		 Helper.checkNull(myList);
		 myList.add(value);
	}
    public <E> int getIndex(List<E> myList,E value ) throws InputInvalidException {
    	Helper.checkNull(myList);
    	return myList.indexOf(value);
    }
    public <E> E getValue(List<E> myList,int index) throws InputInvalidException{
    	Helper.checkIndex(myList,index);
    	return myList.get(index);
    }
    public <E> int getLastIndex(List<E> myList,E value) throws InputInvalidException{
    	Helper.checkNull(myList);
    	return myList.lastIndexOf(value);
    }
    public <E> void addAtIndex(List<E> myList,int index,E value)throws InputInvalidException {
    	Helper.checkIndex(myList,index);
    	myList.add(index, value);
    }
    public <E> List<E> getSubList(List<E> myList,int firstIndex,int lastIndex)throws InputInvalidException{
    	Helper.checkNull(myList);
    	Helper.checkTwoIndex(myList,firstIndex, lastIndex);
    	return myList.subList(firstIndex,lastIndex);
    }
    public <E> void addArrayList(List<E> myList,List<E> myListToAdd)throws InputInvalidException {
    	Helper.checkNull(myList);
    	myList.addAll(myListToAdd);
    }
    public <E> void addArrayListAtIndex(List<E> myList,List<E> myListToAdd,int index) throws InputInvalidException{
    	Helper.checkIndex(myList,index);
    	myList.addAll(index,myListToAdd);
    }
    public <E> void deleteAtIndex(List<E> myList,int index)throws InputInvalidException {
    	Helper.checkIndex(myList,index);
    	myList.remove(index);
    }
    public <E> void removeElements(List<E> myList,List<E> myListToRemove)throws InputInvalidException {
    	Helper.checkNull(myList);
    	myList.removeAll(myListToRemove);
    }
    public <E> void removeExcept(List<E> myList,List<E> myListToRemove)throws InputInvalidException {
    	Helper.checkNull(myList);
    	myList.retainAll(myListToRemove);
    }
    public <E> void removeAllElements(List<E> myList)throws InputInvalidException {
    	Helper.checkNull(myList);
    	myList.clear();
    }
    public <E> boolean checkContains(List<E> myList,E value) throws InputInvalidException{
    	Helper.checkNull(myList);
    	return myList.contains(value);
    }
}
