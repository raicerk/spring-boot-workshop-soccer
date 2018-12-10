package workshop.spring.boot.playerandteamworkshop.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import workshop.spring.boot.playerandteamworkshop.models.Team;

public interface TeamService {
	Team create(Team team);

	Team update(Integer id, Team team);

	void delete(Integer id);

	Page<Team> findAll(Pageable pageable);

	List<Team> findAll();

	Team findById(Integer id);
}
