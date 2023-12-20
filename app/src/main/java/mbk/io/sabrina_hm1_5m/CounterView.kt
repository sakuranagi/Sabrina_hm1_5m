package mbk.io.sabrina_hm1_5m

import android.graphics.Color
import android.webkit.ConsoleMessage

interface CounterView {
    fun showCount(count: Int)
    fun changedVisible(isVisible: Boolean)
    fun showToast(message: String)
    fun changeTextColor(color: Int)
}