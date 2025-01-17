package ru.myapp.quizapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import ru.myapp.quizapp.databinding.ViewholderHourlyBinding
import ru.myapp.quizapp.model.HourlyModel

class HourlyAdapter(private val items: ArrayList<HourlyModel>) :
    RecyclerView.Adapter<HourlyAdapter.Viewholder>() {

        private lateinit var context: Context

    inner class Viewholder(val binding: ViewholderHourlyBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HourlyAdapter.Viewholder {
        context = parent.context
        val binding = ViewholderHourlyBinding.inflate(LayoutInflater.from(context), parent, false)
        return Viewholder(binding)
    }

    override fun onBindViewHolder(holder: HourlyAdapter.Viewholder, position: Int) {
        val item = items[position]
        holder.binding.apply {
            hourTxt.text = item.hour
            tempTxt.text = "${item.temp}"

            val drawableResourceId = holder.itemView.resources.getIdentifier(
                item.picPath,
                "drawable",
                context.packageName
            )

            Glide.with(context)
                .load(drawableResourceId)
                .into(pic)
        }
    }

    override fun getItemCount(): Int = items.size


}