package com.ipl.cricketprocessor.deliveries;

import java.util.List; 

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface DeliveryRepository extends CassandraRepository<Delivery, Integer> {
	@Query("SELECT * from deliveries_by_matchid where match_id = ?0 ALLOW FILTERING")
    List<Delivery> findDeliveriesByID(Integer id);
}