package sports.dlithe.tournaments.log.DlitheTournaments.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sports.dlithe.tournaments.log.DlitheTournaments.enity.Athlete;

@Repository
public interface AthleteRepository extends JpaRepository<Athlete, Integer> {

}
