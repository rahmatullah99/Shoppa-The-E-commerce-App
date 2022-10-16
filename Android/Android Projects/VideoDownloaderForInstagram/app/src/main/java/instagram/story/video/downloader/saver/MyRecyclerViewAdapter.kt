package instagram.story.video.downloader.saver

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

public class MyRecyclerViewAdapter
    (val fruitsList:List<Fruit>,
     val clicked:(Fruit)->Unit)
    : RecyclerView.Adapter<MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val layoutinflator = LayoutInflater.from(parent.context)
        val listitem = layoutinflator.inflate(R.layout.list_item,parent,false)
        return MyViewHolder(listitem)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val fruit = fruitsList[position]
        holder.bind(fruit, clicked)
    }

    override fun getItemCount(): Int {
        return fruitsList.size
    }
}

class MyViewHolder(val view:View):RecyclerView.ViewHolder(view){

    fun bind(fruit:Fruit, clicked: (Fruit) -> Unit){
        val fruitname= view.findViewById<TextView>(R.id.textView3)
        val suppliername= view.findViewById<TextView>(R.id.textView4)

        fruitname.setText(fruit.name)
        suppliername.setText(fruit.supplier)

        fruitname.setOnClickListener {
            clicked(fruit)
        }

    }
}