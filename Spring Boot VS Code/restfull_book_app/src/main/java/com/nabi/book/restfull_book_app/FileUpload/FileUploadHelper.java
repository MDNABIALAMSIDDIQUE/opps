package com.nabi.book.restfull_book_app.FileUpload;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper {
   // public final String upload_Die ="N:\\Program By MD NABI ALAM\\Spring Boot VS Code\\restfull_book_app\\src\\main\\resources\\static\\images";
    public final String upload_Die =new ClassPathResource("static/images").getFile().getAbsolutePath();

    public FileUploadHelper() throws Exception{

    }


    public boolean uploadFile(MultipartFile multipartFile){
        boolean f=false;
        try {


            /*
            InputStream inputStream= multipartFile.getInputStream();
            byte data[] = new byte[inputStream.available()];
            inputStream.read(data);

            // witre file 
            FileOutputStream fileOutputStream= new FileOutputStream(upload_Die +File.separator+multipartFile.getOriginalFilename());
            fileOutputStream.write(data);
            fileOutputStream.close();
            fileOutputStream.flush();

            */

            Files.copy(multipartFile.getInputStream(),Paths.get( upload_Die+File.separator+multipartFile.getOriginalFilename()),StandardCopyOption.REPLACE_EXISTING);
            f=true;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return f;
    }




}