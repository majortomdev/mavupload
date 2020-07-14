package services;

import java.util.List;

import models.Video;

public interface VideoService {

		long save(Video video);
		
		Video get(Long id);
		
		List<Video> list();
		
		void update(long id, Video video);
		
		void delete(long id);
}
