package youtubeDownloader.download_video;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
	
	App app;
	
	@Before
    public void setup()
    {
        app = new App();
        
    }


    /**
     * Rigourous Test :-)
     */
	@Test
    public void testApp()
    {
		assertNotNull(app);
		
    }
	
	@Test
	public void download(){
		String url = "https://www.youtube.com/watch?v=MLfL1NpwUC4";
		String path = "/Users/aksinghdce/Movies/Tech_Articles";
		app.run(url, path);
	}
}
