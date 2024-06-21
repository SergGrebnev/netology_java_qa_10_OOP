package ru.netology.radio;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Radio {
    private int numberRadio; //текущий номер станции
    private int volumeRadio; //текущая громкость
    private int numberOfStations = 10; //количество станций
    private int minNumberRadio = 0; //минимальный номер станции
    private int maxNumberRadio = minNumberRadio + numberOfStations - 1; //максимальный номер станции
    private int minVolumeRadio = 0; //минимально возможная громкость
    private int maxVolumeRadio = 100; //максимально возможная громкость


    public Radio(int numberOfStations) {
        if (numberOfStations > 0) {
            this.numberOfStations = numberOfStations;
            maxNumberRadio = minNumberRadio + numberOfStations - 1;
        }
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
