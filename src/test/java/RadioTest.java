import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void testRadio1() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRadio3() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRadio5() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRadio6() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRadio8() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRadio9() {
        Radio radio = new Radio();

        radio.setCurrentStation(2);

        int expected = 2;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRadio7() {
        Radio radio = new Radio();

        radio.setCurrentStation(-7);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNext() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.next();

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNext1() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.next();

        int expected = 2;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNext5() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);

        radio.next();

        int expected = 3;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNext2() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.next();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNext3() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNext4() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);

        radio.next();

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testPrev2() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);

        radio.prev();

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrev3() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);

        radio.prev();

        int expected = 2;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrev4() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.prev();

        int expected = 7;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrev5() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.prev();

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrev6() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testRadio() {
        Radio radio = new Radio();

        radio.setIncreaseVolume(1);

        int expected = 1;
        int actual = radio.getIncreaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRadio22() {
        Radio radio = new Radio();

        radio.setIncreaseVolume(-10);

        int expected = 0;
        int actual = radio.getIncreaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRadio2() {
        Radio radio = new Radio();

        radio.setIncreaseVolume(2);

        int expected = 2;
        int actual = radio.getIncreaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    public void testRadio24() {
        Radio radio = new Radio();

        radio.setIncreaseVolume(99);

        int expected = 99;
        int actual = radio.getIncreaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRadio25() {
        Radio radio = new Radio();

        radio.setIncreaseVolume(100);

        int expected = 100;
        int actual = radio.getIncreaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRadio26() {
        Radio radio = new Radio();

        radio.setIncreaseVolume(110);

        int expected = 0;
        int actual = radio.getIncreaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRadio27() {
        Radio radio = new Radio();

        radio.setIncreaseVolume(-9);

        int expected = 0;
        int actual = radio.getIncreaseVolume();

        Assertions.assertEquals(expected, actual);
    }
}





