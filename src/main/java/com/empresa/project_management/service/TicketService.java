package com.empresa.project_management.service;

import com.empresa.project_management.dto.TicketDTO;
import com.empresa.project_management.entity.Ticket;
import com.empresa.project_management.entity.TicketStatus;
import com.empresa.project_management.entity.UserStory;
import com.empresa.project_management.mappers.TicketMapper;
import com.empresa.project_management.repository.TicketRepository;
import com.empresa.project_management.repository.UserStoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TicketService {
    private final TicketRepository ticketRepository;
    private final UserStoryRepository userStoryRepository;
    private final TicketMapper ticketMapper;

    public TicketService(TicketRepository ticketRepository, UserStoryRepository userStoryRepository, TicketMapper ticketMapper) {
        this.ticketRepository = ticketRepository;
        this.userStoryRepository = userStoryRepository;
        this.ticketMapper = ticketMapper;
    }

    public TicketDTO createTicket(TicketDTO ticketDTO) {
        UserStory userStory = userStoryRepository.findById(ticketDTO.userStoryId())
                .orElseThrow(() -> new RuntimeException("User story not found"));
        Ticket ticket = new Ticket();
        ticket.setTitle(ticketDTO.title());
        ticket.setComments(ticketDTO.comments());
        ticket.setStatus(TicketStatus.valueOf(ticketDTO.status()));
        ticket.setUserStory(userStory);

        Ticket savedTicket = ticketRepository.save(ticket);

        return ticketMapper.toDTO(savedTicket);
    }

    public TicketDTO updateTicket(Long id, TicketDTO ticketDTO) {
        Ticket ticket = ticketRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ticket not found"));

        if (!ticket.getUserStory().getId().equals(ticketDTO.userStoryId())) {
            UserStory userStory = userStoryRepository.findById(ticketDTO.userStoryId())
                    .orElseThrow(() -> new RuntimeException("User story not found"));
            ticket.setUserStory(userStory);
        }

        ticket.setTitle(ticketDTO.title());
        ticket.setComments(ticketDTO.comments());
        ticket.setStatus(TicketStatus.valueOf(ticketDTO.status()));

        Ticket updatedTicket = ticketRepository.save(ticket);
        return ticketMapper.toDTO(updatedTicket);
    }

    public TicketDTO cancelTicket(Long id) {
        Ticket ticket = ticketRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ticket not found"));

        ticket.setStatus(TicketStatus.CANCELED);
        Ticket canceledTicket = ticketRepository.save(ticket);

        return ticketMapper.toDTO(canceledTicket);
    }

    public List<TicketDTO> getTicketsByUserStory(Long id) {
        List<Ticket> tickets = ticketRepository.findAllByUserStoryId(id);
        return tickets.stream().map(ticketMapper::toDTO).collect(Collectors.toList());
    }

}
