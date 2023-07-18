package ru.netology;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void nextRadioStation() {
        if (currentRadioStation <= 8) {
            currentRadioStation = currentRadioStation + 1;
        }
        else currentRadioStation = 0;
        }


    public void prevRadioStation() {
        if (currentRadioStation >= 1) {
            currentRadioStation = currentRadioStation - 1;
        }
        else currentRadioStation = 9;
    }

    public void increaseVolume() {
        if (currentVolume <100) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume == 100) {
            return;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume == 0) {
            return;
        }
    }
}
