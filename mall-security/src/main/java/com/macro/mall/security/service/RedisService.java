package com.macro.mall.security.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Redis Operation Service
 * Created by macro on 2020/3/3.
 */
public interface RedisService {

    /**
     * Сохранить свойства
     */
    void set(String key, Object value, long time);

    /**
     * Сохранить свойства
     */
    void set(String key, Object value);

    /**
     * Получить атрибуты
     */
    Object get(String key);

    /**
     * Удалить атрибут
     */
    Boolean del(String key);

    /**
     * Массовое удаление атрибутов
     */
    Long del(List<String> keys);

    /**
     * Установить время истечения
     */
    Boolean expire(String key, long time);

    /**
     * Получить срок действия
     */
    Long getExpire(String key);

    /**
     * Определите, есть ли этот атрибут
     */
    Boolean hasKey(String key);

    /**
     * Приращение по дельте
     */
    Long incr(String key, long delta);

    /**
     * Уменьшение на дельту
     */
    Long decr(String key, long delta);

    /**
     * Получить атрибуты в структуре Hash
     */
    Object hGet(String key, String hashKey);

    /**
     * Поместите атрибут в структуру хэша
     */
    Boolean hSet(String key, String hashKey, Object value, long time);

    /**
     * Поместите атрибут в структуру хэша
     */
    void hSet(String key, String hashKey, Object value);

    /**
     * Получите всю структуру хэша напрямую
     */
    Map<Object, Object> hGetAll(String key);

    /**
     * Установить всю структуру хеширования напрямую
     */
    Boolean hSetAll(String key, Map<String, Object> map, long time);

    /**
     * Установить всю структуру хеширования напрямую
     */
    void hSetAll(String key, Map<String, Object> map);

    /**
     * Удалите атрибуты в структуре хеширования
     */
    void hDel(String key, Object... hashKey);

    /**
     * Определите, есть ли этот атрибут в структуре хеширования
     */
    Boolean hHasKey(String key, String hashKey);

    /**
     * Дополнительные атрибуты в структуре хеширования
     */
    Long hIncr(String key, String hashKey, Long delta);

    /**
     * Уменьшение атрибута в структуре хеша
     */
    Long hDecr(String key, String hashKey, Long delta);

    /**
     * Получить структуру набора
     */
    Set<Object> sMembers(String key);

    /**
     * Добавить атрибуты в структуру Set
     */
    Long sAdd(String key, Object... values);

    /**
     * Добавить атрибуты в структуру Set
     */
    Long sAdd(String key, long time, Object... values);

    /**
     * Это атрибут в Set
     */
    Boolean sIsMember(String key, Object value);

    /**
     * Получите длину структуры Set
     */
    Long sSize(String key);

    /**
     * Удалите атрибуты в структуре Set
     */
    Long sRemove(String key, Object... values);

    /**
     * Получить атрибуты в структуре списка
     */
    List<Object> lRange(String key, long start, long end);

    /**
     * Получить длину структуры списка
     */
    Long lSize(String key);

    /**
     * Получить атрибуты в Списке по индексу
     */
    Object lIndex(String key, long index);

    /**
     * Добавить атрибуты в структуру списка
     */
    Long lPush(String key, Object value);

    /**
     * Добавить атрибуты в структуру списка
     */
    Long lPush(String key, Object value, long time);

    /**
     * Добавляйте атрибуты партиями в структуру списка
     */
    Long lPushAll(String key, Object... values);

    /**
     * Добавляйте атрибуты партиями в структуру списка
     */
    Long lPushAll(String key, Long time, Object... values);

    /**
     * Удалить атрибуты из структуры списка
     */
    Long lRemove(String key, long count, Object value);
}