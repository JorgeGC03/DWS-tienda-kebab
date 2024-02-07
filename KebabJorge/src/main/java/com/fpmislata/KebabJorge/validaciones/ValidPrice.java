package com.fpmislata.KebabJorge.validaciones;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PriceValidator.class)
public @interface ValidPrice {
    String message() default "El precio tiene que ser mayor que 5 euros";
    Class<?>[] groups() default  {};
    Class<? extends Payload>[] payload() default {};
}
