package com.example.muzica.repository;

import com.example.muzica.model.Music;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicRepository extends JpaRepository<Music, Integer> {
}
