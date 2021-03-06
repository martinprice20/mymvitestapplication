package com.martinprice20.mymvitestapplication.views.search_results_view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.martinprice20.mymvitestapplication.MovieMaker
import com.martinprice20.mymvitestapplication.R

class MovieAdapter(private val listener: ItemListener) :
RecyclerView.Adapter<MovieAdapter.ViewHolder>()
{
    var data = listOf<MovieMaker.Movie>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.movie_name)
        val director: TextView = itemView.findViewById(R.id.movie_director)
        val year: TextView = itemView.findViewById(R.id.movie_year)
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