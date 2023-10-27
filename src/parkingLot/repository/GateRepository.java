package src.parkingLot.repository;

import src.parkingLot.exception.GateNotFoundException;
import src.parkingLot.models.Gate;

import java.util.HashMap;

public class GateRepository {
    private HashMap<Integer, Gate> gateMap;

    public GateRepository() {
        this.gateMap = new HashMap<Integer, Gate>();
    }

    public Gate get(int gateId) throws GateNotFoundException {
        Gate gate = gateMap.get(gateId);
        if(gate == null) {
            throw new GateNotFoundException("Gate not found for Id: " + gateId);
        }
        return gate;
    }

    public Gate put (Gate gate) {
        gateMap.put(gate.getId(), gate);
        return gate;
    }
}
