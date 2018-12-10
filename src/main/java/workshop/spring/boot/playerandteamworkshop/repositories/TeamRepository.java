package workshop.spring.boot.playerandteamworkshop.repositories;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import workshop.spring.boot.playerandteamworkshop.models.Team;

@Repository
public interface TeamRepository extends PagingAndSortingRepository<Team, Integer> {

	List<Team> findAll();

}
