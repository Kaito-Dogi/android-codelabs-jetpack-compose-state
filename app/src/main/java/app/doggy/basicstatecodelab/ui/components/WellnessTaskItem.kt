package app.doggy.basicstatecodelab.ui.components

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Checkbox
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import app.doggy.basicstatecodelab.R
import app.doggy.basicstatecodelab.ui.theme.BasicStateCodelabTheme

@Composable
internal fun WellnessTaskItem(
  @StringRes taskResId: Int,
  modifier: Modifier = Modifier,
) {
  var checked by remember { mutableStateOf(false) }

  WellnessTaskItem(
    taskResId = taskResId,
    checked = checked,
    onCheckedChange = { newValue -> checked = newValue },
    onCloseButtonClick = {},
  )
}

@Composable
private fun WellnessTaskItem(
  @StringRes taskResId: Int,
  checked: Boolean,
  onCheckedChange: (Boolean) -> Unit,
  onCloseButtonClick: () -> Unit,
  modifier: Modifier = Modifier,
) {
  Row(
    modifier = modifier,
    verticalAlignment = Alignment.CenterVertically,
  ) {
    Text(
      text = stringResource(id = taskResId),
      modifier = Modifier
        .weight(1f)
        .padding(start = 16.dp),
    )
    Checkbox(
      checked = checked,
      onCheckedChange = onCheckedChange,
    )
    IconButton(onClick = onCloseButtonClick) {
      Icon(
        imageVector = Icons.Filled.Close,
        contentDescription = stringResource(id = R.string.close_button_description),
      )
    }
  }
}

@Preview
@Composable
private fun WellnessTaskItemPreview() {
  BasicStateCodelabTheme {
    Surface {
      WellnessTaskItem(
        taskResId = R.string.wellness_task_item_text,
        checked = false,
        onCheckedChange = {},
        onCloseButtonClick = {},
      )
    }
  }
}
