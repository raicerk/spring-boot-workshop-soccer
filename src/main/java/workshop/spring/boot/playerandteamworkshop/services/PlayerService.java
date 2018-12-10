package workshop.spring.boot.playerandteamworkshop.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import workshop.spring.boot.playerandteamworkshop.models.Player;

public interface PlayerService {

	Player create(Player player);

	Player update(Integer id, Player player);

	void delete(Integer id);

	Page<Player> findAll(Pageable pageable);

	List<Player> findAll();

	Player findById(Integer id);

	Player addTeam(Integer id, Integer teamId);
}
