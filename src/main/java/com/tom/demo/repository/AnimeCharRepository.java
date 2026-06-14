package com.tom.demo.repository;

import com.tom.demo.model.AnimeChar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimeCharRepository extends JpaRepository<AnimeChar,Long>{
}