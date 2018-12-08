package com.ispoet.blog.repositories;

import com.ispoet.blog.models.Setting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Raysmond
 */
@Repository
public interface SettingRepository extends JpaRepository<Setting, Long> {
    Setting findByKey(String key);
}
