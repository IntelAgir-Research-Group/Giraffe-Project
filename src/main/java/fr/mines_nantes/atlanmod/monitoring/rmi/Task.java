package fr.mines_nantes.atlanmod.monitoring.rmi;

public interface Task<T> {
    T execute();
}
