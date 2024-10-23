package com.merge.repository;




import org.springframework.data.jpa.repository.JpaRepository;

import com.merge.entity.MenuItem;

public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
}
