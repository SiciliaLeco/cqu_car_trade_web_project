package com.example.picture_service.serviceImpl;

import com.github.tobato.fastdfs.domain.fdfs.StorePath;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.picture_service.service.PicService;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

@Service
public class PicServiceImpl implements PicService {

    @Autowired
    private FastFileStorageClient storageClient;


    @Override
    public java.lang.String upload(byte[] bytes, long fileSize, String extension) throws IOException {
        InputStream inputStream = new ByteArrayInputStream(bytes);
        StorePath storePath = null;
        try {
            storePath = storageClient.uploadFile(inputStream, fileSize, extension, null);
        } catch (Exception e) {
            return null;
        }
        String nginx_info = "http://116.63.170.243:8888/";
        String full_http_path = nginx_info+storePath.getFullPath();
        return storePath.getFullPath();
    }
}
