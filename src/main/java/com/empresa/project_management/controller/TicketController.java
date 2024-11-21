package com.empresa.project_management.controller;

import com.empresa.project_management.dto.TicketDTO;
import com.empresa.project_management.service.TicketService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketController {
    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @PostMapping
    public TicketDTO createTicket(@RequestBody TicketDTO ticketDTO) {
        return ticketService.createTicket(ticketDTO);
    }

    @PutMapping("/{id}")
    public TicketDTO updateTicket(@PathVariable Long id, @RequestBody TicketDTO ticketDTO) {
        return ticketService.updateTicket(id, ticketDTO);
    }

    @PutMapping("/{id}/cancel")
    public TicketDTO cancelTicket(@PathVariable Long id) {
        return ticketService.cancelTicket(id);
    }

    @GetMapping("/user-story/{id}")
    public List<TicketDTO> getTicketByUserStory(@PathVariable Long id) {
        return ticketService.getTicketsByUserStory(id);
    }
}
