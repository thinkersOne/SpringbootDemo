package org.com.parent.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

@Controller
public class FileUploadController {
    @Value("${file.path}")
    private String filePath;
    @RequestMapping("/upload")
    @ResponseBody
    public String upload(MultipartFile file) throws IOException {
        String extName=file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        String fileName = UUID.randomUUID().toString()+extName;
        FileCopyUtils.copy(file.getInputStream(),new FileOutputStream(new File(filePath+fileName)));
        System.out.println("文件上传成功！");
        return fileName+"上传成功！";
    }
}
