package com.thinkxfactor.zomatoplus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thinkxfactor.zomatoplus.models.AddItem;

public interface ItemRepository extends JpaRepository<AddItem, Long> {

}
