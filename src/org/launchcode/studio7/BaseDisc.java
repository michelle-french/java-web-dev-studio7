package org.launchcode.studio7;

public abstract class BaseDisc{

    public Integer rPM;
    public Double storageCapacity;

    public BaseDisc(Double storageCapacity, Integer rPM){
        this.storageCapacity = storageCapacity;
        this.rPM =  rPM;
    }

    public Double getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(Double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }
}