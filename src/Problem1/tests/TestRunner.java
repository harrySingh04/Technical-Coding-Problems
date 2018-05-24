package problem1.tests;




import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import problem1.annotations.Test;

public class TestRunner {

	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub

		Class clazz = Class.forName("problem1.tests.SourceCodeTests");

		for(Method method:clazz.getMethods()) {

			Test testannoatation = method.getAnnotation(Test.class);
			if(testannoatation!=null) {
				Object result = method.invoke(null);
				if(( (Boolean) result)== true)
					System.out.println(method.getName() +" passed.");
				else
					System.out.println(method.getName() + " failed.");
			}
		}
	}

}
