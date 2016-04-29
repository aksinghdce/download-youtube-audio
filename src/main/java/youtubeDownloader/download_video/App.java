package youtubeDownloader.download_video;


import java.io.File;
import java.net.URL;

import com.github.axet.vget.VGet;
/**
 * Hello world!
 *
 */
public class App 
{
	
	
    public void run(String url, String path){
    	try{
        	VGet v = new VGet(new URL(url), new File(path));
            v.download();
            }catch (Exception e){
            	throw new RuntimeException(e);
            }
    }
    
	public static void main( String[] args )
    {
		String url = args[1];
        String path = args[2];
        App app = new App();
        app.run(url,  path);
    }
}
