package org.vermaproject.apps.server.db.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.vermaproject.apps.server.db.entities.PatTestStateEvent;

import java.util.UUID;

@Repository
public interface PatTestStateEventRepository extends JpaRepository<PatTestStateEvent, UUID> {
}
