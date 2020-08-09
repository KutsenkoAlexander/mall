package com.macro.mall.security.annotation;

import java.lang.annotation.*;

/**
 * Пользовательская аннотация, метод кеширования с этой аннотацией вызовет исключение
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CacheException {
}
