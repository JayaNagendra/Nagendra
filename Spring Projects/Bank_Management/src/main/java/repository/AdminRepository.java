package repository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {

	@Query("from Admin where userName = :s")
	Admin isUserExist(@Param("s") Object object);
}