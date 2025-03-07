package SoccerApp.service;

import SoccerApp.utility.icrud.ICRUD;
import SoccerApp.utility.icrud.ICRUDService;

import java.util.List;
import java.util.Optional;

public class BaseService<T,ID> implements ICRUDService<T,ID> {
	protected final ICRUD<T, ID> repository;
	
	public BaseService(ICRUD<T, ID> repository) {
		this.repository = repository;
	}
	
	
	@Override
	public T save(T entity) {
		return repository.save(entity);
	}
	
	@Override
	public Iterable<T> saveAll(Iterable<T> entities) {
		return repository.saveAll(entities);
	}
	
	@Override
	public void update(T entity) {
		repository.update(entity);
	}
	
	@Override
	public void updateAll(Iterable<T> entities) {
		repository.updateAll(entities);
	}
	
	@Override
	public Boolean deleteById(ID id) {
		return repository.deleteById(id);
	}
	
	@Override
	public Optional<T> findById(ID id) {
		return repository.findById(id);
	}
	
	@Override
	public Boolean existById(ID id) {
		return repository.existById(id);
	}
	
	@Override
	public List<T> findAll() {
		return repository.findAll();
	}
	
	@Override
	public List<T> findByFieldNameAndValue(String fieldName, Object value) {
		return repository.findByFieldNameAndValue(fieldName,value);
	}
	
	@Override
	public List<T> findByFilledFields(T entity) {
		return repository.findByFilledFields(entity);
	}
}