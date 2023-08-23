package com.ruru.review.repository;

import com.ruru.review.model.TestEntity;

import java.util.List;

public interface TestRepositoryCustom {
    public List<TestEntity> findAllByNameByQuerydsl(String name);
}
