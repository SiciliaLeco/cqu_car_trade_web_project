package com.example.teststatic.controller;

import com.example.picture_service.service.PicService;
import com.example.teststatic.util.FileUtil;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@RestController
@RequestMapping({"/picupload"})
public class PicController {

    @Reference
    private PicService picService;

    private final FileUtil fileUtil = new FileUtil();

    @RequestMapping({"/buyer"})
    public String upload(@RequestParam("local_img") MultipartFile uploadFile) throws IOException {
//        String path = "/usr/local/lqp/pic/379-1FHQ62519.jpg";
//        System.out.println("图片路径为：" + path);
//        File file = new File(path);
//        new FileInputStream(file);
//        String file_name = file.getName();
//        System.out.println("文件名为：" + file_name);
//        MultipartFile uploadFile = fileUtil.fileToMultipartFile(file);
        System.out.println(uploadFile.getName());
        System.out.println(uploadFile.getSize());
        byte[] bytes = IOUtils.toByteArray(uploadFile.getInputStream());
        long fileSize = uploadFile.getSize();
        String extension = FilenameUtils.getExtension(uploadFile.getOriginalFilename());
        String filepath = picService.upload(bytes, fileSize, extension);
        String nginx_info = "http://116.63.170.243:8888/";
        System.out.println(nginx_info + filepath);
        return nginx_info + filepath;
    }

    @RequestMapping({"/testmultipart"})
    public void testmultipart(String id) throws IOException {
        System.out.println("接收到id为：" + id);
        String path = "/usr/local/lqp/pic/379-1FHQ62519-50.jpg";
        File file = new File(path);
        new FileInputStream(file);
        String file_name = file.getName();
        System.out.println("文件名为：" + file_name);
        MultipartFile uploadFile = fileUtil.fileToMultipartFile(file);
        long size = uploadFile.getSize();
        InputStream is = uploadFile.getInputStream();
        System.out.println(is.available());
        System.out.println("文件大小为：" + size + "Bytes");
    }

}