package app.doggy.basicstatecodelab.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import app.doggy.basicstatecodelab.ui.components.WaterCounter
import app.doggy.basicstatecodelab.ui.components.WellnessTaskList
import app.doggy.basicstatecodelab.ui.theme.BasicStateCodelabTheme

@Composable
internal fun WellnessScreen(
  modifier: Modifier = Modifier,
  viewModel: WellnessViewModel = viewModel(),
) {
  Column(modifier = modifier) {
    WaterCounter()
    WellnessTaskList(
      list = viewModel.tasks,
      onCloseButtonClick = { task -> viewModel.onCloseButtonClick(task) },
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
