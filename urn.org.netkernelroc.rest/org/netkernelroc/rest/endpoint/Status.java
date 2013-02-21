package org.netkernelroc.rest.endpoint;

import org.netkernel.layer0.nkf.INKFRequestContext;
import org.netkernel.module.standard.endpoint.StandardAccessorImpl;

public class Status extends StandardAccessorImpl
  {

  public Status()
    {
    declareThreadSafe();
    }

  public void onSource(INKFRequestContext context) throws Exception
    {

    context.createResponseFrom("We have status!").setMimeType("text/plain");
    }

  }
