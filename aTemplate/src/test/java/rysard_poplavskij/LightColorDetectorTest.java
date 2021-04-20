package rysard_poplavskij;

import by.jrr.start.rysard_poplavskij.color_detector.LightColorDetector;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LightColorDetectorTest {

    @Test
    public void waveLengthVioletTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String actualResult = lightColorDetector.detect(381);
        String expectResult = "Violet";
        assertEquals(actualResult, expectResult);
    }

    @Test
    public void waveLengthBlueTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String actualResult = lightColorDetector.detect(460);
        String expectResult = "Blue";
        assertEquals(actualResult, expectResult);
    }

    @Test
    public void waveLengthGreenTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String actualResult = lightColorDetector.detect(500);
        String expectResult = "Green";
        assertEquals(actualResult, expectResult);
    }

    @Test
    public void waveLengthYellowTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String actualResult = lightColorDetector.detect(580);
        String expectResult = "Yellow";
        assertEquals(actualResult, expectResult);
    }

    @Test
    public void waveLengthOrangeTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String actualResult = lightColorDetector.detect(590);
        String expectResult = "Orange";
        assertEquals(actualResult, expectResult);
    }

    @Test
    public void waveLengthRedTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String actualResult = lightColorDetector.detect(590);
        String expectResult = "Orange";
        assertEquals(actualResult, expectResult);
    }

    @Test
    public void waveLengthInvisibleTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String actualResult = lightColorDetector.detect(752);
        String expectResult = "Invisible Light";
        assertEquals(actualResult, expectResult);
    }

}
