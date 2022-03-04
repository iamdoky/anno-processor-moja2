package me.iamdoky;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.ANNOTATION_TYPE)        // TYPE = Interface, Class, Enum 사용가능 
@Retention(RetentionPolicy.SOURCE)
public @interface Magic {

}
