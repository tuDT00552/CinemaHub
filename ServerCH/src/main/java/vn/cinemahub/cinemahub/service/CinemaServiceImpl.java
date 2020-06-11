package vn.cinemahub.cinemahub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vn.cinemahub.cinemahub.entities.Cinema;
import vn.cinemahub.cinemahub.repository.CinemaRepository;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class CinemaServiceImpl implements CinemaService{

    @Autowired
    private CinemaRepository cinemaRepository;

    @Override
    public List<Cinema> findAll() {
        return cinemaRepository.findAll();
    }

    @Override
    public Cinema save(Cinema cinema) {
        return cinemaRepository.save(cinema);
    }

    public Optional<Cinema> findByID(Long id) {
        return cinemaRepository.findById(id);
    }
}
