package app.doggy.basicstatecodelab.ui.screens

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import app.doggy.basicstatecodelab.R
import app.doggy.basicstatecodelab.domain.model.WellnessTask

internal class WellnessViewModel : ViewModel() {
  private val _tasks = getWellnessTasks().toMutableStateList()
  val tasks: List<WellnessTask>
    get() = _tasks

  fun onCloseButtonClick(task: WellnessTask) {
    _tasks.remove(task)
  }

  fun onCheckedChanged(task: WellnessTask, checked: Boolean) {
    tasks.find { it.id == task.id }?.let {
      task.checked = checked
    }
  }
}

private fun getWellnessTasks() = List(30) { i ->
  WellnessTask(
    id = i,
    resId = R.string.task_text,
  )
}
