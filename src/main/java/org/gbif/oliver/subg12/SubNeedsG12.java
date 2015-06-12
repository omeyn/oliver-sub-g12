package org.gbif.oliver.subg12;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.Service;

public class SubNeedsG12 {

  public void runMe() {
    Service fake = new FakeService();
    fake.start();
  }

  private static class FakeService implements Service {

    @Override
    public ListenableFuture<State> start() {
      System.out.println("Start on G12 service called.");
      return null;
    }

    @Override
    public State startAndWait() {
      // TODO: Write implementation
      throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public boolean isRunning() {
      // TODO: Write implementation
      throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public State state() {
      // TODO: Write implementation
      throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public ListenableFuture<State> stop() {
      // TODO: Write implementation
      throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public State stopAndWait() {
      // TODO: Write implementation
      throw new UnsupportedOperationException("Not implemented yet");
    }
  }
}
