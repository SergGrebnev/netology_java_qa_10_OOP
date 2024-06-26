package ru.netology.radio;

public class Radio {
    private int numberRadio; //текущий номер станции
    private int volumeRadio; //текущая громкость
    private int minNumberRadio = 0; //минимальный номер станции
    private int maxNumberRadio = 9; //максимальный номер станции
    private int minVolumeRadio = 0; //минимально возможная громкость
    private int maxVolumeRadio = 100; //максимально возможная громкость

    public int getNumberRadio() {
        return numberRadio;
    }

    public int getVolumeRadio() {
        return volumeRadio;
    }

    public void next() { //переключение на следующую станцию
        if (numberRadio >= maxNumberRadio) {
            numberRadio = minNumberRadio;
        } else {
            numberRadio++;
        }
    }

    public void prev() { //переключение на предыдущую станцию
        if (numberRadio <= minNumberRadio) {
            numberRadio = maxNumberRadio;
        } else {
            numberRadio--;
        }
    }

    public void setNumberRadio(int setNumber) {
        if (setNumber >= minNumberRadio && setNumber <= maxNumberRadio) {
            numberRadio = setNumber;
        }
    }

    public void setVolumeRadio(int setVolume) {
        if (setVolume >= minVolumeRadio && setVolume <= maxVolumeRadio) {
            volumeRadio = setVolume;
        }
    }


    public void upVolume() { //увеличение громкости
        if (volumeRadio >= maxVolumeRadio) {
            volumeRadio = maxVolumeRadio;
        } else {
            volumeRadio++;
        }
    }

    public void downVolume() { //уменьшение громкости
        if (volumeRadio <= minVolumeRadio) {
            volumeRadio = minVolumeRadio;
        } else {
            volumeRadio--;
        }
    }

}
