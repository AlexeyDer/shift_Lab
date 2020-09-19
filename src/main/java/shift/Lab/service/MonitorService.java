package shift.Lab.service;

import shift.Lab.entity.Monitor;

import java.util.List;

/**
 * интерфейс для сущности Monitor
 *
 * @author "Alexey Derevtsov"
 */
public interface MonitorService {
    Monitor createMonitor(Monitor monitor);

    Monitor updateMonitor(Monitor monitor);

    List<Monitor> getAllMonitor();

    Monitor getMonitorById(int monitorId);
}
