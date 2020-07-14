/*made by JoeKin 14-jul-20*/
package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.VideoDAO;
import models.Video;

@Service
public class VideoServiceImpl implements VideoService {
	
	@Autowired
	private VideoDAO videoDAO;

	@Transactional
	public long save(Video video) {
		return videoDAO.save(video);
	}

	@Transactional
	public Video get(Long id) {
		return videoDAO.get(id);
	}

	@Transactional
	public List<Video> list() {
		return videoDAO.list();
	}

	@Transactional
	public void update(long id, Video video) {
		// TODO Auto-generated method stub
		
	}
	@Transactional
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

}
