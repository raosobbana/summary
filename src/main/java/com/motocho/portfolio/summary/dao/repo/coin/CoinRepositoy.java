package com.motocho.portfolio.summary.dao.repo.coin;

import org.springframework.stereotype.Repository;

@Repository
public interface CoinRepositoy { //extends JpaRepository<Coin, Long> {
	/*@Query(nativeQuery = true, value ="select coin_value from coin where coin_ID = ?1")
	Object findByCoinId(long coinId);*/
}
