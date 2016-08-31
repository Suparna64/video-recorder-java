package test;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

import java.io.IOException;

import static com.automation.remarks.video.recorder.VideoRecorder.conf;

/**
 * Created by sepi on 19.07.16.
 */
public class BaseTest {

    @BeforeClass
    public static void setUp() throws IOException {
        FileUtils.deleteDirectory(conf().getVideoFolder());
    }

    @After
    public void tearDown() throws Exception {
        //setUp();
    }
}
