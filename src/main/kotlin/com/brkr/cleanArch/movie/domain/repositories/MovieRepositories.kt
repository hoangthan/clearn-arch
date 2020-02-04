package com.brkr.cleanArch.movie.domain.repositories

import com.brkr.cleanArch.movie.domain.entities.Movie

interface MovieRepositories {
    fun insert(movie: Movie): Boolean
    fun deleteMovie(id: String): Boolean
    fun updateMovie(movie: Movie): Boolean
    fun searchMovie(name: String): List<Movie>
    fun getTopPopular(): List<Movie>
}