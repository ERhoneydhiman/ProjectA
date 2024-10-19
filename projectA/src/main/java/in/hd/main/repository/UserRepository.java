package in.hd.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.hd.main.entities.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>{
	
	

}
