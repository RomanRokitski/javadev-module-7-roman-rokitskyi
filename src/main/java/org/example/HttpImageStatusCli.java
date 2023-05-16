package org.example;

import java.util.Scanner;

public class HttpImageStatusCli {
    public void askStatus() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter HTTP status code: ");
        if (scanner.hasNextInt()) {
            int statusCode = scanner.nextInt();

            try {
                HttpStatusImageDownloader downloader = new HttpStatusImageDownloader();
                downloader.downloadStatusImage(statusCode);
                System.out.println("Image downloaded successfully.");
            } catch (Exception e) {
                System.out.println("There is no image for HTTP status " + statusCode);
            }
        } else {
            System.out.println("Please enter a valid number.");
        }
    }
}
