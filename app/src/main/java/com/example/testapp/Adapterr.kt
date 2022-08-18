package com.example.testapp

import android.graphics.BitmapFactory
import android.util.Base64
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView


class Adapterr(val imgs: List<ImageObj>) : RecyclerView.Adapter<Adapterr.Itemm>() {

    class Itemm(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val big = itemView.findViewById<ImageView>(R.id.rvImg)
        val small = itemView.findViewById<ImageView>(R.id.small)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Itemm {
        return Itemm(View.inflate(parent.context, R.layout.rv_item, null))
    }

    override fun onBindViewHolder(holder: Itemm, position: Int) {
        val item = imgs.get(position)
        setImgTo(item.offerImage, holder.big)
        setImgTo(item.logoImage, holder.small)
    }

    override fun getItemCount() = imgs.size

    fun setImgTo(im: String, iv: ImageView) {
        val imageBytes = Base64.decode(im, Base64.DEFAULT)
        val decodedImage = BitmapFactory.decodeByteArray(imageBytes, 0, imageBytes.size)
        iv.setImageBitmap(decodedImage)
    }
}