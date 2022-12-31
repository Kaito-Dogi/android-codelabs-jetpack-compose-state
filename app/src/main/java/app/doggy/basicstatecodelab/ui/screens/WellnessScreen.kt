package app.doggy.basicstatecodelab.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import app.doggy.basicstatecodelab.ui.components.WaterCounter
import app.doggy.basicstatecodelab.ui.components.WellnessTaskList
import app.doggy.basicstatecodelab.ui.components.getWellnessTasks
import app.doggy.basicstatecodelab.ui.theme.BasicStateCodelabTheme

@Composable
internal fun WellnessScreen(
  modifier: Modifier = Modifier,
) {
  Column(modifier = modifier) {
    WaterCounter()

    val list = remember { getWellnessTasks().toMutableStateList() }
    WellnessTaskList(
      list = list,
      onCloseButtonClick = { task -> list.remove(task) },
    )
  }
}

@Preview
@Composable
private fun WellnessScreenPreview() {
  BasicStateCodelabTheme {
    Surface {
      WellnessScreen()
    }
  }
}
