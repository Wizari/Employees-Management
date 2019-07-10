package org.r78.employeesmanagement.repositories;

import org.r78.employeesmanagement.domain.Position;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class PositionRepository implements IPositionRepository {
    private List<Position> positionList = new ArrayList<>();

    @Override
    public void add(Position position) {
        this.positionList.add(position);
    }

    @Override
    public Collection<Position> getAll() {
        return positionList;
    }
}
