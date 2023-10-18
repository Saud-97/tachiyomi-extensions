package eu.kanade.tachiyomi.multisrc.mangathemesia

import generator.ThemeSourceData.SingleLang
import generator.ThemeSourceGenerator

// Formerly WPMangaStream & WPMangaReader -> MangaThemesia
class MangaThemesiaGenerator : ThemeSourceGenerator {

    override val themePkg = "mangathemesia"

    override val themeClass = "MangaThemesia"

    override val baseVersionCode: Int = 27

    override val sources = listOf(
        SingleLang("AresManga (aresnov.org)", "https://aresnov.org", "ar", className = "aresmanga1"),
        SingleLang("AresManga (en-aresmanga.com)", "https://en-aresmanga.com", "ar", className = "aresmanga2"),

    )

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            MangaThemesiaGenerator().createAll()
        }
    }
}
