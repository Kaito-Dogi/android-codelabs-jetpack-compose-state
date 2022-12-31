package app.doggy.basicstatecodelab.domain.model

import androidx.annotation.StringRes
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

internal class WellnessTask(
  val id: Int,
  @StringRes val resId: Int,
  initialChecked: Boolean = false,
) {
  var checked by mutableStateOf(initialChecked)
}
