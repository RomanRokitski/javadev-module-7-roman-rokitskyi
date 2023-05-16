package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
//        HttpStatusChecker checker = new HttpStatusChecker();
//
//        try {
//            String imageUrl = checker.getStatusImage(200);
//            System.out.println("Image URL: " + imageUrl);
//        } catch (IOException e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//
//        try {
//            String imageUrl = checker.getStatusImage(10000);
//            if (imageUrl != null) {
//                System.out.println("Image URL: " + imageUrl);
//            } else {
//                System.out.println("Image not found");
//            }
//        } catch (IOException e) {
//            System.out.println("Error: " + e.getMessage());
//        }

//        HttpStatusImageDownloader downloader = new HttpStatusImageDownloader();
//        try {
//            downloader.downloadStatusImage(202);
//            System.out.println("Image downloaded successfully.");
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

        HttpImageStatusCli cli = new HttpImageStatusCli();
        cli.askStatus();
    }
}