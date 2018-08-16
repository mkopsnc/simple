package org.owsiak.actor;

import ptolemy.actor.lib.LimitedFiringSource;
import ptolemy.data.StringToken;
import ptolemy.data.type.BaseType;
import ptolemy.data.expr.Parameter;
import ptolemy.kernel.CompositeEntity;
import ptolemy.kernel.util.IllegalActionException;
import ptolemy.kernel.util.NameDuplicationException;

public class Simple extends LimitedFiringSource {

  public Simple(CompositeEntity container, String name)
    throws NameDuplicationException, IllegalActionException {
    
	super(container, name);
    output.setTypeEquals(BaseType.STRING);
  }

  @Override
  public void fire() throws IllegalActionException {
    super.fire();
    output.send(0, new StringToken("Hello world!") );
  }
}
