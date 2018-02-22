package org.symphonyoss.s2.supportportal.poddiscoveryservice.server;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import javax.annotation.concurrent.Immutable;
import org.symphonyoss.s2.canon.runtime.IConsumer;
import org.symphonyoss.s2.canon.runtime.exception.JapiException;
import org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.canon.PodsAsyncPathHandler;
import org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.facade.Cursor;
import org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.facade.CursorLimit;
import org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.facade.Pod;
import org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.facade.PodPage;
import org.symphonyoss.s2.canon.supportportal.poddiscoveryservice.facade.PodPage.Factory.Builder;

@Immutable
public class PodsAsyncHandler extends PodsAsyncPathHandler
{
  public PodsAsyncHandler(ExecutorService processExecutor, ExecutorService responseExecutor)
  {
    super(processExecutor, responseExecutor);
  }

  @Override
  public void handleGet(IConsumer<PodPage> _consumer, Cursor cursor, CursorLimit limit) throws JapiException
  {
    Builder builder = getModel().getPodPageFactory().newBuilder();

    builder.withData(new ArrayList<Pod>(getModel().getAllPods()));

    _consumer.consume(builder.build());
    _consumer.close();
  }


}
