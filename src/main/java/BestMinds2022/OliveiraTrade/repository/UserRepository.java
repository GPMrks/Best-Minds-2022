package BestMinds2022.OliveiraTrade.repository;

import BestMinds2022.OliveiraTrade.model.UserFA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserFA, String> {

    @Query("SELECT e FROM UserFA e WHERE e.username= (:username)")
    public UserFA findByUsername(@Param("username") String username);

    boolean existsByUsername(String username);
}
