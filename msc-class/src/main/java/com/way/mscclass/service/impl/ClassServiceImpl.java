package com.way.mscclass.service.impl;

import com.way.mscclass.dao.entity.Klass;
import com.way.mscclass.dao.repository.KlassRepository;
import com.way.mscclass.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassServiceImpl implements ClassService {

    @Autowired
    KlassRepository classRepository;

    @Override
    public List<Klass> getAllClasses() {
        return classRepository.findAll();
    }
}
