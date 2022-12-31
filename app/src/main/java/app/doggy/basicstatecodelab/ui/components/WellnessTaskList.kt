package app.doggy.basicstatecodelab.ui.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import app.doggy.basicstatecodelab.R
import app.doggy.basicstatecodelab.domain.model.WellnessTask

@Composable
internal fun WellnessTaskList(
  modifier: Modifier = Modifier,
  list: List<WellnessTask> = remember { getWellnessTasks() },
) {
  LazyColumn(
    modifier = modifier,
  ) {
    items(list) { task ->
      WellnessTaskItem(
        taskId = task.id,
        taskResId = task.resId,
      )
    }
  }
}

private fun getWellnessTasks() = List(30) { i ->
  WellnessTask(
    id = i,
    resId = R.string.task_text,
  )
}
