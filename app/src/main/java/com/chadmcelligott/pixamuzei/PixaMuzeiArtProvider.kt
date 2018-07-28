package com.chadmcelligott.pixamuzei

import android.net.Uri
import android.util.Log
import com.google.android.apps.muzei.api.provider.Artwork
import com.google.android.apps.muzei.api.provider.MuzeiArtProvider

class PixaMuzeiArtProvider : MuzeiArtProvider() {

    companion object {
        private const val TAG = "PixaMuzeiArtProvider"
    }

    override fun onLoadRequested(initial: Boolean) {
        Log.d(TAG, "onLoadRequested with initial=$initial")

        if (!initial) return

        Log.d(TAG, "calling setArtwork")
        setArtwork(Artwork().apply {
            persistentUri = Uri.parse("https://i.annihil.us/u/prod/marvel/i/mg/3/40/4bb4680432f73.jpg")
            title = "static image"
            byline = "some cool person, c 2018"
            webUri = Uri.parse("https://pixabay.com/en/ballerina-swan-lake-performance-2122473/")
        })
    }
}