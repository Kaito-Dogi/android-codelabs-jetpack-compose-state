package app.doggy.basicstatecodelab.domain.model

import androidx.annotation.StringRes

internal data class WellnessTask(
  val id: Int,
  @StringRes val resId: Int,
)
