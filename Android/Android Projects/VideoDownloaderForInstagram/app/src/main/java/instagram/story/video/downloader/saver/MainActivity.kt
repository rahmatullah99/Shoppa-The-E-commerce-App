package instagram.story.video.downloader.saver

import android.content.SharedPreferences
import android.media.MediaController2
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.*
import androidx.core.content.ContextCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.net.URI

class MainActivity : AppCompatActivity() {

//    private lateinit var etName:EditText
//    private lateinit var etSubmit: Button
//    private lateinit var tv: TextView
//    private lateinit var sp:SharedPreferences
//    private lateinit var runnable: Runnable
//    private lateinit var handler: Handler
//    private var mediaPlayer: MediaPlayer? = null
//    private lateinit var seekBar: SeekBar
//    private lateinit var videoView: VideoView
//    private lateinit var ediText:SharedPreferences.Editor
//    private lateinit var viewModel: MAViewModel
//    private lateinit var countBtn :Button
//    private lateinit var countText : TextView
      private lateinit var recyclerView: RecyclerView

    var count=0

    val fruitsList = listOf<Fruit>(
    Fruit("Mango", "Joe"),
    Fruit("Guavava","Frank"),
    Fruit("Guavava","Frank"),
    Fruit("Guavava","Frank"),
    Fruit("Guavava","Frank"),
    Fruit("Guavava","Frank"),
    Fruit("Guavava","Frank"),
    Fruit("Guavava","Frank"),
    Fruit("Guavava","Frank"),
        Fruit("Guavava","Frank"),
        Fruit("Guavava","Frank"),
        Fruit("Guavava","Frank"),
        Fruit("Guavava","Frank"),
        Fruit("Guavava","Frank"),
        Fruit("Guavava","Frank"),
        Fruit("Guavava","Frank"),
        Fruit("Guavava","Frank"),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerview)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.adapter = MyRecyclerViewAdapter(fruitsList)
        { selectedItem: Fruit -> listItemClicked(selectedItem) }


//        viewModel=ViewModelProvider(this).get(MAViewModel::class.java)
//
//        countText = findViewById(R.id.textView)
//        countBtn = findViewById(R.id.button)

      /*  etName = findViewById(R.id.etPersonName)
        handler = Handler(Looper.getMainLooper())
        tv = findViewById(R.id.textView2)
        seekBar =findViewById(R.id.seekBar)
        videoView = findViewById(R.id.videoView)


        sp = getSharedPreferences("name", MODE_PRIVATE)
        ediText = sp.edit()

        tv.setTextColor(ContextCompat.getColor(this,R.color.purple_700))

        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)

//        if(mediaPlayer==null){
//            mediaPlayer = MediaPlayer.create(this,R.raw.sound)
//            seekBarInitialize()
//            mediaPlayer!!.start()
//        }*/


        //viewmodel
//        countText.text = viewModel.count.toString()
//
//        countBtn.setOnClickListener{
//            viewModel.updateCount()
//            countText.text = viewModel.count.toString()
//        }

        //livedata
//        viewModel.count.observe(this, Observer { countText.text = it.toString() })
//
//        countBtn.setOnClickListener{
//            viewModel.updateCount()
//        }

    }



    private fun listItemClicked(fruit:Fruit){
        Toast.makeText(this,"Clicked on ${fruit.name} from Main",Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()

//        val name = etName.text.toString()
//
//        ediText.apply{
//            putString("etName", name)
//            commit()
//        }
    }

    override fun onResume() {
        super.onResume()
//        val name = sp.getString("etName",null)
//
//        if(name!=null) {
//            etName.setText(name)
//        }

    }

    private fun seekBarInitialize(){
//        seekBar.setOnSeekBarChangeListener(object:SeekBar.OnSeekBarChangeListener{
//            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
//                if(fromUser) mediaPlayer?.seekTo(progress)
//            }
//
//            override fun onStartTrackingTouch(p0: SeekBar?) {
//
//            }
//
//            override fun onStopTrackingTouch(p0: SeekBar?) {
//
//            }
//
//        })
//
//        seekBar.max = mediaPlayer!!.duration
//
//        runnable = Runnable {
//
//            seekBar.progress = mediaPlayer!!.currentPosition
//            handler.postDelayed(runnable,1000)
//
//        }
//
//        handler.postDelayed(runnable,1000)

    }


}