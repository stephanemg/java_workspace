package m2i.tpdates;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// recuperation des fuseaux horaires
		Set<String> zones = ZoneId.getAvailableZoneIds();
		zones.stream().forEach(System.out::println);

		// decalage d'heure
		ZoneOffset zoneOffset = ZoneOffset.ofHours(-1);
		OffsetDateTime offsetDateTime = OffsetDateTime.of(LocalDateTime.now(), zoneOffset);
		System.out.println(offsetDateTime);

		// formattage
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
		LocalDateTime localDateTimeFromFormatter = LocalDateTime.parse("2020/10/12 12:12", dateTimeFormatter);
		System.out.println(localDateTimeFromFormatter);
//on doit construire un objet local datetime complet et ensuite on peut appauvrir le format
		LocalDateTime otherLocalDateTime = LocalDateTime.now();
		System.out.println(otherLocalDateTime.format(DateTimeFormatter.ISO_DATE));
		

		//mesure entre dates avec les offsetdatetime (decalage 10 jours)
		OffsetDateTime otherOffsetDateTime = OffsetDateTime.now();
		OffsetDateTime datePlus = otherOffsetDateTime.plusDays(10);
		
		Duration duration = Duration.between(datePlus, offsetDateTime);
		System.out.println(duration.toDays());
	}

}
