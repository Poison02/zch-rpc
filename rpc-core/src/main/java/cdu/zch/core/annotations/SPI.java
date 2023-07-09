package cdu.zch.core.annotations;

import java.lang.annotation.*;

/**
 * @author Zch
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SPI {

    String value() default "";
}
