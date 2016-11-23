package edu.orangecoastcollege.cs273.mpaulding.ocmusicevents;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.*;

/**
 * Created by equach3 on 11/22/2016.
 */
public class MusicEventTest {

    private MusicEvent mMusicEvent;

    @Before
    public void setUp() throws Exception {
        mMusicEvent = new MusicEvent();
        mMusicEvent.setTitle("Test");
        mMusicEvent.setDay("Caturday");
        mMusicEvent.setDate("February 30");
        mMusicEvent.setTime("4:20 PM");
        mMusicEvent.setLocation("Los Angeles Convention Center");
        mMusicEvent.setAddress1("1201 S Figueroa St.");
        mMusicEvent.setAddress2("Los Angeles, CA");
        mMusicEvent.setImageName("testingName.jpeg");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void getTitle() throws Exception {
        assertEquals("Test", mMusicEvent.getTitle());
    }

    @Test
    public void getDate() throws Exception {
        assertEquals("February 30", mMusicEvent.getDate());
    }

    @Test
    public void getDay() throws Exception {
        assertEquals("Caturday", mMusicEvent.getDay());
    }

    @Test
    public void getTime() throws Exception {
        assertEquals("4:20 PM", mMusicEvent.getTime());
    }

    @Test
    public void getLocation() throws Exception {
        assertEquals("Los Angeles Convention Center", mMusicEvent.getLocation());
    }

    @Test
    public void getAddress1() throws Exception {
        assertEquals("1201 S Figueroa St.", mMusicEvent.getAddress1());
    }

    @Test
    public void getAddress2() throws Exception {
        assertEquals("Los Angeles, CA", mMusicEvent.getAddress2());
    }

    @Test
    public void getImageName() throws Exception {
        assertEquals("testingName.jpeg", mMusicEvent.getImageName());
    }

}