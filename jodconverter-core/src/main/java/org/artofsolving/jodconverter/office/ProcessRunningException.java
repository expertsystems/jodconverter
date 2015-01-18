package org.artofsolving.jodconverter.office;

/**
 * Exception to be thrown when office process is already running.
 * @author Oskars Vilitis
 */
public class ProcessRunningException extends IllegalStateException {

  private static final long serialVersionUID = 1L;

  public ProcessRunningException(String acceptString, long existingPid) {
    String.format("a process with acceptString '%s' is already running; pid %d", acceptString, existingPid);
  }

}
