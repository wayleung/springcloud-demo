package com.way.mscclass.service;

import com.way.mscclass.dao.entity.Klass;

import java.util.List;

public interface ClassService {
    List<Klass> getAllClasses();

    void addClass(Klass klass);
}
