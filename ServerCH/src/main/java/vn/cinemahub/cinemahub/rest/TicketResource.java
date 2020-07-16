package vn.cinemahub.cinemahub.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.cinemahub.cinemahub.dto.ReTicketDto;
import vn.cinemahub.cinemahub.dto.SearchTicketDto;
import vn.cinemahub.cinemahub.dto.ThKeDto;
import vn.cinemahub.cinemahub.entities.Ticket;
import vn.cinemahub.cinemahub.serviceImpl.OrderService;
import vn.cinemahub.cinemahub.serviceImpl.TicketServiceImpl;

import java.util.Date;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping({"/api/ticket"})
public class TicketResource {
    private final TicketServiceImpl ticketService;

    @Autowired
    private OrderService orderService;

    public TicketResource(TicketServiceImpl ticketService) {

        this.ticketService = ticketService;
    }

    @GetMapping
    public List<Ticket> findAll() {
        return ticketService.findAll();
    }

    @GetMapping({"/s/{id}"})
    public List<Ticket> findbyShow(@PathVariable Long id) {
        return ticketService.findbyShow(id);
    }

    @GetMapping({"/o/{id}"})
    public List<Ticket> findbyOrd(@PathVariable Long id) {
        return ticketService.findbyOrdID(id);
    }

    @PostMapping
    public Ticket save(@RequestBody Ticket ticket) {
        Date date = new Date();
        ticket.setCreatedAt(date);
        ticket.setUpdateAt(date);
        ticket.setOrder(orderService.get(ticket.getOrder().getId()).get());
        return this.ticketService.save(ticket);
    }

    @PutMapping
    public ResponseEntity<Void> update(@RequestBody Ticket ticket) {
        this.ticketService.update(ticket);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping({"/{id}"})
    public ResponseEntity findOne(@PathVariable Long id) {
        return (ResponseEntity)this.ticketService.get(id).map((ticket) -> {
            return new ResponseEntity(ticket, HttpStatus.OK);
        }).orElse(new ResponseEntity(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping({"/{id}"})
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        this.ticketService.delete(id);
        return new ResponseEntity(HttpStatus.OK);
    }


//    @GetMapping("/search/{idTicket}")
//    public List<Ticket> findByTicket(@PathVariable Long idTicket){
//        return ticketService.findByTicket(idTicket);
//    }

    @GetMapping("/search/{idTicket}")
    public List<Ticket> findByTicket(@PathVariable Long idTicket){
        return ticketService.findByTicket(idTicket);
    }




    @PostMapping("/thongke")
     public List<ThKeDto>thongke(@RequestBody ThKeDto thongke){
         return this.ticketService.thongke(thongke);

//    @GetMapping({"/{id}"})
//    public ResponseEntity search(@PathVariable Long id) {
//        return (ResponseEntity)this.ticketService.get(id).map((ticket) -> {
//            return new ResponseEntity(ticket, HttpStatus.OK);
//        }).orElse(new ResponseEntity(HttpStatus.NOT_FOUND));
//    }
}
