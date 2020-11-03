package m2i.tp11Streams;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface GagnantsMapper {
	GagnantsMapper INSTANCE = Mappers.getMapper(GagnantsMapper.class);

	@Mapping(source = "kilometres", target = "kilometresDto")
	GagnantsDTO asDTO(Gagnants d);
}