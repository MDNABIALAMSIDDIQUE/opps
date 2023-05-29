package com.nabi.book.restfull_book_app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.nabi.book.restfull_book_app.FileUpload.FileUploadHelper;


@RestController
public class FileUploadController {

    @Autowired
    private FileUploadHelper fileUploadHelper;
    
    @PostMapping("/file-upload")
    public ResponseEntity<String> uploadFile(@RequestParam("file")MultipartFile file){  //file postman type name


         System.out.println(file.getOriginalFilename());
         System.out.println(file.getSize());
         try{
        if(file.isEmpty()){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Request must Contain file");   
        }
        
        if(!file.getContentType().equals("image/jpeg")){

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("only JPEG file allowed");
        
        }

        
        //file Uplode Code

        
       boolean im=  fileUploadHelper.uploadFile(file);
            if(im){
                return ResponseEntity.ok(ServletUriComponentsBuilder.fromCurrentContextPath().path("/images").path(file.getOriginalFilename()).toUriString());
            }
    }
     catch (Exception e) {
        e.printStackTrace();
    }
    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("some thing is worg try again");
    
  }
}

