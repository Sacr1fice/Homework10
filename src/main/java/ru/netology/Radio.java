package ru.netology;

public class Radio {
    private int quantityRadioStation = 10;
    private int lastRadioStation = quantityRadioStation - 1;
    private int firstRadioStation = 0;
    private int currentRadioStation = firstRadioStation;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume =0;

    public Radio(int quantityRadioStation){
        this.lastRadioStation = quantityRadioStation - 1;
    }

    public Radio(){

    }


    public int getCurrentRadioStation(){
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation){
        if (newCurrentRadioStation < firstRadioStation){
            return;
        }
        if (newCurrentRadioStation > lastRadioStation){
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void nextRadioStation(){
        if (currentRadioStation < lastRadioStation){
            currentRadioStation = currentRadioStation +1;
        }
        if (currentRadioStation == lastRadioStation){
            currentRadioStation = 0;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation > firstRadioStation) {
            currentRadioStation = currentRadioStation - 1;
        }
        if (currentRadioStation == firstRadioStation) {
            currentRadioStation = lastRadioStation;
        }
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume){
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }


    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume ++;
        }
        if (currentVolume == maxVolume){
            return;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume --;
        }
        if (currentVolume == minVolume){
            return;
        }
    }
}
