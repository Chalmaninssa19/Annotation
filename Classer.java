package annotation;

import java.lang.annotation.*;

@Target(ElementType.TYPE) //dit quel type on peut utiliser pour cette annotation
@Retention(RetentionPolicy.RUNTIME)
public @interface Classer{
    public String nom() default "";
}
