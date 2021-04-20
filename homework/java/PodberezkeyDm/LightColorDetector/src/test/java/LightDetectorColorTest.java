import by.jrr.start.LightColorDetector;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LightDetectorColorTest {
    LightColorDetector lightColorDetector = new LightColorDetector();

    @Test
    public void waveLenghtViolet(){
        String actual = lightColorDetector.detect(400);
        String expected = "Violet(Фиолетовый)";
        assertEquals(actual,expected);
    }

    @Test
    public void waveLenghtBlue(){
        String actual = lightColorDetector.detect(470);
        String expected = "Blue(Синий)";
        assertEquals(actual,expected);
    }

    @Test
    public void waveLenghtGreen() {
        String actual = lightColorDetector.detect(500);
        String expected = "Green(Зеленый)";
        assertEquals(actual, expected);
    }

    @Test
    public void waveLenghtYellow() {
        String actual = lightColorDetector.detect(575);
        String expected = "Yellow(Желтый)";
        assertEquals(actual, expected);
    }

    @Test
    public void waveLenghtOrange() {
        String actual = lightColorDetector.detect(600);
        String expected = "Orange(Оранжевый)";
        assertEquals(actual, expected);
    }

    @Test
    public void waveLenghtRed() {
        String actual = lightColorDetector.detect(700);
        String expected = "Red(Красный)";
        assertEquals(actual, expected);
    }

    @Test
    public void waveLenghtInvisible() {
        String actual = lightColorDetector.detect(300);
        String expected = "Invisible Light(Невидимый свет)";
        assertEquals(actual, expected);
    }
}
