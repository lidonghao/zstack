package org.zstack.header.image;

import org.zstack.header.message.DeletionMessage;

import java.util.List;

/**
 */
public class ImageDeletionMsg extends DeletionMessage implements ImageMessage {
    private String imageUuid;
    private List<String> backupStorageUuids;

    public List<String> getBackupStorageUuids() {
        return backupStorageUuids;
    }

    public void setBackupStorageUuids(List<String> backupStorageUuids) {
        this.backupStorageUuids = backupStorageUuids;
    }

    @Override
    public String getImageUuid() {
        return imageUuid;
    }

    public void setImageUuid(String imageUuid) {
        this.imageUuid = imageUuid;
    }
}
