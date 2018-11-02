package com.motocho.portfolio.summary.dao.repo;

import java.util.List;
/*
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;*/
import org.springframework.stereotype.Repository;

@Repository
public interface PositionRepositoy {}/*extends JpaRepository<Position, Long> {
	@Query(nativeQuery = true, value ="select p.position_Id, p.coin_id, p.quantity from position p where p.account_ID = ?1")
	List<Object[]> findByAccountId(long accountId);
}*/