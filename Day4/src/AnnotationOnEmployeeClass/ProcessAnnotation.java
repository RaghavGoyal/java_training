package AnnotationOnEmployeeClass;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import Annotation.JavaFileInfo;

public class ProcessAnnotation {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
		
		new Employee(0, null, 0);
		Class<Employee> empObj = Employee.class;
		readAnnotationOn(empObj);
		
		Method method = empObj.getMethod("getId");
		readAnnotationOn(method);

	}

	private static void readAnnotationOn(AnnotatedElement element) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("\nFinding annotations on: "+element.getClass().getName());
			Annotation [] annotations = element.getAnnotations();
//			System.out.println("check1");
			for(Annotation annotation : annotations) {
//				System.out.println("check2");
				if(annotation instanceof EmployeeInfo) {
//					System.out.println("check3");
					EmployeeInfo fileInfo = (EmployeeInfo) annotation;
//					System.out.println("check4");
					System.out.println("Author: " +fileInfo.author());
					System.out.println("Version: " +fileInfo.version());
//					System.out.println("check5");
				}
			}
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		
	}

}
