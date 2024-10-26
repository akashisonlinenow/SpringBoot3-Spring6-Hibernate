package com.akashonlinehere.springdemo.mvc.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstraintValidator.class) // CourseCodeConstraintValidator - helper class that
                                // has business logic that we want
@Target({ElementType.METHOD, ElementType.FIELD}) // can apply our annotaion to method and field
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
    // define default course code
    public String value() default "LUV";

    // define default error message
    public String message() default "must start with LUV";

    // define default groups
    public Class<?>[] groups() default {};   // Groups: can group related constraints

    // define default payloads
    public Class<? extends Payload>[] payload() default {}; // Payloads: provide custom details abot validation failure
                                                                // (severity level, error code etc)
}
