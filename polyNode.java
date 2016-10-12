/**
   Mohammed Raza
   CSC 236 - Lab3 #1 (class 1)
*/

public class polyNode
{
	private Object value1;
	private Object value2;
	private polyNode next;


	public polyNode(Object initValue1, Object initValue2, polyNode initNext)
	{
		value1 = initValue1;
		value2 = initValue2;
		next = initNext;
	}

	public Object getValue1()
	{
		return value1;
	}

	public Object getValue2()
	{
		return value2;
	}

	public polyNode getNext()
	{
		return next;
	}

	public void setValue1(Object theNewValue1)
	{
		value1 = theNewValue1;
	}

	public void setValue2(Object theNewValue2)
	{
		value2 = theNewValue2;
	}

	public void setNext(polyNode theNewNext)
	{
		next = theNewNext;
	}
}