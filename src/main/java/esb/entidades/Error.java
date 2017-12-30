package esb.entidades;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Errores")
public class Error {

    @Id
    private String id;

    private String descripcionError;

    public Error() {

    }

    public Error(String id, String descripcionError) {
	super();
	this.id = id;
	this.descripcionError = descripcionError;
    }

    public String getId() {
	return id;
    }

    public void setId(String id) {
	this.id = id;
    }

    public String getDescripcionError() {
	return descripcionError;
    }

    public void setDescripcionError(String descripcionError) {
	this.descripcionError = descripcionError;
    }

    @Override
    public String toString() {
	return "Error [id=" + id + ", descripcionError=" + descripcionError + "]";
    }

}
