package com.singtel.animalObjectOriental.animal;

public class Parrot extends Bird {
    private  ISing liveWith;

    public ISing getLiveWith() {
        return liveWith;
    }

    public void setLiveWith(ISing liveWith) {
        this.liveWith = liveWith;
    }

    @Override
    public void sing() {
        getLiveWith().sing();
    }
}
