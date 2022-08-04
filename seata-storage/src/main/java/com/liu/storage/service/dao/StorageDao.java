package com.liu.storage.service.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StorageDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void decreaseStorage(Long productId, Integer count) {
		String sql = "update t_storage set used = used + ?, residue = residue - ? where product_id = ?";
		jdbcTemplate.update(sql, new Object[] { count, count, productId });
	}

}
