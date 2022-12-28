package app.doggy.basicstatecodelab.ui.screens

import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import app.doggy.basicstatecodelab.ui.components.WaterCounter
import app.doggy.basicstatecodelab.ui.theme.BasicStateCodelabTheme

@Composable
internal fun WellnessScreen(
  modifier: Modifier = Modifier,
) {
  WaterCounter(modifier = modifier)
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
