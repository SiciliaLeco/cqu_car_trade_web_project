package org.cqu.picture_service.service;

import java.io.IOException;

public interface PicService {
    String upload(byte[] bytes, long fileSize, String extension) throws IOException;
}
