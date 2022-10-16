package instagram.story.video.downloader.saver

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MAViewModel : ViewModel() {

 var count= MutableLiveData<Int>()

    init {
        count.value=0
    }

    fun updateCount(){
        count.value= (count.value)?.plus(1)
    }

}