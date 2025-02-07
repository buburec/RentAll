package ru.tinkoff.rentall.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.tinkoff.rentall.entity.Advertisement;
import ru.tinkoff.rentall.entity.AdvertisementReview;

import java.util.List;

public interface AdvertisementRepository extends JpaRepository<Advertisement, Integer> {
    @Query(value = "SELECT * FROM advertisements a WHERE LOWER(a.adv_name) LIKE LOWER(CONCAT('%', :substring, '%'))", nativeQuery = true)
    List<Advertisement> findBySubstring(@Param("substring") String substring);
    List<Advertisement> findByUser_Login(String login);
}
