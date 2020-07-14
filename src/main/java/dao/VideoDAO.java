/*made by JoeKin 14-jul-20*/
package dao;

import java.util.List;
import models.Video;

public interface VideoDAO {
	
	long save(Video video);
	
	Video get(long id);
	
	List<Video> list();
	
	void update(long id, Video video);
	
	void delete(long id);

}
