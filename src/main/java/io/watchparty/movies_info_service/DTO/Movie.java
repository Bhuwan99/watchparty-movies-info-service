package io.watchparty.movies_info_service.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Movie {
	private String movieId;
	private String name;

}
