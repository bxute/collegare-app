package com.collegare.com.collegare.Managers;

import android.content.Context;
import android.util.Log;

import com.collegare.com.collegare.Models.CollegareUser;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
/**
 * Created by RadhePC on 02-11-2015.
 */
public class ImageUploadHelper {
    int serverResponseCode = 0;
    Context context;
    static ImageUploadHelper bInstance;

    public ImageUploadHelper() {
    }

    private ImageUploadHelper(Context context) {
        this.context = context;
    }

    public static ImageUploadHelper getInstance(Context context) {
        if (bInstance == null) {
            bInstance = new ImageUploadHelper(context);
        }
     return bInstance;
    }

    public int Upload(String filePath) {

        String fileName = filePath;
    Log.e("IUH","filepath:"+fileName);
        // setting up the stuffs for future use
        HttpURLConnection conn = null;
        DataOutputStream dos = null;
        String lineEnd = "\r\n";
        String twoHyphens = "--";
        String boundary = "*****";
        int bytesRead, bytesAvailable, bufferSize;
        byte[] buffer;
        int maxBufferSize = 1 * 1024 * 1024;
        File sourceFile = new File(filePath);

        if (!sourceFile.isFile()) {

            // something should be prompted for error

            Log.e("uploadFile", "Source File not exist :"
                    + fileName);
            return 0;
        } else {

            try {

                // open a URL connection to the Servlet
                FileInputStream fileInputStream = new FileInputStream(sourceFile);
                URL url = new URL(App_Config.USER_URL);

                // Open a HTTP  connection to  the URL
                conn = (HttpURLConnection) url.openConnection();
                conn.setDoInput(true); // Allow Inputs
                conn.setDoOutput(true); // Allow Outputs
                conn.setUseCaches(false); // Don't use a Cached Copy
                conn.setRequestMethod("POST");
                conn.setRequestProperty("Connection", "Keep-Alive");
                conn.setRequestProperty("ENCTYPE", "multipart/form-data");
                conn.setRequestProperty("Content-Type", "multipart/form-data;boundary=" + boundary);
                CollegareUser user= DatabaseManager.getInstance(new Contexter().getContext()).getUser();
                conn.setRequestProperty("id",user.id);
                conn.setRequestProperty("token",user.token);
                conn.setRequestProperty("action", "setpic");
                dos = new DataOutputStream(conn.getOutputStream());

                dos.writeBytes(twoHyphens + boundary + lineEnd);
                dos.writeBytes("Content-Disposition: form-data; name=" + fileName + ";filename="
                        + fileName + "" + lineEnd);

                dos.writeBytes(lineEnd);

                // create a buffer of  maximum size
                bytesAvailable = fileInputStream.available();

                bufferSize = Math.min(bytesAvailable, maxBufferSize);
                buffer = new byte[bufferSize];

                // read file and write it into form...
                bytesRead = fileInputStream.read(buffer, 0, bufferSize);

                while (bytesRead > 0) {
                    Log.e("IUH","writing...");
                    dos.write(buffer, 0, bufferSize);
                    bytesAvailable = fileInputStream.available();
                    bufferSize = Math.min(bytesAvailable, maxBufferSize);
                    bytesRead = fileInputStream.read(buffer, 0, bufferSize);

                }

                // send multipart form data necesssary after file data...
                dos.writeBytes(lineEnd);
                dos.writeBytes(twoHyphens + boundary + twoHyphens + lineEnd);
                    Log.e("IUH","written.");
                            // Responses from the server (code and message)
                serverResponseCode = conn.getResponseCode();
                String serverResponseMessage = conn.getResponseMessage();

                Log.e("IUH", "HTTP Response is : "
                        + serverResponseMessage + ": " + serverResponseCode);

                if (serverResponseCode == 0) {
                        Log.e("IUH"," "+serverResponseMessage);
                    // do something ... i.e. pic is uploaded successfully
                }

                //close the streams //
                               fileInputStream.close();
                dos.flush();
                dos.close();

            } catch (MalformedURLException ex) {


                ex.printStackTrace();

                Log.e("Upload file to server", "error: " + ex.getMessage(), ex);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return serverResponseCode;

        } // End else block

    }
}
