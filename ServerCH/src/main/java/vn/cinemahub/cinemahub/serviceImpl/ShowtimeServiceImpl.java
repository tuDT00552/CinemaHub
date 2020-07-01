package vn.cinemahub.cinemahub.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vn.cinemahub.cinemahub.entities.Showtime;
import vn.cinemahub.cinemahub.repository.ShowtimeRepository;
import vn.cinemahub.cinemahub.service.ShowtimeService;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class ShowtimeServiceImpl implements ShowtimeService {
    @Autowired
    private ShowtimeRepository showtimeRepository;

    @Override
    public List<Showtime> findAllByRoom(Long maphong) {
        return showtimeRepository.findAllByRoom(maphong);
    }

    @Override
    public List<Showtime> findAll() {
        return this.showtimeRepository.findAll();
    }

    @Override
    public Showtime save(Showtime showtime) {
        return showtimeRepository.save(showtime);
    }

    @Override
    public void update(Showtime showtime) {
        showtimeRepository.save(showtime);
    }

    @Override
    public void delete(Long id) {
        this.showtimeRepository.deleteById(id);
    }

    @Override
    public Optional<Showtime> findByID(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Showtime> findAllByMovieID(Long phimid) {
        return showtimeRepository.findAllByMovieID(phimid);
    }

    @Override
    public Optional<Showtime> findOne(Long id) {
        return showtimeRepository.findById(id);
    }

    @Override
    public List<Date> findDatebyMovie(Long phimid) {
        return showtimeRepository.findDatebyMovie(phimid);
    }


}
