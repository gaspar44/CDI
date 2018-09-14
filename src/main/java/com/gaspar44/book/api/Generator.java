package com.gaspar44.book.api;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;;

@Target({METHOD,FIELD,TYPE})
@Retention(RUNTIME)
@Qualifier
public @interface Generator {
	boolean use();
}
