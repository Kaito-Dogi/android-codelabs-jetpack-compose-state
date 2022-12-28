package app.doggy.basicstatecodelab.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import app.doggy.basicstatecodelab.R
import app.doggy.basicstatecodelab.ui.theme.BasicStateCodelabTheme

@Composable
internal fun WaterCounter(
  modifier: Modifier = Modifier,
) {
  val count = 0
  Text(
    text = stringResource(
      id = R.string.water_count,
      count,
    ),
    modifier = modifier.padding(16.dp),
  )
}

@Preview
@Composable
private fun WaterCountPreview() {
  BasicStateCodelabTheme {
    Surface {
      WaterCounter()
    }
  }
}
