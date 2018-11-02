package com.motocho.portfolio.summary.dao.repo;

import java.util.List;

/*import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;*/
import org.springframework.stereotype.Repository;

@Repository
public interface PositionLotRepositoy{}/* extends JpaRepository<PositionLot, Long> {
	@Query(nativeQuery = true, value ="select position_lot_Id from position_lot where position_id = ?1")
	List<Object> findByAccountId(long positionId);
}*/
