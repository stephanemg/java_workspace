package m2i.tp11Streams;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GagnantsDTO {
	private int annee;
	private String nationalite;
	private String nom;
	private String equipe;
	private int kilometresDto;
	private Duration temps;
	private int joursenjaune;

	
	@Override
	public String toString() {
		return nom + " " + annee;
	}
}
