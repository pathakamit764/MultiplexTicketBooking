package com.MTB.services;

import java.util.List;

import com.MTB.entites.Shows;

public interface ShowService {
	public Shows addShow(Shows show);
	public Shows getShowId(Integer showId);
	public List<Shows> getAllShows();

}
