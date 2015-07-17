package com.frodo.android.app.framework.orm;

import java.util.List;

import com.frodo.android.app.framework.controller.ChildSystem;
import com.frodo.android.app.framework.entity.Entity;

/**
 * 数据库操作
 * Created by frodo on 2015/6/20.
 */
public interface Database extends ChildSystem {
    <E extends Entity> E createObject(Class<E> clazz);

    long insert(Entity entity);

    long insertOrReplace(Entity entity);

    void refresh(Entity entity);

    void update(Entity entity);

    void delete(Entity entity);

    void deleteAll(Class entityClass);

    Entity load(Class entityClass, String key);

    List<Entity> loadAll(Class entityClass);

    void close();
}
