package io.javabrains.betterreads.match;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Scope(value="session")
@Component(value="MatchService")
public class MatchService {
	
	@Autowired
	private MatchRepository matchRepository;
	//private Match match = new Match();
	
	public List<Match> getAllMatches(){
		List<Match> lst= new ArrayList();
		lst= matchRepository.findAll();
		System.out.println(lst.get(0).getMatch_id()+" "+lst.get(0).getResultMargin()+"  "+lst.get(1).getMatch_id()+" "+lst.get(1).getResultMargin());
		return matchRepository.findAll();
		
	}
	
	

}
