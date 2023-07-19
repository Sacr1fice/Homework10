import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Radio;

public class RadioTest {

    @Test
    public void shouldSetRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(7);

        int expected = 7;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationAboveMax() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(10);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationBelowMin() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldRadioSwitchToNextStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(2);

        rad.nextRadioStation();

        int expected = 3;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldRadioSwitchToPrevStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(5);

        rad.prevRadioStation();

        int expected = 4;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldRadioSwitchToNextStationAboveMax() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(9);

        rad.nextRadioStation();

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldRadioSwitchToPrevStationBelowMin() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(0);

        rad.prevRadioStation();

        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void boundaryValueSetCurrentVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(101);
        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void boundaryNegativeValueSetCurrentVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);
        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeUp() {
        Radio rad = new Radio();

        rad.setCurrentVolume(55);

        rad.increaseVolume();

        int expected = 56;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldVolumeDown() {
        Radio rad = new Radio();

        rad.setCurrentVolume(72);

        rad.decreaseVolume();

        int expected = 71;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetVolumeUpAboveMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(100);

        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetVolumeDownBelowMin() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);

        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testBoundaryValuesToPrevSwitch() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(1);

        rad.prevRadioStation();

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testBoundaryValuesToNextSwitch() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(8);

        rad.nextRadioStation();

        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }
}
