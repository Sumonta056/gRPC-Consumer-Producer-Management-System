import com.demo.grpc.User;
import com.demo.grpc.userGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Scanner;
import java.util.logging.Logger;

public class GrpcConsumer {

    private static final Logger logger = Logger.getLogger(GrpcConsumer.class.getName());

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 8082)
                .usePlaintext()
                .build();

        userGrpc.userBlockingStub userStub = userGrpc.newBlockingStub(channel);

        // Create a Scanner to capture user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to choose between login and registration
        System.out.println("Choose an option:");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (choice == 1) {
            // User chose login
            System.out.print("Enter your username: ");
            String username = scanner.nextLine();

            System.out.print("Enter your password: ");
            String password = scanner.nextLine();

            // Build the gRPC request with user input
            User.LoginReq request = User.LoginReq.newBuilder()
                    .setUsername(username)
                    .setPassword(password)
                    .build();

            // Send the login request to the server
            User.APIRes apiRes = userStub.login(request);
            logger.info(apiRes.getResCode() + "\n" + apiRes.getMessage());
        } else if (choice == 2) {
            System.out.print("Enter your username: ");
            String username = scanner.nextLine();

            System.out.print("Enter your email: ");
            String email = scanner.nextLine();

            System.out.print("Enter your bio: ");
            String bio = scanner.nextLine();

            System.out.print("Enter your password: ");
            String password = scanner.nextLine();

            // Build the gRPC request for registration
            User.RegisterReq registerReq = User.RegisterReq.newBuilder()
                    .setUsername(username)
                    .setPassword(password)
                    .setEmail(email)
                    .setBio(bio)
                    .build();

            // Send the registration request to the server
            User.APIRes apiRes = userStub.register(registerReq);
            logger.info(apiRes.getResCode() + "\n" + apiRes.getMessage());
        } else {
            System.out.println("Invalid choice.");
        }

        // Close the scanner and channel
        scanner.close();
        channel.shutdown();
    }
}
