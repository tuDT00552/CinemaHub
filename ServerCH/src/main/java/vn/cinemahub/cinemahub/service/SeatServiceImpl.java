package vn.cinemahub.cinemahub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import vn.cinemahub.cinemahub.entities.GheEntity;
import vn.cinemahub.cinemahub.repository.SeatRepository;


import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class SeatServiceImpl implements SeatService{
    @Autowired
    private SeatRepository seatRepository;

    @Override
    public List<GheEntity> findAll() {
        return this.seatRepository.findAll();
    }

    @Override
    public GheEntity save(GheEntity gheEntity) {
        return seatRepository.save(gheEntity);
    }

    @Override
    public void update(GheEntity seat) {
        seatRepository.save(seat);
    }

    @Override
    public void delete(Long id) {
        this.seatRepository.deleteById(id);
    }

    @Override
    public Optional<GheEntity> findByID(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Object> findOne(Long id) {
        return Optional.empty();
    }


}