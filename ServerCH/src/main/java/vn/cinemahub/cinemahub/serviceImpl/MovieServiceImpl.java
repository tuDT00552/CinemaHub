package vn.cinemahub.cinemahub.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vn.cinemahub.cinemahub.entities.Cinema;
import vn.cinemahub.cinemahub.entities.Movie;
import vn.cinemahub.cinemahub.repository.CinemaRepository;
import vn.cinemahub.cinemahub.repository.MovieRepository;
import vn.cinemahub.cinemahub.service.MovieService;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    @Override
    public Movie save(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public Optional<Movie> findByID(Long id) {
        return movieRepository.findById(id);
    }

    @Override
    public Optional<Movie> findOne(Long id) {
        return movieRepository.findById(id);
    }

    @Override
    public Long checkExitsMid(Long id) {
        return movieRepository.checkExitsMid(id);
    }

}
