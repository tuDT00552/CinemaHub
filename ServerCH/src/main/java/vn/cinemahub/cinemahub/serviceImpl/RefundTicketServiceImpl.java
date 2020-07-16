package vn.cinemahub.cinemahub.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vn.cinemahub.cinemahub.dto.ReTicketDto;
import vn.cinemahub.cinemahub.entities.RefundTicket;
import vn.cinemahub.cinemahub.repository.RefundTicketRepository;
import vn.cinemahub.cinemahub.repository.TicketRepository;
import vn.cinemahub.cinemahub.service.DAO;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class RefundTicketServiceImpl implements DAO<RefundTicket> {
    @Autowired
    private RefundTicketRepository refundTicketRepository;

    @Autowired
    private TicketRepository  ticketRepository;

    @Override
    public List<RefundTicket> findAll() {
        return this.refundTicketRepository.findAll();
    }

    @Override
    public Optional<RefundTicket> get(Long id) {
        return refundTicketRepository.findById(id);
    }

    @Override
    public RefundTicket save(RefundTicket refundTicket) {
        return refundTicketRepository.save(refundTicket);
    }

    @Override
    public void update(RefundTicket refundTicket) {
        refundTicketRepository.save(refundTicket);
    }

    @Override
    public void delete(Long id) {
        this.refundTicketRepository.deleteById(id);
    }

    public RefundTicket reTicket(ReTicketDto reTicket) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");


        Date currentDate = new Date();
        Date d1 = reTicket.getGiotra();

        Date d2 = reTicket.getNgaychieu();

        long diff = d2.getTime() - d1.getTime();

        long diffHours = diff / (3600000);

        RefundTicket refundTicket=new RefundTicket();

        refundTicket.setId(reTicket.getId());
        refundTicket.setMave(reTicket.getMave());
        refundTicket.setMarap(reTicket.getMarap());
        refundTicket.setMaphong(reTicket.getMaphong());
        refundTicket.setMaghe(reTicket.getMaghe());
        refundTicket.setGiave(reTicket.getGiave());
        refundTicket.setNgaychieu(reTicket.getNgaychieu());
        refundTicket.setKhunggio(reTicket.getKhunggio());
        refundTicket.setGiotra(reTicket.getGiotra());
        if (diffHours>48){
            refundTicket.setTienphat((long) 0);

        }if (diffHours>24&&diffHours<=48){
            refundTicket.setTienphat(reTicket.getGiave()*20/100);

        }if(diffHours>12&&diffHours<=24){
            refundTicket.setTienphat(reTicket.getGiave()*40/100);

        }if(diffHours>6 && diffHours<=12) {
            refundTicket.setTienphat(reTicket.getGiave()*60/100);

        }

        return refundTicketRepository.save(refundTicket);
    }
}





