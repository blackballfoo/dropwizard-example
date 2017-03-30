package uk.co.zerogravit.server.dropwizard;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import uk.co.zerogravit.server.dropwizard.respource.HelloWorldResource;

public class SimpleServerApplication  extends Application<SimpleServerConfiguration> {
    public SimpleServerApplication(){
    }

    public static void main(String[] args) throws Exception {
        new SimpleServerApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<SimpleServerConfiguration> bootstrap){
    }

    @Override
    public void run(SimpleServerConfiguration configuration, Environment environment) {

        environment.jersey().register(new HelloWorldResource());
    }

}
