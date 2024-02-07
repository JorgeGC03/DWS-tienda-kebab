package com.fpmislata.KebabJorge.validaciones;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PriceValidator implements ConstraintValidator<ValidPrice, Integer> {
    @Override
    public void initialize(ValidPrice constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Integer price, ConstraintValidatorContext constraintValidatorContext) {
        return (price == null || (price >= 5 && price <= 30));
    }
}
