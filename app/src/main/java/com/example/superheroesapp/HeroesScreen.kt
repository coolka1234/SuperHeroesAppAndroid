package com.example.superheroesapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.superheroesapp.model.Hero

@Composable
fun SuperHeroCard(modifier: Modifier=Modifier,hero: Hero)
{
    Card(
        modifier = modifier
    ) {
        Row (
            modifier= modifier
                .padding(dimensionResource(id = R.dimen.padding_medium))
        ) {
            Column(
                modifier = modifier.weight(1f)
            ) {
                Text(
                    stringResource(id = hero.nameRes),
                    style = MaterialTheme.typography.headlineSmall
                )
                Text(
                    text = stringResource(id = hero.descriptionRes),
                    style = MaterialTheme.typography.labelLarge
                )
            }
            Box(modifier =modifier) {
                Image(
                    painter = painterResource(id = hero.imageRes),
                    modifier = modifier
                        .size(dimensionResource(id = R.dimen.image_size))
                        .clip(MaterialTheme.shapes.small),
                    contentDescription = stringResource(id = hero.nameRes),
                    contentScale = ContentScale.Crop
                )
            }
        }
    }
}