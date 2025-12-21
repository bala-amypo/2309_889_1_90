package com.example.demo.service.impl;

import com.example.demo.model.DuplicateDetectionLog;
import com.example.demo.model.Ticket;
import com.example.demo.repository.DuplicateDetectionLogRepository;
import com.example.demo.repository.TicketRepository;
import com.example.demo.service.DuplicateDetectionService;
import com.example.demo.exception.NotFoundException;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service  
public class DuplicateDetectionServiceImpl
        implements DuplicateDetectionService {

    private final TicketRepository ticketRepository;
    private final DuplicateDetectionLogRepository logRepository;

    public DuplicateDetectionServiceImpl(
            TicketRepository ticketRepository,
            DuplicateDetectionLogRepository logRepository) {
        this.ticketRepository = ticketRepository;
        this.logRepository = logRepository;
    }

    @Override
    public List<DuplicateDetectionLog> detectDuplicates(Long ticketId) {

        Ticket baseTicket = ticketRepository.findById(ticketId)
                .orElseThrow(() -> new NotFoundException("Ticket not found"));

        List<Ticket> openTickets =
                ticketRepository.findByStatus("OPEN");

        List<DuplicateDetectionLog> results = new ArrayList<>();

        for (Ticket candidate : openTickets) {

            if (candidate.getId().equals(baseTicket.getId())) {
                continue;
            }

            if (baseTicket.getSubject() != null &&
                baseTicket.getSubject()
                        .equalsIgnoreCase(candidate.getSubject())) {

                DuplicateDetectionLog log =
                        new DuplicateDetectionLog(
                                baseTicket,
                                candidate,
                                1.0
                        );

                log.setDetectedAt(LocalDateTime.now());
                results.add(logRepository.save(log));
            }
        }
        return results;
    }

    @Override
    public List<DuplicateDetectionLog> getLogsForTicket(Long ticketId) {
        return logRepository.findByTicket_Id(ticketId);
    }

    @Override
    public DuplicateDetectionLog getLog(Long id) {
        return logRepository.findById(id)
                .orElseThrow(() ->
                        new NotFoundException("Log not found"));
    }
}