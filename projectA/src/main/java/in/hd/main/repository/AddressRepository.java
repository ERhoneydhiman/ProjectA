package in.hd.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.hd.main.entities.AddressEntity;

public interface AddressRepository extends JpaRepository<AddressEntity, Long>{

}
