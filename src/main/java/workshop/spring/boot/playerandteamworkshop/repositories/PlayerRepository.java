package workshop.spring.boot.playerandteamworkshop.repositories;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import workshop.spring.boot.playerandteamworkshop.models.Player;

@Repository
public interface PlayerRepository extends PagingAndSortingRepository<Player, Integer> {
	List<Player> findAll();
}
