package mbk.io.sabrina_hm1_5m

import android.graphics.Color

class Presenter {
    private var model = Injector.getModel()
    private lateinit var view: CounterView

    fun increment() {
        model.inc()
        view.showCount(model.count)

        if (model.count == 10){
            view.showToast("Поздравляем!")
        }else if(model.count == 15){
            view.changeTextColor(Color.GREEN)
        }
    }

    fun decrement(){
        model.dec()
        view.showCount(model.count)

        if (model.count == 10){
            view.showToast("Поздравляем!")
        }else if(model.count < 15){
            view.changeTextColor(Color.BLACK)
        }
    }

    fun changeVisible(){
        if (model.isVisible){
            model.changeVisibility(false)
        }else{
            model.changeVisibility(true)
        }
        view.changedVisible(model.isVisible)
    }


    fun attachView(view: CounterView) {
        this.view = view
    }
}