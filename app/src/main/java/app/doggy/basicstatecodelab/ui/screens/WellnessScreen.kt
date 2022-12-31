package app.doggy.basicstatecodelab.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import app.doggy.basicstatecodelab.ui.components.WaterCounter
import app.doggy.basicstatecodelab.ui.components.WellnessTaskList
import app.doggy.basicstatecodelab.ui.theme.BasicStateCodelabTheme

@Composable
internal fun WellnessScreen(
  modifier: Modifier = Modifier,
) {
  Column(modifier = modifier) {
    WaterCounter()
    WellnessTaskList()
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
