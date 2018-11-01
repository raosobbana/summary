package com.motocho.portfolio.summary.dao.repo.acct;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepositoy extends JpaRepository<Account, Long> {
}
