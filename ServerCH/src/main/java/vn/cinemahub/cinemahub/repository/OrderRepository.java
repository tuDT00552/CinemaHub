package vn.cinemahub.cinemahub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import vn.cinemahub.cinemahub.entities.Cinema;
import vn.cinemahub.cinemahub.entities.Order;

import java.util.List;
import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order, Long> {
    @Query("SELECT o FROM Order o where o.orderid = :Oid")
    Optional<Order> findbyOid(Long Oid);

    @Query("SELECT o FROM Order o ORDER BY o.createdAt DESC")
    List<Order> findAllDESC();
}
