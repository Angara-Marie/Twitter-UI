package dev.angara.twitter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TwitterRvAdapter(var detailsList: List<Details>):
    RecyclerView.Adapter<DetailsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailsViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.twitter_list_item, parent, false)
        return DetailsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: DetailsViewHolder, position: Int) {
        var currentDetails=detailsList.get(position)
        holder.tvName.text=currentDetails.name
        holder.tvHandle.text=currentDetails.handle
        holder.tvTweet.text=currentDetails.tweet

    }

    override fun getItemCount(): Int {
        return detailsList.size
    }
}

    class DetailsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var tvName = itemView.findViewById<TextView>(R.id.tvName)
        var tvHandle = itemView.findViewById<TextView>(R.id.tvHandle)
        var tvTweet = itemView.findViewById<TextView>(R.id.tvTweet)
        var imgComment = itemView.findViewById<ImageView>(R.id.imgComment)
        var imgRetweet = itemView.findViewById<ImageView>(R.id.imgRetweet)
        var imgShare = itemView.findViewById<ImageView>(R.id.imgShare)
        var imgLike = itemView.findViewById<ImageView>(R.id.imgLike)
}