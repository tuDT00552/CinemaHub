package vn.cinemahub.cinemahub.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vn.cinemahub.cinemahub.entities.Cinema;
import vn.cinemahub.cinemahub.entities.RoomEntity;
import vn.cinemahub.cinemahub.repository.RoomRepository;
import vn.cinemahub.cinemahub.service.RoomService;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class RoomServiceImpl implements RoomService {
    @Autowired
    private RoomRepository roomRepository;

    @Override
    public List<RoomEntity> findAll() {
        return roomRepository.findAll();
    }

    @Override
    public RoomEntity save(RoomEntity roomEntity) {
        return roomRepository.save(roomEntity);
    }

    @Override
    public Optional<RoomEntity> findbyMaphong(int maphong) {
        return roomRepository.findbyMaphong(maphong);
    }

    @Override
    public Optional<RoomEntity> findByID(Long id) {
        return roomRepository.findById(id);
    }


}
