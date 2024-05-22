package ru.netology;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {

        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setNextStation() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        } else currentStation = 0;
    }

    public void setPrevStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else currentStation = 9;
    }

    public void setCurrentVolume(int newCurrentVolume) {

        if (newCurrentVolume > 100) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setNextVolume() {
        if (currentVolume >= 100) {
           return;
        }  currentVolume = currentVolume + 1;
    }

    public void setPrevVolume() {
        if (currentVolume <= 0) {
            return;
        }
            currentVolume = currentVolume - 1;
        }
    }

