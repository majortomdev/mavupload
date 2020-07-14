/*by JoeK 14/07/20*/
package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import models.Video;
import services.VideoService;

@RestController
public class VideoController {
	
	@Autowired
	private VideoService videoService;
	
	@GetMapping("/api/video")
	public ResponseEntity<List<Video>> list() {
		List<Video> list = videoService.list();
		return ResponseEntity.ok().body(list);
	}

}
