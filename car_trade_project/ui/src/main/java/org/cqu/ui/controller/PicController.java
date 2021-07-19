package org.cqu.ui.controller;

import org.cqu.buyer_api.BuyerService;
import org.cqu.picture_service.service.PicService;
import org.cqu.ui.util.FileUtil;
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
    @Reference
    private BuyerService buyerService;

    private final FileUtil fileUtil = new FileUtil();

    @RequestMapping({"/buyer"})
    public String upload(@RequestParam("local_img") MultipartFile uploadFile, @RequestParam("Tel") String tel) throws IOException {
        // 上传图片
        byte[] bytes = IOUtils.toByteArray(uploadFile.getInputStream());
        long fileSize = uploadFile.getSize();
        String extension = FilenameUtils.getExtension(uploadFile.getOriginalFilename());
        String filepath = picService.upload(bytes, fileSize, extension);
        String nginx_info = "http://116.63.170.243:8888/";
        System.out.println(nginx_info + filepath);
        // 更新用户表头像字段
        System.out.println("Tel:"+tel);
        buyerService.updateIcon(tel, nginx_info + filepath);
        return nginx_info + filepath;
    }

    @RequestMapping({"/seller1"})
    public String uploads1(@RequestParam("local_img1") MultipartFile uploadFile) throws IOException {
        byte[] bytes = IOUtils.toByteArray(uploadFile.getInputStream());
        long fileSize = uploadFile.getSize();
        String extension = FilenameUtils.getExtension(uploadFile.getOriginalFilename());
        System.out.println(uploadFile.getName());
        System.out.println(fileSize);
        System.out.println(bytes);
        System.out.println(extension);
        String filepath = picService.upload(bytes, fileSize, extension);
        String nginx_info = "http://116.63.170.243:8888/";
        System.out.println(nginx_info + filepath);
        return nginx_info + filepath;
    }
    @RequestMapping({"/seller2"})
    public String uploads2(@RequestParam("local_img2") MultipartFile uploadFile) throws IOException {
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
    @RequestMapping({"/seller3"})
    public String uploads5(@RequestParam("local_img3") MultipartFile uploadFile) throws IOException {
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
    @RequestMapping({"/seller4"})
    public String uploads3(@RequestParam("local_img4") MultipartFile uploadFile) throws IOException {
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
    @RequestMapping({"/seller5"})
    public String uploads4(@RequestParam("local_img5") MultipartFile uploadFile) throws IOException {
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
    @RequestMapping({"/show1"})
    public String show1(@RequestParam("local_img1") MultipartFile uploadFile) throws IOException {
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