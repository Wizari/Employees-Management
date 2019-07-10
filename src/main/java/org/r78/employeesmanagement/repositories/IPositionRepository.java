package org.r78.employeesmanagement.repositories;

import org.r78.employeesmanagement.domain.Position;

import java.util.Collection;

public interface IPositionRepository {
    void add(Position position);

    Collection<Position> getAll();
}
