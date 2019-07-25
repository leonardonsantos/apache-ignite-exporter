package com.linx.apacheigniteexporter;

public class IgniteNodeMetrics {
  long lastUpdateTime;
  long totalRejectedJobs;
  long totalCancelledJobs;
  long totalExecutedJobs;
  long totalIdleTime;
  long totalStartedThreadCount;
  long fileSystemFreeSpace;
  long fileSystemTotalSpace;
  long fileSystemUsableSpace;
  long heapMemoryInitialized;
  long heapMemoryMaximum;
  long sentMessagesCount;
  long sentBytesCount;
  long receivedMessagesCount;
  long receivedBytesCount;
  int totalCpus;
  double currentCpuLoad;
  double averageCpuLoad;
  long heapMemoryUsed;
  long heapMemoryCommitted;
  long totalExecutedTasks;
  long currentIdleTime;
  long totalBusyTime;
  double busyTimePercentage;
  double idleTimePercentage;
  long nonHeapMemoryInitialized;
  long nonHeapMemoryUsed;
  long nonHeapMemoryCommitted;
  long nonHeapMemoryMaximum;
  long currentThreadCount;
  long maximumThreadCount;
  long currentDaemonThreadCount;
  long maximumActiveJobs;
  long currentActiveJobs;
  long averageActiveJobs;
  long maximumWaitingJobs;
  long currentWaitingJobs;
  long averageWaitingJobs;
  long maximumRejectedJobs;
  long currentRejectedJobs;
  long averageRejectedJobs;
  long maximumCancelledJobs;
  long currentCancelledJobs;
  long averageCancelledJobs;
  long maximumJobWaitTime;
  long currentJobWaitTime;
  long averageJobWaitTime;
  long maximumJobExecuteTime;
  long currentJobExecuteTime;
  long averageJobExecuteTime;

  public long getLastUpdateTime() {
    return lastUpdateTime;
  }

  public void setLastUpdateTime(long lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
  }

  public long getTotalRejectedJobs() {
    return totalRejectedJobs;
  }

  public void setTotalRejectedJobs(long totalRejectedJobs) {
    this.totalRejectedJobs = totalRejectedJobs;
  }

  public long getTotalCancelledJobs() {
    return totalCancelledJobs;
  }

  public void setTotalCancelledJobs(long totalCancelledJobs) {
    this.totalCancelledJobs = totalCancelledJobs;
  }

  public long getTotalExecutedJobs() {
    return totalExecutedJobs;
  }

  public void setTotalExecutedJobs(long totalExecutedJobs) {
    this.totalExecutedJobs = totalExecutedJobs;
  }

  public long getTotalIdleTime() {
    return totalIdleTime;
  }

  public void setTotalIdleTime(long totalIdleTime) {
    this.totalIdleTime = totalIdleTime;
  }

  public long getTotalStartedThreadCount() {
    return totalStartedThreadCount;
  }

  public void setTotalStartedThreadCount(long totalStartedThreadCount) {
    this.totalStartedThreadCount = totalStartedThreadCount;
  }

  public long getFileSystemFreeSpace() {
    return fileSystemFreeSpace;
  }

  public void setFileSystemFreeSpace(long fileSystemFreeSpace) {
    this.fileSystemFreeSpace = fileSystemFreeSpace;
  }

  public long getFileSystemTotalSpace() {
    return fileSystemTotalSpace;
  }

  public void setFileSystemTotalSpace(long fileSystemTotalSpace) {
    this.fileSystemTotalSpace = fileSystemTotalSpace;
  }

  public long getFileSystemUsableSpace() {
    return fileSystemUsableSpace;
  }

  public void setFileSystemUsableSpace(long fileSystemUsableSpace) {
    this.fileSystemUsableSpace = fileSystemUsableSpace;
  }

  public long getHeapMemoryInitialized() {
    return heapMemoryInitialized;
  }

  public void setHeapMemoryInitialized(long heapMemoryInitialized) {
    this.heapMemoryInitialized = heapMemoryInitialized;
  }

  public long getHeapMemoryMaximum() {
    return heapMemoryMaximum;
  }

  public void setHeapMemoryMaximum(long heapMemoryMaximum) {
    this.heapMemoryMaximum = heapMemoryMaximum;
  }

  public long getSentMessagesCount() {
    return sentMessagesCount;
  }

  public void setSentMessagesCount(long sentMessagesCount) {
    this.sentMessagesCount = sentMessagesCount;
  }

  public long getSentBytesCount() {
    return sentBytesCount;
  }

  public void setSentBytesCount(long sentBytesCount) {
    this.sentBytesCount = sentBytesCount;
  }

  public long getReceivedMessagesCount() {
    return receivedMessagesCount;
  }

  public void setReceivedMessagesCount(long receivedMessagesCount) {
    this.receivedMessagesCount = receivedMessagesCount;
  }

  public long getReceivedBytesCount() {
    return receivedBytesCount;
  }

  public void setReceivedBytesCount(long receivedBytesCount) {
    this.receivedBytesCount = receivedBytesCount;
  }

  public int getTotalCpus() {
    return totalCpus;
  }

  public void setTotalCpus(int totalCpus) {
    this.totalCpus = totalCpus;
  }

  public double getCurrentCpuLoad() {
    return currentCpuLoad;
  }

  public void setCurrentCpuLoad(double currentCpuLoad) {
    this.currentCpuLoad = currentCpuLoad;
  }

  public double getAverageCpuLoad() {
    return averageCpuLoad;
  }

  public void setAverageCpuLoad(double averageCpuLoad) {
    this.averageCpuLoad = averageCpuLoad;
  }

  public long getHeapMemoryUsed() {
    return heapMemoryUsed;
  }

  public void setHeapMemoryUsed(long heapMemoryUsed) {
    this.heapMemoryUsed = heapMemoryUsed;
  }

  public long getHeapMemoryCommitted() {
    return heapMemoryCommitted;
  }

  public void setHeapMemoryCommitted(long heapMemoryCommitted) {
    this.heapMemoryCommitted = heapMemoryCommitted;
  }

  public long getTotalExecutedTasks() {
    return totalExecutedTasks;
  }

  public void setTotalExecutedTasks(long totalExecutedTasks) {
    this.totalExecutedTasks = totalExecutedTasks;
  }

  public long getCurrentIdleTime() {
    return currentIdleTime;
  }

  public void setCurrentIdleTime(long currentIdleTime) {
    this.currentIdleTime = currentIdleTime;
  }

  public long getTotalBusyTime() {
    return totalBusyTime;
  }

  public void setTotalBusyTime(long totalBusyTime) {
    this.totalBusyTime = totalBusyTime;
  }

  public double getBusyTimePercentage() {
    return busyTimePercentage;
  }

  public void setBusyTimePercentage(double busyTimePercentage) {
    this.busyTimePercentage = busyTimePercentage;
  }

  public double getIdleTimePercentage() {
    return idleTimePercentage;
  }

  public void setIdleTimePercentage(double idleTimePercentage) {
    this.idleTimePercentage = idleTimePercentage;
  }

  public long getNonHeapMemoryInitialized() {
    return nonHeapMemoryInitialized;
  }

  public void setNonHeapMemoryInitialized(long nonHeapMemoryInitialized) {
    this.nonHeapMemoryInitialized = nonHeapMemoryInitialized;
  }

  public long getNonHeapMemoryUsed() {
    return nonHeapMemoryUsed;
  }

  public void setNonHeapMemoryUsed(long nonHeapMemoryUsed) {
    this.nonHeapMemoryUsed = nonHeapMemoryUsed;
  }

  public long getNonHeapMemoryCommitted() {
    return nonHeapMemoryCommitted;
  }

  public void setNonHeapMemoryCommitted(long nonHeapMemoryCommitted) {
    this.nonHeapMemoryCommitted = nonHeapMemoryCommitted;
  }

  public long getNonHeapMemoryMaximum() {
    return nonHeapMemoryMaximum;
  }

  public void setNonHeapMemoryMaximum(long nonHeapMemoryMaximum) {
    this.nonHeapMemoryMaximum = nonHeapMemoryMaximum;
  }

  public long getCurrentThreadCount() {
    return currentThreadCount;
  }

  public void setCurrentThreadCount(long currentThreadCount) {
    this.currentThreadCount = currentThreadCount;
  }

  public long getMaximumThreadCount() {
    return maximumThreadCount;
  }

  public void setMaximumThreadCount(long maximumThreadCount) {
    this.maximumThreadCount = maximumThreadCount;
  }

  public long getCurrentDaemonThreadCount() {
    return currentDaemonThreadCount;
  }

  public void setCurrentDaemonThreadCount(long currentDaemonThreadCount) {
    this.currentDaemonThreadCount = currentDaemonThreadCount;
  }

  public long getMaximumActiveJobs() {
    return maximumActiveJobs;
  }

  public void setMaximumActiveJobs(long maximumActiveJobs) {
    this.maximumActiveJobs = maximumActiveJobs;
  }

  public long getCurrentActiveJobs() {
    return currentActiveJobs;
  }

  public void setCurrentActiveJobs(long currentActiveJobs) {
    this.currentActiveJobs = currentActiveJobs;
  }

  public long getAverageActiveJobs() {
    return averageActiveJobs;
  }

  public void setAverageActiveJobs(long averageActiveJobs) {
    this.averageActiveJobs = averageActiveJobs;
  }

  public long getMaximumWaitingJobs() {
    return maximumWaitingJobs;
  }

  public void setMaximumWaitingJobs(long maximumWaitingJobs) {
    this.maximumWaitingJobs = maximumWaitingJobs;
  }

  public long getCurrentWaitingJobs() {
    return currentWaitingJobs;
  }

  public void setCurrentWaitingJobs(long currentWaitingJobs) {
    this.currentWaitingJobs = currentWaitingJobs;
  }

  public long getAverageWaitingJobs() {
    return averageWaitingJobs;
  }

  public void setAverageWaitingJobs(long averageWaitingJobs) {
    this.averageWaitingJobs = averageWaitingJobs;
  }

  public long getMaximumRejectedJobs() {
    return maximumRejectedJobs;
  }

  public void setMaximumRejectedJobs(long maximumRejectedJobs) {
    this.maximumRejectedJobs = maximumRejectedJobs;
  }

  public long getCurrentRejectedJobs() {
    return currentRejectedJobs;
  }

  public void setCurrentRejectedJobs(long currentRejectedJobs) {
    this.currentRejectedJobs = currentRejectedJobs;
  }

  public long getAverageRejectedJobs() {
    return averageRejectedJobs;
  }

  public void setAverageRejectedJobs(long averageRejectedJobs) {
    this.averageRejectedJobs = averageRejectedJobs;
  }

  public long getMaximumCancelledJobs() {
    return maximumCancelledJobs;
  }

  public void setMaximumCancelledJobs(long maximumCancelledJobs) {
    this.maximumCancelledJobs = maximumCancelledJobs;
  }

  public long getCurrentCancelledJobs() {
    return currentCancelledJobs;
  }

  public void setCurrentCancelledJobs(long currentCancelledJobs) {
    this.currentCancelledJobs = currentCancelledJobs;
  }

  public long getAverageCancelledJobs() {
    return averageCancelledJobs;
  }

  public void setAverageCancelledJobs(long averageCancelledJobs) {
    this.averageCancelledJobs = averageCancelledJobs;
  }

  public long getMaximumJobWaitTime() {
    return maximumJobWaitTime;
  }

  public void setMaximumJobWaitTime(long maximumJobWaitTime) {
    this.maximumJobWaitTime = maximumJobWaitTime;
  }

  public long getCurrentJobWaitTime() {
    return currentJobWaitTime;
  }

  public void setCurrentJobWaitTime(long currentJobWaitTime) {
    this.currentJobWaitTime = currentJobWaitTime;
  }

  public long getAverageJobWaitTime() {
    return averageJobWaitTime;
  }

  public void setAverageJobWaitTime(long averageJobWaitTime) {
    this.averageJobWaitTime = averageJobWaitTime;
  }

  public long getMaximumJobExecuteTime() {
    return maximumJobExecuteTime;
  }

  public void setMaximumJobExecuteTime(long maximumJobExecuteTime) {
    this.maximumJobExecuteTime = maximumJobExecuteTime;
  }

  public long getCurrentJobExecuteTime() {
    return currentJobExecuteTime;
  }

  public void setCurrentJobExecuteTime(long currentJobExecuteTime) {
    this.currentJobExecuteTime = currentJobExecuteTime;
  }

  public long getAverageJobExecuteTime() {
    return averageJobExecuteTime;
  }

  public void setAverageJobExecuteTime(long averageJobExecuteTime) {
    this.averageJobExecuteTime = averageJobExecuteTime;
  }

  @Override
  public String toString() {
    return "IgniteNodeMetrics{" +
            "lastUpdateTime=" + lastUpdateTime +
            ", totalRejectedJobs=" + totalRejectedJobs +
            ", totalCancelledJobs=" + totalCancelledJobs +
            ", totalExecutedJobs=" + totalExecutedJobs +
            ", totalIdleTime=" + totalIdleTime +
            ", totalStartedThreadCount=" + totalStartedThreadCount +
            ", fileSystemFreeSpace=" + fileSystemFreeSpace +
            ", fileSystemTotalSpace=" + fileSystemTotalSpace +
            ", fileSystemUsableSpace=" + fileSystemUsableSpace +
            ", heapMemoryInitialized=" + heapMemoryInitialized +
            ", heapMemoryMaximum=" + heapMemoryMaximum +
            ", sentMessagesCount=" + sentMessagesCount +
            ", sentBytesCount=" + sentBytesCount +
            ", receivedMessagesCount=" + receivedMessagesCount +
            ", receivedBytesCount=" + receivedBytesCount +
            ", totalCpus=" + totalCpus +
            ", currentCpuLoad=" + currentCpuLoad +
            ", averageCpuLoad=" + averageCpuLoad +
            ", heapMemoryUsed=" + heapMemoryUsed +
            ", heapMemoryCommitted=" + heapMemoryCommitted +
            ", totalExecutedTasks=" + totalExecutedTasks +
            ", currentIdleTime=" + currentIdleTime +
            ", totalBusyTime=" + totalBusyTime +
            ", busyTimePercentage=" + busyTimePercentage +
            ", idleTimePercentage=" + idleTimePercentage +
            ", nonHeapMemoryInitialized=" + nonHeapMemoryInitialized +
            ", nonHeapMemoryUsed=" + nonHeapMemoryUsed +
            ", nonHeapMemoryCommitted=" + nonHeapMemoryCommitted +
            ", nonHeapMemoryMaximum=" + nonHeapMemoryMaximum +
            ", currentThreadCount=" + currentThreadCount +
            ", maximumThreadCount=" + maximumThreadCount +
            ", currentDaemonThreadCount=" + currentDaemonThreadCount +
            ", maximumActiveJobs=" + maximumActiveJobs +
            ", currentActiveJobs=" + currentActiveJobs +
            ", averageActiveJobs=" + averageActiveJobs +
            ", maximumWaitingJobs=" + maximumWaitingJobs +
            ", currentWaitingJobs=" + currentWaitingJobs +
            ", averageWaitingJobs=" + averageWaitingJobs +
            ", maximumRejectedJobs=" + maximumRejectedJobs +
            ", currentRejectedJobs=" + currentRejectedJobs +
            ", averageRejectedJobs=" + averageRejectedJobs +
            ", maximumCancelledJobs=" + maximumCancelledJobs +
            ", currentCancelledJobs=" + currentCancelledJobs +
            ", averageCancelledJobs=" + averageCancelledJobs +
            ", maximumJobWaitTime=" + maximumJobWaitTime +
            ", currentJobWaitTime=" + currentJobWaitTime +
            ", averageJobWaitTime=" + averageJobWaitTime +
            ", maximumJobExecuteTime=" + maximumJobExecuteTime +
            ", currentJobExecuteTime=" + currentJobExecuteTime +
            ", averageJobExecuteTime=" + averageJobExecuteTime +
            '}';
  }
}
