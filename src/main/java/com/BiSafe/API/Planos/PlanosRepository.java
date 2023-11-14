package com.BiSafe.API.Planos;

import io.micrometer.observation.ObservationFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanosRepository extends JpaRepository <Planos, Long> {
    Page<Planos> findAllByAtivoTrue(Pageable paginacao);
}
