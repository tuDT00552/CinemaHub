package vn.cinemahub.cinemahub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.cinemahub.cinemahub.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
//    @Query("SELECT c FROM Cinema c where c.marap = :marap")
//    List<AdminEntity> findByCode(String code);
}
