import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import react.useEffectOnce
import react.useState

val flow = MutableStateFlow(0)

@JsExport
fun useHoge(): String {
    var hoge by useState(flow.value)

    useEffectOnce {
        GlobalScope.launch {
            flow.collect {
                hoge = it
            }
        }
    }

    return hoge.toString()
}

@JsExport
fun incrementValue() {
    console.warn("launched a coroutine!")
    flow.value++
}