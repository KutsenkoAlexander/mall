package com.macro.mall.security.component;

import org.springframework.security.access.ConfigAttribute;

import java.util.Map;

/**
 * Бизнес-класс, связанный с динамическими разрешениями
 * Created by macro on 2020/2/7.
 */
public interface DynamicSecurityService {
    /**
     * Подстановочный знак ANT ресурса загрузки бизнес-класса,
     * связанный с динамическими разрешениями, и соответствующий ресурс MAP
     */
    Map<String, ConfigAttribute> loadDataSource();
}
