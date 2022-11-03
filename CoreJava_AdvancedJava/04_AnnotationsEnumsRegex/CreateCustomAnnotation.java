import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface MyCustomAnnotation {
    int studentAge() default 18;
    String studentName();
    String stuAddress();
    String stuStream() default "CSE";
}

/**
 * all the elements that have default values set while creating annonations can be skipped while using annotation.
 * For example, if we are applying the above annotation to a class then we would like to do this: 
 */

 @MyCustomAnnotation(
    studentName = "John", 
    stuAddress = "USA"
 )

 public class CreateCustomAnnotation {
    
 }