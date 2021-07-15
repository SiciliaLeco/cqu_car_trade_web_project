package com.example.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface PicService {
    String upload(MultipartFile file) throws IOException;
}
