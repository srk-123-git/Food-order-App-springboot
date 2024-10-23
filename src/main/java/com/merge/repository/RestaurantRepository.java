package com.merge.repository;




import org.springframework.data.jpa.repository.JpaRepository;

import com.merge.entity.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}
