package com.ispoet.blog.repositories;

import com.ispoet.blog.models.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Raysmond
 */
public interface TagRepository extends JpaRepository<Tag, Long> {
    Tag findByName(String name);
}
