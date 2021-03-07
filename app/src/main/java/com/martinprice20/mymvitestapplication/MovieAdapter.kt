package com.martinprice20.mymvitestapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MovieAdapter(private val listener: ItemListener) :
RecyclerView.Adapter<MovieAdapter.ViewHolder>()
{
    var data = listOf<MovieMaker.Movie>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    init {

    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView
        val director: TextView
        val year: TextView

        init {
            name = itemView.findViewById(R.id.movie_name)
            director = itemView.findViewById(R.id.movie_director)
            year = itemView.findViewById(R.id.movie_year)
        }
    }

   interface ItemListener {
       fun onItemClick(movie: MovieMaker.Movie)
   }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.movie_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.text = data[position].name
        holder.director.text = data[position].director
        holder.year.text = data[position].year
        holder.itemView.setOnClickListener{listener.onItemClick(data[position])}
    }

    override fun getItemCount(): Int {
        return data.size
    }
}