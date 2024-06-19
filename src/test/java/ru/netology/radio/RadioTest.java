package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {

    //переход верхней границы номеров станций
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/testUpperLimitNumberRadio")
    void upperLimitNumberRadio(int numberRadio, int expected) {
        Radio testRadio = new Radio();
        testRadio.numberRadio = numberRadio;

        testRadio.next();
        int actual = testRadio.numberRadio;

        Assertions.assertEquals(expected, actual);
    }

    //переход нижней границы номеров станций
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/testUnderLimitNumberRadio")
    void underLimitNumberRadio(int numberRadio, int expected) {
        Radio testRadio = new Radio();
        testRadio.numberRadio = numberRadio;

        testRadio.prev();
        int actual = testRadio.numberRadio;

        Assertions.assertEquals(expected, actual);
    }

    //прямое указание номера станции
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/testSetNumberRadio")
    void testSetNumberRadio(int numberRadio, int expected) {
        Radio testRadio = new Radio();
        testRadio.setNumberRadio(5); //предварительная настройка станции

        testRadio.setNumberRadio(numberRadio);
        int actual = testRadio.numberRadio;

        Assertions.assertEquals(expected, actual);
    }

    //переход верхней границы громкости
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/testUpperLimitVolumeRadio")
    void upperLimitVolume(int volume, int expected) {
        Radio testRadio = new Radio();
        testRadio.volumeRadio = volume;

        testRadio.upVolume();
        int actual = testRadio.volumeRadio;

        Assertions.assertEquals(expected, actual);
    }

    //переход нижней границы громкости
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/testUnderLimitVolumeRadio")
    void underLimitVolume(int volume, int expected) {
        Radio testRadio = new Radio();
        testRadio.volumeRadio = volume;

        testRadio.downVolume();
        int actual = testRadio.volumeRadio;

        Assertions.assertEquals(expected, actual);
    }

}
