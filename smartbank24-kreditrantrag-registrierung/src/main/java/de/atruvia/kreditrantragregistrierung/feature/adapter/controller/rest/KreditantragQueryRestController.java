package de.atruvia.kreditrantragregistrierung.feature.adapter.controller.rest;


import de.atruvia.kreditrantragregistrierung.feature.adapter.dto.KreditantragDTO;
import de.atruvia.kreditrantragregistrierung.feature.adapter.mapper.KreditantragDTOMapper;
import de.atruvia.kreditrantragregistrierung.feature.domain.services.KreditantragService;
import de.atruvia.kreditrantragregistrierung.feature.domain.services.KreditantragServiceException;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/v1/kreditantraege")
@AllArgsConstructor
public class KreditantragQueryRestController {
    private final KreditantragService kreditantragService;
    private final KreditantragDTOMapper mapper;

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<KreditantragDTO> findAntragByID(@PathVariable String id) throws KreditantragServiceException {
        return ResponseEntity.of(kreditantragService.findById(id).map(mapper::convert));
    }
    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Iterable<KreditantragDTO>> findAll()  throws KreditantragServiceException {
        return ResponseEntity.ok(mapper.convert(kreditantragService.findAll()));
    }


}

