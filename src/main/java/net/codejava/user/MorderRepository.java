package net.codejava.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MorderRepository extends CrudRepository<Morder, Long> {

}