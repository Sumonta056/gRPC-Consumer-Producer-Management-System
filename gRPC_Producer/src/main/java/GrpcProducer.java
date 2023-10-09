import io.grpc.Server;
import io.grpc.ServerBuilder;
import services.UserService;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class GrpcProducer {

    private static final Logger logger = Logger.getLogger(GrpcProducer.class.getName());

    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder
                .forPort(8082)
                .addService(new UserService())
                .build();
        server.start();

        logger.info("Server started at port : " + server.getPort());
          server.awaitTermination(200, TimeUnit.SECONDS);
    }
}
