package org.example;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpStatusImageDownloader {
    public void downloadStatusImage(int code) throws IOException {
        String imageUrl = new HttpStatusChecker().getStatusImage(code);
        URL url = new URL(imageUrl);
        HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
        int responseCode = httpConn.getResponseCode();

        if (responseCode == HttpURLConnection.HTTP_OK) {
            File dir = new File("downloads");
            dir.mkdirs();
            String fileName = dir.getAbsolutePath() + File.separator + code + ".jpg";
            InputStream inputStream = httpConn.getInputStream();
            OutputStream outputStream = new FileOutputStream(fileName);

            int bytesRead = -1;
            byte[] buffer = new byte[4096];
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            outputStream.close();
            inputStream.close();
        } else {
            throw new FileNotFoundException("Image not found");
        }
    }
}

