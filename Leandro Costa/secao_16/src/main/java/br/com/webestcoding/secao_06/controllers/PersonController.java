package br.com.webestcoding.secao_06.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.webestcoding.secao_06.data.vo.v1.PersonVO;
import br.com.webestcoding.secao_06.services.PersonServices;
import br.com.webestcoding.secao_06.util.MediaType;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/person/v1")
@Tag(name = "Pessoas", description = "Gerenciamento de pessoas")
// @CrossOrigin
public class PersonController {
    private PersonServices service;

    public PersonController(PersonServices service) {
        this.service = service;
    }

    @Operation(
        summary = "Encontrando todas as pessoas",
        description = "Encontrando todas as pessoas",
        tags = {"Pessoas"},
        responses = {
            @ApiResponse(
                description = "Ok",
                responseCode = "200",
                content = {
                    @Content(
                        mediaType = "application/json",
                        array = @ArraySchema(
                            schema = @Schema(
                                implementation = PersonVO.class
                            )
                        )
                    ),
                    @Content(
                        mediaType = "application/xml",
                        array = @ArraySchema(
                            schema = @Schema(
                                implementation = PersonVO.class
                            )
                        )
                    ),
                    @Content(
                        mediaType = "application/yaml",
                        array = @ArraySchema(
                            schema = @Schema(
                                implementation = PersonVO.class
                            )
                        )
                    )
                }
            ),
            @ApiResponse(description = "Bad Request", responseCode = "400", content = {@Content}),
            @ApiResponse(description = "Unauthenticated", responseCode = "401", content = {@Content}),
            @ApiResponse(description = "Forbiden", responseCode = "403", content = {@Content}),
            @ApiResponse(description = "Not Found", responseCode = "404", content = {@Content}),
            @ApiResponse(description = "Internal Server Error", responseCode = "500", content = {@Content}),
        }
    )
    @GetMapping(produces = { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.APPLICATION_YML })
    public List<PersonVO> findAll() {
        return service.findAll();
    }
    
    @PostMapping(produces = { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.APPLICATION_YML }, consumes = { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.APPLICATION_YML })
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Adds a new Person",
		description = "Adds a new Person by passing in a JSON, XML or YML representation of the person!",
		tags = {"Pessoa"},
		responses = {
			@ApiResponse(description = "Success", responseCode = "200",
				content = @Content(schema = @Schema(implementation = PersonVO.class))
			),
			@ApiResponse(description = "Bad Request", responseCode = "400", content = @Content),
			@ApiResponse(description = "Unauthorized", responseCode = "401", content = @Content),
			@ApiResponse(description = "Internal Error", responseCode = "500", content = @Content),
		}
	)
    public PersonVO create(@RequestBody PersonVO person) {
        return service.create(person);
    }

    @GetMapping(value = "/{id}", produces = { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.APPLICATION_YML })
    @Operation(
        summary = "Encontrando uma pessoa por id",
        description = "Encontrando uma as pessoas por id",
        tags = {"Pessoa"},
        responses = {
            @ApiResponse(
                description = "Ok",
                responseCode = "200",
                content = {
                    @Content(
                        mediaType = "application/json",
                        schema = @Schema(
                            implementation = PersonVO.class
                        )
                    ),
                    @Content(
                        mediaType = "application/xml",
                        schema = @Schema(
                            implementation = PersonVO.class
                        )
                    ),
                    @Content(
                        mediaType = "application/yaml",
                        schema = @Schema(
                            implementation = PersonVO.class
                        )
                    )
                }
            ),
            @ApiResponse(description = "No Content", responseCode = "204", content = {@Content}),
            @ApiResponse(description = "Bad Request", responseCode = "400", content = {@Content}),
            @ApiResponse(description = "Unauthenticated", responseCode = "401", content = {@Content}),
            @ApiResponse(description = "Forbiden", responseCode = "403", content = {@Content}),
            @ApiResponse(description = "Not Found", responseCode = "404", content = {@Content}),
            @ApiResponse(description = "Internal Server Error", responseCode = "500", content = {@Content}),
        }
    )
    public PersonVO findById(@PathVariable("id") Long id) {
        return service.findById(id);
    }

    @PutMapping(value = "/{id}", produces = { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.APPLICATION_YML }, consumes = { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.APPLICATION_YML })
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Updates a Person",
		description = "Updates a Person by passing in a JSON, XML or YML representation of the person!",
		tags = {"Pessoa"},
		responses = {
			@ApiResponse(description = "Updated", responseCode = "200",
				content = @Content(schema = @Schema(implementation = PersonVO.class))
			),
			@ApiResponse(description = "Bad Request", responseCode = "400", content = @Content),
			@ApiResponse(description = "Unauthorized", responseCode = "401", content = @Content),
			@ApiResponse(description = "Not Found", responseCode = "404", content = @Content),
			@ApiResponse(description = "Internal Error", responseCode = "500", content = @Content),
		}
	)
    public PersonVO update(@PathVariable("id") Long id, @RequestBody PersonVO person) {
        return service.update(id, person);
    }
    
    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @Operation(summary = "Deletes a Person",
		description = "Deletes a Person by passing in a JSON, XML or YML representation of the person!",
		tags = {"Pessoa"},
		responses = {
			@ApiResponse(description = "No Content", responseCode = "204", content = @Content),
			@ApiResponse(description = "Bad Request", responseCode = "400", content = @Content),
			@ApiResponse(description = "Unauthorized", responseCode = "401", content = @Content),
			@ApiResponse(description = "Not Found", responseCode = "404", content = @Content),
			@ApiResponse(description = "Internal Error", responseCode = "500", content = @Content),
		}
	)
    public void delete(@PathVariable("id") Long id) {
        service.delete(id);
    }
}
