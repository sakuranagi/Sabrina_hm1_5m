package mbk.io.sabrina_hm1_5m

class CounterModel {
    var count = 0
    var isVisible = true

    fun inc(){
        count++
    }

    fun dec(){
        count--
    }

    fun changeVisibility(isVisible : Boolean){
        this.isVisible = isVisible
    }
}