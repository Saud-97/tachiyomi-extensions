package eu.kanade.tachiyomi.extension.ar.aresmanga1

import eu.kanade.tachiyomi.multisrc.mangathemesia.MangaThemesia
import java.text.SimpleDateFormat
import java.util.Locale

class aresmanga1 : MangaThemesia(
    "AresManga (aresnov.org)",
    "https://aresnov.org",
    "ar",
    mangaUrlDirectory = "/series",
    dateFormat = SimpleDateFormat("MMMMM dd, yyyy", Locale("ar")),
) {
    override val mangaUrlDirectory = "/series"
}
