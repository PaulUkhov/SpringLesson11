package org.example.httpaspectstarter;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD,ElementType.TYPE}) //Подключается как к методам так и к классам
@Retention(RetentionPolicy.RUNTIME)
public @interface Timer {
}

