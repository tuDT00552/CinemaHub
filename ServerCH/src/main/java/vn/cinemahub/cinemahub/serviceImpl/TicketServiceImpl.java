package vn.cinemahub.cinemahub.serviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vn.cinemahub.cinemahub.dto.ReTicketDto;
import vn.cinemahub.cinemahub.dto.ThongkeDto;
import vn.cinemahub.cinemahub.entities.Order;
import vn.cinemahub.cinemahub.entities.RefundTicket;
import vn.cinemahub.cinemahub.entities.Ticket;
import vn.cinemahub.cinemahub.repository.TicketRepository;
import vn.cinemahub.cinemahub.service.DAO;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class TicketServiceImpl implements DAO<Ticket> {
    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public List<Ticket> findAll() {
        return this.ticketRepository.findAll();
    }

    public List<Ticket> findbyShow(Long idshow) {
        return this.ticketRepository.findbyShow(idshow);
    }

    @Override
    public Optional<Ticket> get(Long id) {
        return ticketRepository.findById(id);
    }

    public List<Ticket> findbyOrdID(Long ordid) { return this.ticketRepository.findbyOrdID(ordid); }

    @Override
    public Ticket save(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    @Override
    public void update(Ticket ticket) {
        ticketRepository.save(ticket);
    }

    @Override
    public void delete(Long id) {
        this.ticketRepository.deleteById(id);
    }

    public List<Ticket> findByTicket(Long id){return ticketRepository.findByTicket(id);}

    public void reTicket(ReTicketDto reTicket) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        Date currentDate = new Date();
        Date d1 = reTicket.getGiotra();

        Date d2 =reTicket.getTimeStart();


        long diff = d2.getTime() - d1.getTime();

        long diffHours = diff / (60 * 60 * 1000);

        Ticket ticket=new Ticket();

        ticket.setId(reTicket.getId());
        ticket.setTenphim(reTicket.getTenphim());
        ticket.setMarap(reTicket.getMarap());
        ticket.setOrder(reTicket.getOrder());
        ticket.setIdGhe(reTicket.getIdGhe());
        ticket.setGiave(reTicket.getGiave());
        ticket.setTimeStart(reTicket.getTimeStart());
        ticket.setTimeEnd(reTicket.getTimeEnd());
        ticket.setLichchieu(reTicket.getLichchieu());
        ticket.setStatus(1);

        if (diffHours>48){
            ticket.setTienphat((long) 0);

        }if (diffHours>24&&diffHours<=48){
            ticket.setTienphat(reTicket.getGiave()*20/100);

        }if(diffHours>12&&diffHours<=24){
            ticket.setTienphat(reTicket.getGiave()*40/100);

        }if(diffHours>6 && diffHours<=12) {
            ticket.setTienphat(reTicket.getGiave()*60/100);

        }

         ticketRepository.save(ticket);
    }

    @PersistenceContext
    EntityManager em;
    public List<Ticket> findByCinemaAndPhimAndMaghe(String nameF, Long idG, Long status) {
//        String setClause ="SELECT TFL.* " +
//                " FROM  TBL_FILM_SCHEDULE  TFL INNER  JOIN TBL_CINEMA  TC on TFL.CINEMA_ID = TC.ID " +
//                " INNER  JOIN TBL_FILM  TF on TFL.FILM_ID = TF.ID " +
//                " INNER  JOIN  TBL_ROOM  TR on TFL.ROOM_ID = TR.ID ";

        String setClause="SELECT T.*" +
                " FROM TICKET T ";

        StringBuilder whereClause = new StringBuilder();
        whereClause.append(" WHERE 1=1 ");
        if(nameF != ""){
            whereClause.append(" AND T.TENPHIM = '" + nameF+"' ");
        }
        if (idG != null){
            whereClause.append(" AND T.IDGHE = " + idG);
        }
        if (status != null){
            whereClause.append(" AND T.STATUS = "+ status);
        }
        String nativeQuery =setClause + whereClause.toString();
        Query query = em.createNativeQuery(nativeQuery,Ticket.class);
        return query.getResultList();
    }

    @PersistenceContext
    EntityManager emm;
    public void thongke(ThongkeDto thongke){
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        String d1=thongke.getTimeStart();
        String d2=thongke.getTimeEnd();




        String setClause1="SELECT tenphim,SUM(TICKET.GIAVE) AS doanhthu,count (TICKET.ID) AS sove " +
                "FROM TICKET" +
                "WHERE TICKET.STATUS=" + 0 + "AND"
                + "   to_char(TICKET.TIMESTART,'YYYY-MM-DD ') " +
                "BETWEEN 'to_char("+d1+",'YYYY-MM-DD ')' AND 'to_char("+d2+",'YYYY-MM-DD ')'";

        Query query = emm.createNativeQuery(setClause1,"ThongkeDto");

        query.getResultList();


    }



}
