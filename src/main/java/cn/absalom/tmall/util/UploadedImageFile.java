package cn.absalom.tmall.util;

import org.springframework.web.multipart.MultipartFile;

/*
* 接收上传图片
* */
public class UploadedImageFile {

    MultipartFile image;
    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }

}
