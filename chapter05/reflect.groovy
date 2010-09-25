import java.lang.reflect.Field
import java.lang.reflect.Method

public class Reflect {
	
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName(args[0])
			
			println "package for class: "
			println "\t" + clazz.package
			
			println("methods for class: ")
			clazz.methods.each { println "\t" + it }
			
			println("fields for class: ")
			clazz.fields.each { println "\t" + it }

		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}