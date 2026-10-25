package com.kampplus.hava.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

/**
 * Açık tema paleti. Her Material rolü ([Color.kt]'deki) bir renge bağlanır:
 * `primary` ana vurgu, `surface` kart zemini, `onSurface` o zemindeki yazı rengidir.
 */
private val LightColors = lightColorScheme(
    primary = Teal40,                    //Ana Vurgu Rengi
    onPrimary = Neutral99,               //Ana Vurgu Üzeri Rengi
    primaryContainer = Teal90,           //Ana Vurgu Kutusu Rengi
    onPrimaryContainer = Teal10,         //Ana Vurgu Kutusu Üzeri Rengi
    secondary = Amber40,                 //İkincil Vurgu Rengi
    secondaryContainer = Amber90,        //İkincil Vurgu Kutusu Rengi
    background = Neutral99,              //Ekran Arka Plan Rengi
    onBackground = Neutral10,            //Ekran Arka Planı Üzeri Rengi
    surface = Neutral99,                 //Yüzey / Kart Rengi
    onSurface = Neutral10,               //Yüzey Üzeri Rengi
    surfaceVariant = NeutralVariant90,   //Alternatif Yüzey Rengi
    onSurfaceVariant = NeutralVariant30, //Alternatif Yüzey Üzeri Rengi
    surfaceContainer = Neutral95,        //Yüzey Kapsayıcısı Rengi
    error = Red40                        //Hata Rengi
)

/** Koyu tema paleti. Aynı roller, koyu zemine uygun tonlarla. */
private val DarkColors = darkColorScheme(
    primary = Teal80,
    onPrimary = Teal20,
    primaryContainer = Teal30,
    onPrimaryContainer = Teal90,
    secondary = Amber80,
    background = Neutral10,
    onBackground = Neutral90,
    surface = Neutral10,
    onSurface = Neutral90,
    onSurfaceVariant = NeutralVariant90,
    error = Red80
)

/**
 * Uygulamanın teması. Bütün ekranlar bunun içine sarmalanır.
 *
 * @param darkTheme Varsayılan olarak telefonun sistem ayarını izler
 *   ([isSystemInDarkTheme]). @Preview'larda elle `true` verip koyu temayı deneyebilirsin.
 */
@Composable
fun HavaTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    MaterialTheme( //ana tema yöneticisi
        colorScheme = if (darkTheme) DarkColors else LightColors,
        typography = HavaTypography,
        content = content
    )
}
