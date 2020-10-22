package com.qiwenshare.file.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.qiwenshare.file.util.DateUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qiwenshare.file.domain.Uploader;
import com.qiwenshare.file.domain.UploadFile;
import com.qiwenshare.file.util.IDUtils;
import com.qiwenshare.file.dao.FileDao;
import com.qiwenshare.file.dao.StorageDao;
import com.qiwenshare.file.dao.entity.File;
import com.qiwenshare.file.dao.entity.Storage;
import com.qiwenshare.file.domain.FileBean;
import com.qiwenshare.file.domain.StorageBean;
import com.qiwenshare.file.domain.UserBean;

@Service
public class FiletransferService {
    @Autowired
    private StorageDao storageDao;
    @Autowired
    private FileDao fileDao;

    public void uploadFile(HttpServletRequest request, FileBean fileBean, UserBean sessionUserBean) {
        Uploader uploader = new Uploader(request);
        List<UploadFile> uploadFileList = uploader.upload();
        for (int i = 0; i < uploadFileList.size(); i++) {
            UploadFile uploadFile = uploadFileList.get(i);
            if (uploadFile.getSuccess() == 1) {
                fileBean.setFileUrl(uploadFile.getUrl());
                fileBean.setFileSize(uploadFile.getFileSize());
                fileBean.setFileName(uploadFile.getFileName());
                fileBean.setExtendName(uploadFile.getFileType());
                fileBean.setTimeStampName(uploadFile.getTimeStampName());
                fileBean.setUploadTime(DateUtils.getCurrentTime());
                fileBean.setIsOSS(uploadFile.getIsOSS());
                fileBean.setIsDir(0);
                File file = new File();
                BeanUtils.copyProperties(fileBean, file);
                file.setFileId(IDUtils.nextId());
                fileDao.save(file);
            }
            synchronized (FiletransferService.class) {
                long sessionUserId = sessionUserBean.getUserId();
                StorageBean storageBean = selectStorageBean(new StorageBean(sessionUserId));
                if (storageBean == null) {
                    StorageBean storage = new StorageBean(sessionUserId);
                    storage.setStorageSize(fileBean.getFileSize());
                    insertStorageBean(storage);
                } else {
                    storageBean.setStorageSize(storageBean.getStorageSize() + uploadFile.getFileSize());
                    updateStorageBean(storageBean);
                }
            }
        }
    }

    public StorageBean selectStorageBean(StorageBean storageBean) {
        Storage storage = storageDao.getOneByUserId(storageBean.getUserId());
        if (storage == null) {
            return null;
        }
        BeanUtils.copyProperties(storage, storageBean);
        return storageBean;
    }

    public void insertStorageBean(StorageBean storageBean) {
        Storage storage = new Storage();
        BeanUtils.copyProperties(storageBean, storage);
        storageDao.save(storage);
    }

    public void updateStorageBean(StorageBean storageBean) {
        Storage storage = new Storage();
        BeanUtils.copyProperties(storageBean, storage);
        storageDao.editStorageSizeByIdAndUserId(storageBean.getStorageSize(),storageBean.getUserId(),storageBean.getStorageId());
    }

}
