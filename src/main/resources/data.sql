DROP TABLE IF EXISTS cpu_log;
 
CREATE TABLE cpu_log (
  log_id INT AUTO_INCREMENT PRIMARY KEY,
  cpu_count INT,
  cpu_usage DOUBLE,
  ip_address_machine VARCHAR(250),
  cpu_utilized_time TIME,
  cpu_available_time TIME,
  cpu_current_time TIMESTAMP 
);