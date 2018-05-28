package semana09.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import semana09.entidad.Autor;
import semana09.entidad.Genero;
import semana09.entidad.Libro;

@Service
public interface ILibroService {

	public List<Libro> listado();
	
	public boolean agregar(Libro obj);
	
	public boolean eliminar(int id);
	
	public Optional<Libro> buscarPorID(int id);
	
	public boolean actualizar(Libro obj);
	
	public void saveImage(MultipartFile file);
	
	public void deleteImage(int id);
	
}
