package shift.Lab.service;

import shift.Lab.entity.Monitor;

import java.util.List;

public interface MonitorService {
    Monitor createMonitor(Monitor monitor);
    Monitor updateMonitor(Monitor monitor);
    List<Monitor> getAllMonitor();
    Monitor getMonitorById(int monitorId);
}
