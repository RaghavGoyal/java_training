package Annotation;

@JavaFileInfo               // used the annotation defined for class    //here default values will be used.
public class DemoClass {
	
	@JavaFileInfo(author="Admin", version="1.0")       //used the annotation at method with the values of method.
	public String getString() {
		return null;
	}

}
