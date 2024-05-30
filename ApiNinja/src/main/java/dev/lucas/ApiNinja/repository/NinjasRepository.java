package dev.lucas.ApiNinja.repository;

import dev.lucas.ApiNinja.config.Ninjas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjasRepository extends JpaRepository<Ninjas, Long> {


}
