package projectakhirOpenStory.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "karya")
public class KaryaModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nama;
	private String title;
	private String deskripsi;
	private String kategori;
	private String genre;
	private String file;
	@ManyToOne (cascade = CascadeType.MERGE)
	@JoinColumn(name = "idUser", referencedColumnName = "idUser")
	private UserModel idUser;
	
}
