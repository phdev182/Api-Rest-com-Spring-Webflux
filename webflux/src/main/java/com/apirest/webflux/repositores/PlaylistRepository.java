package com.apirest.webflux.repositores;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.apirest.webflux.document.Playlist;

public interface PlaylistRepository extends ReactiveMongoRepository<Playlist, String>{

}
