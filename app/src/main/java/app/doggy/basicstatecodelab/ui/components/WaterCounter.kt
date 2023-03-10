package app.doggy.basicstatecodelab.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
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
  var count by rememberSaveable { mutableStateOf(0) }

  WaterCounter(
    count = count,
    onIncrement = { count++ },
    modifier = modifier,
  )
}

@Composable
private fun WaterCounter(
  count: Int,
  onIncrement: () -> Unit,
  modifier: Modifier = Modifier,
) {
  Column(modifier = modifier.padding(16.dp)) {
    if (count > 0) {
      Text(
        text = stringResource(
          id = R.string.water_counter_text,
          count,
        ),
      )
    }
    Button(
      onClick = onIncrement,
      enabled = count < 10,
      modifier = Modifier.padding(top = 8.dp),
    ) {
      Text(text = stringResource(id = R.string.add_button_text))
    }
  }
}

@Preview
@Composable
private fun WaterCountPreview() {
  BasicStateCodelabTheme {
    Surface {
      WaterCounter(
        count = 0,
        onIncrement = {},
      )
    }
  }
}
