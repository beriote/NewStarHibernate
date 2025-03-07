package eski.models;

import eski.databases.*;


public class DatabaseModel {
	private static DatabaseModel databaseModel=new DatabaseModel();
	private DatabaseModel(){}
	public static DatabaseModel getInstance(){
		return databaseModel;
	}
	public FutbolcuDB futbolcuDataBase=FutbolcuDB.getInstance();
	public HakemDB hakemDataBase= HakemDB.getInstance();
	public KulupDB kulupDataBase=KulupDB.getInstance();
	public LigDB ligDataBase=LigDB.getInstance();
	public MenajerDB menajerDataBase=MenajerDB.getInstance();
	public MusabakaDB musabakaDataBase=MusabakaDB.getInstance();
	public StadyumDB stadyumDataBase=StadyumDB.getInstance();
	public IstatistikDB istatistikDataBase=IstatistikDB.getInstance();
}