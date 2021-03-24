package Assignment2Q1;

import java.security.KeyException;
import java.security.KeyStoreException;

public interface ObjectInterface<T> {
	public void store(T t);

	public T retrieve(long id) ;

	

	public T delete(int id);

}
