package com.ipl.cricketprocessor.match;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MatchRepository extends CassandraRepository<Match, Integer> {

}
