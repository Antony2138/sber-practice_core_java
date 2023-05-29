package ru.sber.Annatation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Target;

@Inherited
@Target(ElementType.TYPE)
@Documented
public @interface DayWeek {
    int dayWeek() default 0;
}
