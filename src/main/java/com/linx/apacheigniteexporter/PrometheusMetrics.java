package com.linx.apacheigniteexporter;

public class PrometheusMetrics {
  IgniteNodeMetrics metrics;
  StringBuffer result;

  public PrometheusMetrics(IgniteNodeMetrics m) {
    result = new StringBuffer();
    metrics = m;
  }

  private void buildMetric(String metricName, long value, String type) {
    result.append("# TYPE " + metricName + "\n");
    result.append(metricName + " " + value + "\n\n");
  }

  private void buildMetric(String metricName, double value, String type) {
    result.append("# TYPE " + metricName + "\n");
    result.append(metricName + " " + value + "\n\n");
  }

  public String parseMetrics() {
    buildMetric("ignite_sent_bytes_count", metrics.sentBytesCount, "counter");
    buildMetric("ignite_sent_messages_count", metrics.sentMessagesCount, "counter");

    buildMetric("ignite_received_bytes_count", metrics.receivedBytesCount, "counter");
    buildMetric("ignite_received_messages_count", metrics.receivedMessagesCount, "counter");

    buildMetric("ignite_currrent_cpu_load", metrics.currentCpuLoad, "gauge");
    buildMetric("ignite_total_cpus", metrics.totalCpus, "gauge");

    buildMetric("ignite_heap_memory_initialized", metrics.heapMemoryInitialized, "gauge");
    buildMetric("ignite_heap_memory_maximum", metrics.heapMemoryMaximum, "gauge");
    buildMetric("ignite_heap_memory_used", metrics.heapMemoryUsed, "gauge");
    buildMetric("ignite_heap_memory_commit", metrics.heapMemoryCommitted, "gauge");

    buildMetric("ignite_non_heap_memory_initialized", metrics.nonHeapMemoryInitialized, "gauge");
    buildMetric("ignite_non_heap_memory_maximum", metrics.nonHeapMemoryMaximum, "gauge");
    buildMetric("ignite_non_heap_memory_used", metrics.nonHeapMemoryUsed, "gauge");
    buildMetric("ignite_non_heap_memory_commit", metrics.nonHeapMemoryCommitted, "gauge");

    buildMetric("ignite_current_thread_count", metrics.currentThreadCount, "gauge");
    buildMetric("ignite_maximum_thread_count", metrics.maximumThreadCount, "gauge");
    buildMetric("ignite_total_started_thread_count", metrics.totalStartedThreadCount, "count");

    buildMetric("ignite_current_daemon_thread_count", metrics.currentDaemonThreadCount, "gauge");

    buildMetric("ignite_file_system_free_space", metrics.fileSystemFreeSpace, "gauge");
    buildMetric("ignite_file_system_total_space", metrics.fileSystemTotalSpace, "gauge");
    buildMetric("ignite_file_system_usable_space", metrics.fileSystemUsableSpace, "gauge");

    return result.toString();
  }
}
