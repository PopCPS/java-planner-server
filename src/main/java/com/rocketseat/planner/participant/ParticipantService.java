package com.rocketseat.planner.participant;

import org.springframework.stereotype.Service;
 
import java.util.UUID;
import java.util.List;


@Service
public class ParticipantService {
    
    public void registerParticipantToEvent(List<String> participantsToInvite, UUID tripId) {}

    public void triggerConfirmationEmailToParticipant(UUID tripId) {}

}
