package latiif.hotcorn.app.core

import com.google.gson.GsonBuilder

object EpisodeParser {
    fun String.asEpisode(): Episode {
        val gsonBuilder = GsonBuilder()
        val deserializer = EpisodeDeserializer()
        gsonBuilder.registerTypeAdapter(Episode::class.java, deserializer)
        val customGson = gsonBuilder.create()
        return customGson.fromJson(this, Episode::class.java)
    }
}