package com.example.serviceImpl;

import com.github.tobato.fastdfs.domain.fdfs.StorePath;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;
import com.example.service.PicService;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

@Service
public class PicServiceImpl implements PicService {

    @Autowired
    private FastFileStorageClient storageClient;
//    @Autowired
//    private PicMapper picMapper;


    @Override
    public java.lang.String upload(MultipartFile file) throws IOException {
        //commons-io模块中的IOUtils,将输入流转换成字节数组
        byte[] bytes = IOUtils.toByteArray(file.getInputStream());
        //获取文件大小
        long fileSize = file.getSize();
        //获取上传文件的扩展名
        String extension = FilenameUtils.getExtension(file.getOriginalFilename());
        InputStream inputStream = new ByteArrayInputStream(bytes);
        StorePath storePath = null;
        try {
            storePath = storageClient.uploadFile(inputStream, fileSize, extension, null);
        } catch (Exception e) {
            return null;
        }
        String nginx_info = "116.63.170.243:8888/";
        String full_http_path = "http://"+nginx_info+storePath.getFullPath();
        return storePath.getFullPath();
    }
}
