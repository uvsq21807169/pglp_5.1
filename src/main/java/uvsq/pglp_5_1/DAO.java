package uvsq.pglp_5_1;

public interface DAO<T> {
	
	public T create (T obj );
	public T read (  ) ;
	public T update (T obj ) ;
	public void delete (T obj ) ;
	
}
