package com.martinprice20.mymvitestapplication

class MovieMaker {

    val movieList: List<Movie>

    init {
        val movieOne = Movie("Blade Runner", "Ridley Scott", "1982")
        val movieTwo = Movie("The Godfather Part 2", " Francis Ford Coppola", "1974")
        val movieThree = Movie("The Big Chill", "Lawrence Kasdan,", "1983")
        val movieFour = Movie("The Sixth Sense", "M. Night Shyamalan", "1999")

        movieList = mutableListOf(movieOne, movieTwo, movieThree, movieFour)
    }

    fun getMovies(): List<Movie> {
        return movieList
    }

    data class Movie(
        val name: String,
        val director: String,
        val year: String
    )
}