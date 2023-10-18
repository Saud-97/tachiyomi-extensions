package eu.kanade.tachiyomi.extension.ar.aresmanga2

import eu.kanade.tachiyomi.multisrc.mangathemesia.MangaThemesia
import java.text.SimpleDateFormat
import java.util.Locale

class aresmanga2 : MangaThemesia(
    "AresManga (en-aresmanga.com)",
    "https://en-aresmanga.com",
    "ar",
    mangaUrlDirectory = "/series",
    dateFormat = SimpleDateFormat("MMMMM dd, yyyy", Locale("ar")),
) {
    override val mangaUrlDirectory = "/series"
}
