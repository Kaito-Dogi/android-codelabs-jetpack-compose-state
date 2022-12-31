package app.doggy.basicstatecodelab.ui.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import app.doggy.basicstatecodelab.R
import app.doggy.basicstatecodelab.domain.model.WellnessTask

@Composable
internal fun WellnessTaskList(
  list: List<WellnessTask>,
  onCloseButtonClick: (WellnessTask) -> Unit,
  modifier: Modifier = Modifier,
) {
  LazyColumn(
    modifier = modifier,
  ) {
    items(
      items = list,
      key = { task -> task.id },
    ) { task ->
      WellnessTaskItem(
        taskId = task.id,
        taskResId = task.resId,
        onCloseButtonClick = { onCloseButtonClick(task) },
      )
    }
  }
}

internal fun getWellnessTasks() = List(30) { i ->
  WellnessTask(
    id = i,
    resId = R.string.task_text,
  )
}

@Preview
@Composable
private fun WellnessTaskListPreview() {
  WellnessTaskList(
    list = getWellnessTasks(),
    onCloseButtonClick = {},
  )
}
