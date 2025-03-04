package SoccerApp.service;

import SoccerApp.entity.mainEntity.Stadium;
import SoccerApp.repository.StadiumRepository;

public class StadiumService extends BaseService<Stadium,Long> {
	private static StadiumService instance;

	public static StadiumService getInstance() {
		if (instance == null) {
			instance = new StadiumService();
		}
		return instance;
	}
	private StadiumService() {
		super(StadiumRepository.getInstance());
	}
}