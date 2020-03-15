package Annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;

public class ProcessAnnotationExample {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
		
		new DemoClass();
		Class<DemoClass> demoClassObj = DemoClass.class;
		readAnnotationOn(demoClassObj);
		
		Method method = demoClassObj.getMethod("getString");
		readAnnotationOn(method);

	}

	private static void readAnnotationOn(AnnotatedElement element) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("\nFinding annotations on"+element.getClass().getName());
			Annotation [] annotations = element.getAnnotations();
			for(Annotation annotation: annotations) {
				if(annotation instanceof JavaFileInfo) {
					JavaFileInfo fileInfo = (JavaFileInfo) annotation;
					System.out.println("Author: " +fileInfo.author());
					System.out.println("Version: " +fileInfo.version());
				}
			}
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		
	}

}
